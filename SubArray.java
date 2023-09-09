public class SubArray {
    public static void SubArray1(int Numbers[]){
        int ts = 0;
        for(int i=0;i<Numbers.length;i++){
            for(int j=i;j<Numbers.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(Numbers[k]+" ");
                }
                ts++;
                 System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Number of Subarrays Are :"+ts);
    }
    public static void main(String[] Args){
        int Numbers[] = {2,4,6,8,10};
        SubArray1(Numbers);
    }
}
