package programs;
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   System.out.println("enter the length of rectangle:");
		   int length = sc.nextInt();
		   System.out.println("enter the width of rectangle:");
		   int width = sc.nextInt();
		   sc.close();
		  
		   int area = length*width;
		   int perimeter=2*(length+width);
		   System.out.println("area of rectangle is:"+area);
		   System.out.println("perimeter of rectangle is:"+perimeter);

	}

}
