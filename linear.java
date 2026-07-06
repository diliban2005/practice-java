import java.util.*;
class linear{
	public static void main(String[] args){
		int arr[] = {2,4,5,6,9};
		int target = 4;
		for (int i = 0; i<arr.length; i++){
			if(arr[i] == target){
				System.out.print(i);
				return;
			}
		}
		System.out.print(-1);
	}
}