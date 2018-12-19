package programs;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int firstnumber = 0;
	    int secondnumber = 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no to print how many numbers in sequence");
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++)
		{
			System.out.print(firstnumber+" ");
			int sum=firstnumber+secondnumber;
			firstnumber=secondnumber;
			secondnumber=sum;
		}

	}

}
