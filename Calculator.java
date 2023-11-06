import java.util.*;

class Calculator{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter an operator:");
        char op = input.next().trim().charAt(0);

        if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            if(op == '+'){
                System.out.println("The sum of two numbers is: " + (num1 + num2));
            }
            else if(op == '-'){
                if(num1>num2){
                    System.out.println("The Subtraction of two numbers is:" + (num1 - num2));
                }
                else{
                System.out.println("The subtraction of two numbers is" + (num2 - num1));
                }
            }
            else if(op == '*'){
                System.out.println("The Multiplication of two numbers is:" + (num1*num2));
            }
            else if(op == '/'){
                System.out.println("The quotient of the two numbers is:" + (num1/num2));
            }
            else{
                System.out.println("The remainder of the two numbers is after division :" + (num1%num2));
            }
        }
        input.close();
    }
}