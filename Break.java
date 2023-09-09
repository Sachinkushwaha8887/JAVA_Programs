import java.util.*;

public class Break {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        do{
            int num=scan.nextInt();
            if(num%10==0){
                break;
            }
            System.out.println("Accepted");
        }while(true);
        scan.close();
        System.out.println("Out Of Loop");
    }
}