import java.util.*;

public class Input{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		//String input=sc.next();    //Taking the string in a single word
		//System.out.println(input);
		//String input1=sc.nextLine(); //Taking the whole statement
        //System.out.println(input1);
		int number=sc.nextInt();
		System.out.println(number);
		float number1=sc.nextFloat();
		System.out.println(number1);
		boolean bool=sc.nextBoolean();
		System.out.println(bool);
		byte Byte= sc.nextByte();
		System.out.println(Byte);

		sc.close();

	}
}