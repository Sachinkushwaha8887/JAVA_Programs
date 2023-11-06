import java.util.Scanner;

public class Conditional_Loops {
    public static void main(String[] args) {
        /*
         * Syntax for if else conditions:
            if(condition is true){
                body
            }
            else{
                body
            }

            Syntax for more than one conditions:
            if(condition is true){
                body
            }
            else if(condition is true){
                body
            }
            else{
                body
            }
         
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary: ");

        int salary = sc.nextInt();

        if(salary > 10000){
            salary = salary + 2000;
            System.out.println(salary);
        }
        else if(salary < 5000){
            salary = salary +1000;
            System.out.println(salary);
        }
        else{
            salary = salary + 1500;
            System.out.println(salary);
        }
        sc.close();
        */

        /*
            Syntax of for loop:

            for(initialiasation ; condition ; increment/Decrement){
                body
            }

            Syntax of while loop:

            while(condition){
                body
            }

            Syntax of do while loop:

            do{
                body
            }while(condition);

            Note:-
                for loop is used when the range of the given condition is known.
                while loop is used whne range of the condition is not known.
                do while loop is used when the condition is checked at least once.
         */

        Scanner n = new Scanner(System.in);
        System.out.println("Enter the range of the for loop:");

        int N = n.nextInt();
        for(int i = 0; i<N; i++){
            System.out.println("Hello World");
        }

        int M = 0;
        while(M!=5){
            System.out.println("Hello While Loop.");
            M +=1;
        }

        do{
            System.out.println("Hello Do While Loop");
            M +=1;
        }while(M!=6);
        n.close();
    }
}
