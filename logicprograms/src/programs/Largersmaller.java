package programs;
import java.util.*;
public class Largersmaller {

	public static void main(String[] args) {
		int smallest = 0;
	    int largest = 0;
	    int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no of integers");
		int n=sc.nextInt();
		System.out.println("enter a list of  numbers");
		num=sc.nextInt();
		smallest=num;
		for(int i=1;i<n;i++)
		{
			num=sc.nextInt();
			if(num>largest)
			{
				largest=num;
			}
			if(num<smallest)
			{
				smallest=num;
			}
				
		}
		sc.close();
		System.out.println("the largest is:" + largest);
	    System.out.println("Smallest no is : " + smallest);
	}

}
