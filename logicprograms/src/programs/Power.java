package programs;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a base number");
		int num1=sc.nextInt();
		System.out.println("enter a power number");
		int num2=sc.nextInt();
		sc.close();
		System.out.println("power of a given number is :"+Math.pow(num1,num2 ));

	}

}
