import java.util.*;


public class If{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter th AGE:");
		int Age=scan.nextInt();
		scan.close();

		if(Age>18){
			System.out.println("Adult: Vote, Drive");
		}
		else if(Age>13 && Age<18){
			System.out.println("Teenager");
		}
		else{
			System.out.println("Neither Adult nor Teenager");
		}
	}
}