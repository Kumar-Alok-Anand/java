public class SumOfOddDigits {
    public static void main(String[] args) {
        int number = 123456;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            number /= 10;
        }

        System.out.println("The sum of odd digits is: " + sum);
    }
}
