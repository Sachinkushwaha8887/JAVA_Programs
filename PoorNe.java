import java.util.*;

public class PoorNe{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Give a number: ");
		double number=scan.nextDouble();
		scan.close();
        
        if(number>0){
        	System.out.println("Given Number is Positive.");
        }
        else{
        	System.out.println("Given number is Negative");
        }
	}
}