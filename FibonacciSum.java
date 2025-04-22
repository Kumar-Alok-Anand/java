public class FibonacciSum {
    public static void main(String[] args) {
        int N = 10; 
        int first = 0, second = 1, sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += first;
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println("The sum of the first " + N + " Fibonacci numbers is: " + sum);
    }
}
