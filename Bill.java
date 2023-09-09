import java.util.*;


public class Bill{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float pencil=sc.nextFloat();
		float pen=sc.nextFloat();
		float sharpener=sc.nextFloat();
		float total=pencil+pen+sharpener;
		float bill=total+(0.18f*total)/100;
		System.out.println("The Grand Total is:"+bill);
		sc.close();
	}
}