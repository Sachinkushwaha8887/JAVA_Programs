import java.util.*;


public class SumOfNAtural{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter any natural number:");
		int n=scan.nextInt();
		scan.close();

		int sum=0;
		int i=0;
		while(i<=n){
			sum=sum+i;
			i++;
		}
		System.out.println("Sum of Natural numbers is:"+sum);
	}
}