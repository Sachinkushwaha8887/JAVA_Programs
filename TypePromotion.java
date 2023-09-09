public class TypePromotion{
	public static void main(String[] args) {
		char a='a';
		char b='b';
		int c=b-a;
		//char d=b-a;   //not allowed
		System.out.println(c);
		System.out.println(a);
		System.out.println((int)(a));
		System.out.println((int)(b));

		//char d=(char)(b-a);   //data lossy conversion
		byte e=10;
		short f=11;
		int g=e+f;
		System.out.println(g);


		long h=25;
		float i=23.6f;
		double j=35.7;
		double k=h+i+j;
		System.out.println(k);
	}
}