public class PrimeSum {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for (int num = 2; count < 20; num++) {
            if (isPrime(num)) {
                sum += num;
                count++;
            }
        }

        System.out.println("Sum of the first 20 prime numbers is: " + sum);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
