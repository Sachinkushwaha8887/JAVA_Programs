import java.util.*;

public class Continue {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        do{
            int number=sc.nextInt();
            sc.close();
            if(number%10==0){
                System.out.println("Enter again:");
                continue;
            }
            else{
                System.out.println(number+" is Accepted");
            }
        }while(true);
    }
}
