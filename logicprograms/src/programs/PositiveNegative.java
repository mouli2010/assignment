package programs;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int number=sc.nextInt();
		sc.close();
        if ( number >0)
            System.out.println(number + " is a positive number.");
          else if  (number <0)
        System.out.println(number + " is a negative number."); 
        else
            System.out.println(number + " is zero");

	}

}
