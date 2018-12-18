package programs;
import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		sc.close();
		int i=1,res=0;
		while(i<=10)
		{
			res=num*i;
			System.out.println(num+"x"+i+"=" +res);
			i++;
		}
		
		

	}

}
