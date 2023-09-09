import java.util.*;;

public class FactLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter any integer number:");
        int number=sc.nextInt();
        sc.close();
        int fact=1;
        if(number>=0){ 
            for(int i=1;i<=number;i++){
            fact=fact*i;
            }
        }
        else{
            fact=0;
        }
        System.out.println("The factorial of the given number is:"+fact);
    }
}
