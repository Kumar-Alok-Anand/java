public class CommonDivisors {
    public static void main(String[] args) {
        int num1 = 36, num2 = 60;

        System.out.print("Common divisors of " + num1 + " and " + num2 + " are: ");
        
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
