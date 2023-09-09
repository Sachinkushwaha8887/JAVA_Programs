import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a;
        a=new int[5];

        int ar[];
        for(int i=0;i<=5;i++){
            int ele=sc.nextInt();
            ar[i]=ele;
        }
        for(int j=0;j<ar.length;j++){
            System.out.println(a[j]);
        }
    }
}
