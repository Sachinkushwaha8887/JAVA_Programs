import java.util.*;

public class Ternary{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter any number:");
		int number=scan.nextInt();
		String status=(number%2==0)?"Even":"odd";
		System.out.println(status);
		scan.close();

	}
}