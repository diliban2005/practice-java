import java.util.*;
class binary{
	public static void main(String[] args){
	int arr[] = {1,2,3,4,5,6,7};
	int target = 6;
	int first = 0;
	int last = arr.length - 1;
	while(first <= last){
	int mid = (first + last) / 2;
	if (arr[mid] == target){
		System.out.println(mid);
		break;
	}
	else if(target < arr[mid]){
		last=mid-1;
	}
	else{
		first=mid+1;
	}
}
}
}