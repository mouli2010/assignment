package programs;

import java.util.Scanner;

public class Palindromestring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   System.out.println("enter a string");
		   String string=sc.nextLine();
		   StringBuffer sb=new StringBuffer(string);
		   String reversestring=sb.reverse().toString();
		   if(string.equals(reversestring))
		   {
			   System.out.println("given string is a palindrome");
			 
		   }
		   else
		   {
			   System.out.println("given string is a not palindrome");
		   }
		   sc.close();
		   

	}

}
