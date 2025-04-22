public class Divisors {
    public static void main(String[] args) {
        int number = 36;

        System.out.println("Divisors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
