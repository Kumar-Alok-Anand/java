public class ExcludeMultiples {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                continue;  // Skip multiples of 3 or 5
            }
            System.out.println(i);
        }
    }
}
