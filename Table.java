import java.util.*;

public class Table {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any integer number:");
        int n=sc.nextInt();
        sc.close();

        System.out.println("The table of the given number is:");

        for(int i=1;i<=10;i++)
        {
            int b=n*i;
            System.out.println(n+"x"+i+"="+b);
        }
    }
}
