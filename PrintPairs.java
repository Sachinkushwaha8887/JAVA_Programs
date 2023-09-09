public class PrintPairs {
    public static void PairsArray(int Numbers[]){
        int tp = 0;
        for (int i = 0; i < Numbers.length;i++){
            for (int j = i+1; j < Numbers.length ; j++){
                System.out.print("("+Numbers[i]+","+Numbers[j]+")");
                tp++;
            }
             System.out.println();
        }
        System.out.println("Total Number of Pairs are :"+tp);
    }
    public static void main(String[] Args){
        int Numbers[] = {2,4,6,8,10};
        PairsArray(Numbers);
    }
}
