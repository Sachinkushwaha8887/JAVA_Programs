// User function Template for Java

import java.util.Arrays;

class Solution1 {
    public static void main(String[] args) {
        
    
    
    //int MissingNumber(int array[], int n) {
        // Your Code Here
        int array[]={6,1,2,8,3,4,7,10,5};
        int n=10;
        Arrays.sort(array);
        int missing;
        for(int i = 0; i<n-1; i++){
            if(array[i]==(i+1)){
                continue;
            }else{
                missing = (i+1);
                System.out.println(missing);
            }
        }
        //System.out.println(n);
    }
}
