import java.util.Scanner;

public class CountDigitsInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int num : numbers) {
            int count = 0;
            int temp = Math.abs(num);
            do {
                temp /= 10;
                count++;
            } while (temp != 0);
            System.out.println(num + " has " + count + " digits");
        }
    }
}
