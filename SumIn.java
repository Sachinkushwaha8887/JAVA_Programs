import java.util.*;

public class SumIn{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first integer number:");
        int number = sc.nextInt();
        System.out.print("Enter second number is:");
        int number1 =sc.nextInt();
        int sum = number + number1;
        sc.close();
        System.out.println("The sum of two number is:"+sum);
        for (int i=0;i<=number;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}