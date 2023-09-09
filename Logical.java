public class Logical{
	public static void main(String[] args) {
		int a=10;
		int b=5;

		//Logical And
		System.out.println((a>b)&&(b<a));
		System.out.println((a>b)&&(b>a));
		System.out.println((a<b)&&(b<a));
		System.out.println((a<b)&&(b>a));

		//Logiacl OR
		System.out.println((a>b)||(b<a));
		System.out.println((a>b)||(b>a));
		System.out.println((a<b)||(b<a));
		System.out.println((a<b)||(b>a));

		//Logical not
		System.out.println(!(a>b));
	}
}