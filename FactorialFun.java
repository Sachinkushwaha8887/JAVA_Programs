import java.util.*;
public class FactorialFun {
    

    //Defining the factorial function
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=factorial(n);
        System.out.println("The factorial of given number is: "+c);
    }
}
