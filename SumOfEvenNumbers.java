public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int N = 10;  // You can change N to any value
        int sum = 0;

        for (int i = 2; i <= N; i += 2) {
            sum += i;
        }

        System.out.println("Sum of even numbers from 1 to " + N + " is: " + sum);
    }
}
