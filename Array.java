import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] ar;
        ar=new int[6];
        
        System.out.println("Enter the value of the Array:");
        for(int i=0;i<6;i++){
            int ele=sc.nextInt();
            ar[i]=ele;
        }
        System.out.println("The Array is: ");

        for(int j=0;j<ar.length;j++){
            System.out.print(" "+ar[j]);
        }
        sc.close();
    }
}
