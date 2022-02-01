import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        double[] numbers = new double[12];
        fillRandomArray(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Cost of goods = " + costGoods(numbers));
    }

    private static void fillRandomArray(double[] numbers) {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextDouble(2000);
        }
    }

    private static double costGoods(double[] numbers) {
        double summ = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 1000) {
                summ += numbers[i];
            }
        }
        return summ;
    }
}
