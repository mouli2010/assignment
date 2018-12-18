package programs;

import java.util.Scanner;

public class Arithmeticoperators {
	 public static void main(String args[])
	   {   
	        Scanner sc = new Scanner(System.in);
	            
	            System.out.print("Enter the first number : ");
	            int x = sc.nextInt();
	            System.out.print("Enter the second number : ");
	            int y = sc.nextInt();
	            System.out.println("choose 1 for add");
	            System.out.println("choose 2 for sub");
	            System.out.println("choose 3 for mul");
	            System.out.println("choose 4 for div");
	            System.out.println("choose 5 for mod");
	            System.out.println("choose 6 for exit");
	            int n = sc.nextInt();sc.close();
	            switch(n)
	            {
	                case 1:
	                int add = x + y;
	                System.out.println(" addition of given numbers : "+add);
	                break;
	 
	                case 2:
	                
	                int  sub = x - y;
	                System.out.println("subtraction of given numbers : "+sub);
	                break;
	 
	                case 3:
	                
	                int mul = x * y;
	                System.out.println("multiplication  of given numbers : "+mul);
	                break;
	 
	                case 4:
	                
	               float  div =  x / y;
	                System.out.print("division of given numbers  : "+div);
	                break;
	 
	                case 5:
	                               
	               int  mod = x % y;
	                System.out.println("modilus of given numbers : "+mod);
	                break;
	 
	                case 6:
	                System.exit(0);
	            }
	        }

}
