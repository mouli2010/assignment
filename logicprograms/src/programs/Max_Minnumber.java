package programs;

import java.util.Scanner;

public class Max_Minnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2= sc.nextInt();
        if(num1>num2)
        {
        	System.out.println("max number is"+num1);
        }
        else
        {
        	System.out.println("min number is"+num2);
        }

	}

}
