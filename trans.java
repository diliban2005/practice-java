import java.util.*;
class trans{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[][]= new int [3][3];
		int add[][]= new int [3][3];
		System.out.println("Enter the arr1 :");
		for (int i = 0; i<3; i++){
			for (int j = 0 ;j <3 ;j++){
				arr[i][j]= sc.nextInt();
			}
		}
		System.out.println("The transpose is :");
		for (int i = 0; i<3; i++){
			for (int j = 0 ;j <3 ;j++){
				add[i][j]=arr[j][j];
				System.out.print(add[i][j]);
			}
			System.out.println(" ");
		}
	}
}