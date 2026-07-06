class twosum{
    static boolean Twosum(int[] arr, int target){
	int left = 0;
	int right = arr.length - 1;
	while (left < right){
		int sum = arr[left]+arr[right];
		if (sum  == target)
			return true;
		else if ( sum < target)
			left++;
		else
			right--;
	}
	return false;
}
public static void main(String[] args){
		int arr[] = {1,2,5,8};
		int target = 999;
		if(Twosum(arr, target)){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}
	
}
			
			
	