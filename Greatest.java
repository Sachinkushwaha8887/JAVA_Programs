import java.util.*;

public class Greatest{
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.print("Enter the value of First number:");
		int a=scan.nextInt();
		System.out.print("\nEnter the value of First number:");
		int b=scan.nextInt();
		System.out.print("\nEnter the value of First number:");
		int c=scan.nextInt();
		scan.close();

		if(a>b && a>c){
			System.out.println(a+"is the greates number");
		}
		else if(b>c){
			System.out.println(b+"is the greatest number");
		}
		else{
			System.out.println(c+" is the greatest number");
		}
	}
}