public class SumOfSquares {
    public static void main(String[] args) {
        int N = 5;
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i * i;
        }

        System.out.println("Sum of squares of the first " + N + " natural numbers is: " + sum);
    }
}
