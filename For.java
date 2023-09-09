import java.util.*;

public class For{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=scan.nextInt();
		scan.close();

		for(int i=0;i<=n;i++){
			System.out.println("Hello world");
		}
	}
}