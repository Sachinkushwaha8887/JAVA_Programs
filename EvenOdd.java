import java.util.Scanner;

public class EvenOdd{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter any number:");
		int num=scan.nextInt();
		scan.close();

		if(num%2==0){
			System.out.println("Given Number is even.");
		}
		else{
			System.out.println("Given number is odd.");
		}
	}
}