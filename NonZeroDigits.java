import java.util.Scanner;

public class NonZeroDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        int count = 0;
        
        while (num != 0) {
            int digit = num % 10;
            if (digit != 0) {
                count++;
            }
            num /= 10;
        }
        
        System.out.println("Number of non-zero digits: " + count);
        scanner.close();
    }
}
