import java.util.Scanner;

public class StarXPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // Size of the pattern (must be odd)

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j == i || j == N - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
