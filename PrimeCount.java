public class PrimeCount {
    public static void main(String[] args) {
        int n = 20;
        int count = 0;

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }

        System.out.println("Number of prime numbers up to " + n + " is: " + count);
    }
}
