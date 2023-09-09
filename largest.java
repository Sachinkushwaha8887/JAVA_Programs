import java.util.*;

public class largest{
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the value of first number:");
		int a=scan.nextInt();

		System.out.print("\nEnter the value of second number:");
		int b=scan.nextInt();
		scan.close();

		if(a>b){
			System.out.println("First Number is greater than second.");
		}
		else{
			System.out.println("Second number is greater than first.");
		}
	}
}