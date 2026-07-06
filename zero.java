import java.util.*;
class zero {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
		System.out.print("Enter the Count of number:");
        int n = s.nextInt();
        int arr[] = new int [n];
		System.out.print("Enter the number:");
        for (int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
		int count = 0;
        for (int i = 0; i<n; i++){
            if (arr[i] != 0){
                System.out.print(arr[i]+" ");
            }
			else{
            count++;
			}
        }
        while (count > 0){
            System.out.print(" 0");
            count --;
        }
    }
}