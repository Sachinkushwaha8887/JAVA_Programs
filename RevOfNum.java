//import java.util.*;

public class RevOfNum{
	public static void main(String[] args) {
		//Last digit number : num%10
		//remove last digit of number: num/10

		int n=10899;
		while(n>0){
			int lastdigit=n%10;
			System.out.print(lastdigit+" ");
			n=n/10;
		}
		System.out.println();
	}
	
}