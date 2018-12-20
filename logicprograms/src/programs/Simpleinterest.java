package programs;

import java.util.Scanner;

public class Simpleinterest {

	public static void main(String[] args) {
		int principle,time,rate;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter priniciple Value  : ");
        principle = sc.nextInt();
        System.out.print("enter  a time: ");
        time = sc.nextInt();
        System.out.print("enter rate of interest : ");
        rate = sc.nextInt();
        System.out.println("simpleinterest is:"+(principle*time*rate)/100);

	}

}
