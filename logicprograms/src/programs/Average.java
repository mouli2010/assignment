package programs;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a first number");
		int num1=sc.nextInt();
		System.out.println("enter a second  number");
		int num2=sc.nextInt();
		System.out.println("enter a third  number");
		int num3=sc.nextInt();
		sc.close();
		System.out.println("average of a three numbers:"+(num1+num2+num3)/3.0);

	}

}
