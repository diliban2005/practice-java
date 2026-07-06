import java.util.*;
class insert{
	public static void main(String[] args){
		int arr[] = {9,5,1,4,6,3};
		int n = arr.length;
		for (int i = 0; i<n ;i++){
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j]>key){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		System.out.println("sorted Array:");
		for (int x:arr){
			System.out.print(x+" ");
		}
	}
}