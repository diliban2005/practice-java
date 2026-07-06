//LASTQUEUE
import java.util.*;
class kdigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = 5;
		System.out.print("Enter elements:");
		int arr[] = new int[n];
		for (int i = 0;i < n; i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter k:");
		int k = sc.nextInt();
		int a = n - k;
	ArrayDeque<Integer> q1 = new ArrayDeque<>();
	Stack<Integer> s = new Stack<>();
	for (int i = 0; i < n-k ;i++){
		q1.addLast(arr[i]);
	}
	for (int i = n-k; i < n; i++){
		s.push(arr[i]);
	}
	while (!s.isEmpty()){
		q1.addLast(s.pop());
	}
	while (!q1.isEmpty()){
		System.out.print(q1.pollFirst()+ " ");
	}
}
}