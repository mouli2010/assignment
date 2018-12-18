package programs;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a radious");
		int radius=sc.nextInt();
		System.out.println("area of a given circle :"+(2*Math.PI*radius));
		System.out.println("circumference of a given circle :"+(Math.PI*radius*radius));
	}

}
