package programs;
import java.util.Scanner;

public class PermutationCombinationOfNumbers {
	 public static int fact(int num)
	    {
	    	
	        int fact=1, i;
	        for(i=1; i<=num; i++)
	        {
	            fact = fact*i;
	        }
	        return fact;
	    }

	public static void main(String[] args) {
		int n, r;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Value of n : ");
        n = sc.nextInt();
        System.out.print("enter Value of r : ");
        r = sc.nextInt();
        sc.close();
        System.out.println("combination of the numbers is : " +(fact(n)/(fact(n-r)*fact(r))));
        System.out.println("permutation of the numbers is : " +(fact(n)/(fact(n-r))));
    }

	}


