import java.util.*;

public class PassOrFail{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the marks :");

		int marks=scan.nextInt();
		scan.close();
		String Status=(marks>=33)?"Pass":"Fail";
		System.out.println(Status);
	}
}