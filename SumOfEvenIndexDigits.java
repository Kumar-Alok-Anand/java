import java.util.Scanner;

public class SumOfEvenIndexDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        int sum = 0;
        String numStr = Integer.toString(num);
        
        for (int i = 0; i < numStr.length(); i++) {
            if (i % 2 == 0) {
                sum += numStr.charAt(i) - '0';  // Convert the character to digit and add to sum
            }
        }
        
        System.out.println("Sum of digits at even indexes: " + sum);
        scanner.close();
    }
}
