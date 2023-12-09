import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr[][] = new int[3][3];
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                int x = scanner.nextInt();
                arr[i][j] = x;
            }
        }
        scanner.close();
    }
}
