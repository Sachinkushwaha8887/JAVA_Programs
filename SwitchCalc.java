import java.util.*;


public class SwitchCalc{
	public static void main(String[] args) {


		Scanner Scan = new Scanner(System.in);

		System.out.print("1.Addition\n2.Subtraction\n3.Product\n4.Division\n5.Remainder\n");

		System.out.print("Enter your choice: ");
		int choice = Scan.nextInt();

		System.out.print("Enter first digit: ");
		double a = Scan.nextDouble();

		System.out.print("Enter the Second digit: ");
		double b = Scan.nextDouble();

		switch (choice) {
			case 1:
				System.out.println("The Sum of two numbers is" + (a + b));
				break;
			case 2:
				System.out.println("The diffrence of two numbers is:" + (a - b));
				break;
			case 3:
				System.out.println("The product of two numbers is:" + (a * b));
				break;
			case 4:
				System.out.println("The division of two numbers is:" + (a / b));
				break;
			case 5:
				System.out.println("The remainder of two numbers is:" + (a % b));
				break;
			default:
				System.out.println("Invalid input try again!");
		}
		Scan.close();
	}
}
