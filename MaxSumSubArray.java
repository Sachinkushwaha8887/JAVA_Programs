public class MaxSumSubArray {
    public static void MaxSum(int Numbers[]){
        int CurrSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for(int i = 0; i<Numbers.length; i++){
            for (int j = i; j<Numbers.length; j++){
                CurrSum=0;
                for (int k = i;k<=j;k++){
                    CurrSum+=Numbers[k];
                }
                System.out.println(CurrSum);
                if(MaxSum<CurrSum){
                    MaxSum=CurrSum;
                }
            }
        }
        System.out.println("The MaxSum of the SubArray is :"+MaxSum);
    }
    public static void main(String[] args) {
        int Numbers[]={1,-2,6,-1,3};
        MaxSum(Numbers);
    } 
}
