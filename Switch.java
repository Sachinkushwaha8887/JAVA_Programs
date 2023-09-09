import java.util.*;

public class Switch{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the choice between 1 to 3: ");
		int choice=scan.nextInt();

		switch(choice){
		case 1: System.out.println("Samosa");
			break;
		case 2: System.out.println("Burger");
			break;
		case 3: System.out.println("Mango shake");
			break;
		default : System.out.println("We are dreaming!");
		}


		System.out.print("Enter any choice between a to c: ");
		char ch=scan.next().charAt(1);

		switch(ch){
		case 'a': System.out.println("B.tech");
			break;
		case 'b': System.out.println("Bsc");
			break;
		case 'c': System.out.println("B.A.");
			break;
		default : System.out.println("Try Again");
		}
		scan.close();
	}
}