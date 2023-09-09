import java.util.Scanner;


public class ITcalc{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Your Annual Income:");
		int Income=scan.nextInt();
		int tax;
		scan.close();

		if(Income<500000){
			tax=0;
		}
		else if(Income>500000 && Income<1000000){
			tax=(Income*20)/100;
		}
		else{
			tax=(Income*30)/100;
		}
		System.out.println("Your tax is:"+tax);
	}
}