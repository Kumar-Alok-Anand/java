import java.util.Scanner;

public class DigitOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        int[] digitCount = new int[10];
        
        while (num != 0) {
            int digit = num % 10;
            digitCount[digit]++;
            num /= 10;
        }
        
        for (int i = 0; i < 10; i++) {
            if (digitCount[i] > 0) {
                System.out.println(i + " appears " + digitCount[i] + " times.");
            }
        }

        scanner.close();
    }
}
