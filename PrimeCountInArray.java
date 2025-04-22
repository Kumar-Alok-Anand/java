import java.util.Scanner;

public class PrimeCountInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int primeCount = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])) {
                primeCount++;
            }
        }

        System.out.println(primeCount);
        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
