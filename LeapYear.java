import java.util.*;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.print("Enter your Year: ");
		int Year=scan.nextInt();
		scan.close();

		if(Year%4==0){
			if(Year%100==0){
				if(Year%400==0){
					System.out.println("LeapYear");
				}
				else{
					System.out.println("Not a LeapYear");
				}
			}
			else{
				System.out.println("LeapYear");
			}
		}
		else{
			System.out.println("Not a leap year");
		}
	}
	
}