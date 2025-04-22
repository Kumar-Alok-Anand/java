import java.util.Scanner;

public class SumOfDigitsDivisibleBy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        int sum = 0;
        
        while (num != 0) {
            int digit = num % 10;
            if (digit % 3 == 0) {
                sum += digit;
            }
            num /= 10;
        }
        
        System.out.println("Sum of digits divisible by 3: " + sum);
        scanner.close();
    }
}
