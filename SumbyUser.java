import java.util.*;

public class SumbyUser{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();

		sc.close();
		int Sum=num1+num2;
		System.out.println(Sum);
		int product=num1*num2;
		System.out.println(product);
	}
}