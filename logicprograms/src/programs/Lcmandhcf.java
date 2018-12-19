package programs;

import java.util.Scanner;

public class Lcmandhcf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   System.out.println("enter the first number:");
		   int number1 = sc.nextInt();
		   System.out.println("enter the second number:");
		   int number2 = sc.nextInt();
		   int hcf=0;
		   for(int i = 1; i <= number1 && i <= number2; i++)
	        {
	          
	            if(number1 % i == 0 && number2 % i == 0)
	                hcf = i;
	        }

	        int lcm = (number1 * number2) / hcf;
	        System.out.println("lcm of a numbers:"+lcm);
	        System.out.println("hcf of a numbers:"+hcf);
		   

	}

}
