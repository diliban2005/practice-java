import java.util.Scanner;
public class saddle {
    public static void main(String[] args) {
		int n = 3;
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[n][n];
		System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        boolean found = false;
        for (int i = 0; i < n; i++) {
            int min = a[i][0];
            int col = 0;
            for (int j = 1; j < n; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                    col = j;
                }
            }
            boolean saddle = true;
            for (int k = 0; k < n; k++) {
                if (a[k][col] > min) {
                    saddle = false;
                    break;
                }
            }
            if (saddle) {
                System.out.println("Saddle Point = " + min);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No Saddle Point");
        }
    }
}