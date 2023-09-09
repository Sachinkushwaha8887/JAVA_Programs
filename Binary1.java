import java.util.*;

class Binary2{
	public static int BinarySearch(int Array[],int Key){
		int start=0;
		int end=Array.length-1;
		while(start<=end){
			int mid = (start + end)/2;

			if(Array[mid]==Key){
				return mid;
			}
			if(Array[mid]<Key){
				start=mid+1;
			}
			else{
				end=mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int Array[]={2,4,6,8,9,10};
		int Key=10;
		System.out.println("Index for Key is :"+ BinarySearch(Array,Key));
	}
}