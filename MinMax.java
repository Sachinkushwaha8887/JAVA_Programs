//import java.util.*;
public class MinMax{
	public static void main(String[] args) {
		int arr[]={3,2,1,156,10000,165};
		int m=arr[0];
		int n=arr[0];
		//int siz=arr.length;
		int i=0;

		for(i=0;i<= arr.length;i++){
			if(n>=arr[i]){
				System.out.println("Maximum element is:"+n);
			}
			else{
				n=arr[i];
			}
			System.out.println(n);
			if(m>=arr[i]){
				System.out.println("Minimum value is:"+arr[i]);
			}
			else{
				m=arr[i];
			}
		}

	}
}