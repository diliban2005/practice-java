import java.util.*;
class praveeen{
	public static void main(String[] args){
	int arr[] = {12,15,17,19,20,5,7,9};
	int first = 0;
	int last = arr.length - 1;
	while(first <= last){
	int mid = (first + last) / 2;
	if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
		System.out.println(mid);
		return;
	}
	else if(arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]){
		first = mid + 1;
	}
	else{
		last = mid - 1;
	}
}
System.out.print(-1);
}
}