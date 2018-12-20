package programs;

import java.util.Scanner;

public class Quadraticequation {

	public static void main(String[] args) {
		int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Value of a : ");
        a= sc.nextInt();
        System.out.print("enter Value of b : ");
        b = sc.nextInt();
        System.out.print("enter Value of c : ");
        c = sc.nextInt();
        sc.close();
        double root1,root2;
        double determinent=(b*b) - (4*a*c);
        if(determinent>0)
        {
        	root1=-b+(Math.sqrt(determinent)/(2*a));
        	root2=-b-(Math.sqrt(determinent)/(2*a));
        	System.out.println(root1);
        	System.out.println(root2);
        }

        else  if(determinent==0)
        {
        	root1=-b/(2*a);
        	System.out.println(root1);
        }
         else 
         {
        	 System.out.println("roots are imaginary");
         }
        	 
	}

}
