import java.util.*;

public class EvenOddSum1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        int choice;
        int evenSum=0;
        int oddSum=0;

        do{
            System.out.println("Enter the any:");
            number=sc.nextInt();
            if(number%2==0){
                evenSum=evenSum+number;
            }
            else{
                oddSum=oddSum+number;
            }
            System.out.println("Enter choice 1 for continue and 0 to stop the execution:");
            choice=sc.nextInt();
        }while(choice==1);
        sc.close();
        System.out.println("The sum of all even numbers is:"+evenSum);
        System.out.println("The sum of all odd numbers is:"+oddSum);
    }
    
}
