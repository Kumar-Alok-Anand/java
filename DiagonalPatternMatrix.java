import java.util.Scanner;

public class DiagonalPatternMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        int value = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = value++;
            }
        }

        for (int d = 0; d <= 2 * (n - 1); d++) {
            for (int i = 0; i < n; i++) {
                int j = d - i;
                if (j >= 0 && j < n) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
