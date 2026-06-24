import java.util.*;
class spiral{
	public static void main(String[] args){
		int n = 3;
		Scanner sc = new Scanner(System.in);
		int arr[][]= new int [3][3];
		int top[][]= new int [3][3];
		System.out.println("Enter the arr1 :");
		for (int i = 0; i<3; i++){
			for (int j = 0 ;j <3 ;j++){
				arr[i][j]= sc.nextInt();
			}
		}
		int top = 0;
		int bottom = n - 1;
		int left = 0;
		int right = n - 1;
		for (int i= left;  i <=right ;i++){

		System.out.println(arr[top][i]+ " ");
		}
	
			System.out.println(" ");
		}
	}

