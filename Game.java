import java.util.Random;
import java.util.Scanner;

class Game{
    int number;
    int userno;
    int noOfTry=0;
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
        // System.out.println(number);
    }

    public void takingInput(){
        Scanner sc = new Scanner(System.in);
        userno = sc.nextInt();
    }

    public boolean isCorrect(){
        noOfTry++;
        if(userno == number){
            System.out.println("Congratulation  , You guess the right number "+number+" in "+noOfTry+" attempt !!");
            // System.out.print("");
            noOfTry = 0;
            return true;
        }else if(userno>number){
            System.out.println("your number is too high");
        }else if(userno<number){
            System.out.println("Your number is too low");
        }
        return false;
    }
}


class numberGame{
    public static void main(String[] args) {
        int champ = 3;
        System.out.println("\u2591_\u2591_\u2591_\u2591_\u2591_\u2591G\u2591U\u2591E\u2591S\u2591S\u2591-\u2591T\u2591H\u2591E\u2591-\u2591N\u2591U\u2591M\u2591B\u2591E\u2591R\u2591_\u2591_\u2591_\u2591_\u2591_\u2591_\u2591");
        System.out.println("yOU HAVE ONLY 5 ATTEMPT EACH ROUND");
        System.out.println("THERE IS 3 ROUND");
        boolean result = false;
        for(int j=1;j<=3;j++){
            Game gg = new Game();
            System.out.format("*****[R][O][U][N][D] [%d]*******\n", j);
            System.out.println("****Enter any number between 1 to 100.***");
            for(int i=0;i<5;i++){
                gg.takingInput();
                result = gg.isCorrect();
                if(result == true){
                    break;
                }
            }
            if(!result){
                champ--;
                System.out.println("You lose this Round.");
            }
        }
        System.out.println();
        System.out.println();
        if(champ<2){
            System.out.println("YOU LOSE THIS GAME , BETTER LUCK NEXT TIME");
        }else{
            System.out.println("YOU WON THIS GAME , Congratulation ");
        }
        
    }
}