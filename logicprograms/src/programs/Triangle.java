package programs;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a triangle base");
		int base=sc.nextInt();
		System.out.println("enter a triangle height");
		int height=sc.nextInt();
		sc.close();
		System.out.println("area of triangle is:"+(base*height)/2);

	}

}
