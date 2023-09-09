import java.util.*;


public class OneTon{
	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.print("Enter any number:");
		int n=Scan.nextInt();
        Scan.close();

        int counter=0;
		while(counter<=n){
			System.out.println(counter);
			counter+=1;
		}
	}
}