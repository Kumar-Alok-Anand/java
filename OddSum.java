import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (2 * i + 1);
        }
        
        System.out.println(sum);
        scanner.close();
    }
}
