package programs;

public class Sumofinteger {

	public static void main(String[] args) {
		int num = 12345, sum= 0;

        while(num != 0) {
            int digit = num % 10;
            num /= 10;
            sum=sum+digit;

	}
        System.out.println(" sum of individual digits of a positive integer." +sum);

}
}