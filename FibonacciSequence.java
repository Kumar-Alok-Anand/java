import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // Number of Fibonacci terms to display
        
        int a = 0, b = 1;
        int count = 0;

        while (count < N) {
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
            count++;
        }

        scanner.close();
    }
}
