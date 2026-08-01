public class MaxArray {
    public static void main(String[] args) {

        int[] numbers = {10, 25, 7, 45, 18, 32};

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum element = " + max);
    }
}