public class FunOver {
    public static int sum(int a, int b){
        int temp=a+b;
        return temp;
    }
    public static int sum(int a, int b, int c){
        int temp=a+b+c;
        return temp;

    }
    public static int sum(int a, int b, int c, int d){
        int temp=a+b+c;
        System.out.println(temp);
        return 1;
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int d=25;
        float e=30.5f;  
        sum(a,b,c,d);
        
    }
}
