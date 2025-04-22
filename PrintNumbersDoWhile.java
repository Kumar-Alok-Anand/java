import java.util.Scanner;

public class PrintNumbersDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= N);
    }
}
