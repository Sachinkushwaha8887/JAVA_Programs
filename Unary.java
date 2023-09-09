public class Unary{
	public static void main(String[] args) {
		//pre increment
		int a=10;
		int b=++a;
		System.out.println(a);    //11
		System.out.println(b);    //11

		//post increment
		int c=20;
		int d=c++;
		System.out.println(c);    //21
		System.out.println(d);    //20

		//pre decrement
		int e=30;
		int f=--e;
		System.out.println(e);    //29
		System.out.println(f);    //29

		//post decrement
		int g=40;
		int h=g--;
		System.out.println(g);    //39
		System.out.println(h);    //40
	}
}

