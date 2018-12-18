package programs;
import java.util.*;
public class exponential {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		sc.close();
		System.out.println("exponential of a given number is :"+Math.exp(num));

	}

}
