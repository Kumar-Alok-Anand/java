public class PrimeNumbers {
    public static void main(String[] args) {
        int N = 30;  // You can change N to any value
        System.out.println("Prime numbers from 1 to " + N + ":");

        for (int num = 2; num <= N; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
