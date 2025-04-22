public class AverageArray {
    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};
        int sum = 0;
        double average;

        for (int num : numbers) {
            sum += num;
        }

        average = (double) sum / numbers.length;

        System.out.println("The average is: " + average);
    }
}
