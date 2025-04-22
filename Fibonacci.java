public class Fibonacci {
    public static void main(String[] args) {
        int N = 10; 
        int first = 0, second = 1;

        System.out.println("Fibonacci series up to " + N + " terms:");
        
        for (int i = 1; i <= N; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
