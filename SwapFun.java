//import javax.sound.midi.Soundbank;

public class SwapFun {

    public static int Swap(int a, int b){
        System.out.println("The value of a is before swaping :"+a);
        System.out.println("The value of b is before swaping:"+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("The value of a is after swaping:"+a);
        System.out.println("The value of b is after swaping:"+b);
        return 0;
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        Swap(a,b);
        
    }
}
