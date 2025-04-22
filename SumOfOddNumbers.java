public class SumOfOddNumbers {
    public static void main(String[] args) {
        int N = 10;  // You can change N to any value
        int sum = 0;
        int i = 1;

        while (i <= N) {
            sum += i;
            i += 2;  // Increment by 2 to get the next odd number
        }

        System.out.println("Sum of odd numbers from 1 to " + N + " is: " + sum);
    }
}
