import java.util.Scanner;

public class ReverseMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int i = size; i >= 1; i--) {
            for (int j = size; j >= 1; j--) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
