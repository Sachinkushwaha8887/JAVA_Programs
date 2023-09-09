public class PrefixSubArray {
    public static void MaxSubArray2(int Numbers[]){
        int CurrSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        int prefix[] = new int[Numbers.length];
        prefix[0]=Numbers[0];
        for (int i=0;i<prefix.length;i++){
        prefix[i]=prefix[i-1]+Numbers[i];   
        }
    }
    
}
