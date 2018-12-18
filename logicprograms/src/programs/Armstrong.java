package programs;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int number=sc.nextInt();
		sc.close();
int temp=number;
       int  remainder;
	double result = 0;


        while (number != 0)
        {
            remainder = number % 10;
            result =result+ (remainder*remainder*remainder);
            number =number/ 10;
        }

        if(result == temp)
            System.out.println(temp + " is an Armstrong number.");
        else
            System.out.println(temp + " is not an Armstrong number.");
    }
	}


