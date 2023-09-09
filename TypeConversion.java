public class TypeConversion{
	public static void main(String[] args) {
		int a=10;
		int b=23;
		float c=a+b;    //Allowed implicitely
		System.out.println(c);
		float d=12.3f;
		float e=15.3f;
		float f=d+e;
		//int f=d+e;   // Don't Allowed beacuse of explicitely conversiion Incompatible conversion
		System.out.println(f);
		
	}
}