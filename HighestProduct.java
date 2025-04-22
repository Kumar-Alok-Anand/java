import java.util.Arrays;
import java.util.Scanner;

public class HighestProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(highestProduct(arr));
        scanner.close();
    }

    public static int highestProduct(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int product1 = arr[n - 1] * arr[n - 2];
        int product2 = arr[0] * arr[1];
        int product3 = arr[0] * arr[1] * arr[n - 1];

        return Math.max(Math.max(product1, product2), product3);
    }
}
