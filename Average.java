import java.util.*;

public class Average{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int sum=(A+B+C);
		int Avg=sum/3;
		System.out.println(Avg);
		sc.close();
	}
}