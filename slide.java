import java.util.*;
class slide{
	public static void main(String[] args){
		int n = 7;
		int arr[] = {-2, 1, -3, 4, -1, 2,5};
			int k = 3;
			int sum = 0;
			for (int i = 0; i < k; i++){
				sum+=arr[i];
			}
			int max=sum;
			for(int j=k; j < n; j++){
				sum = (sum-arr[j-k])+arr[j];
				max=Math.max(max,sum);
			}
			System.out.print(max);
		}
}
