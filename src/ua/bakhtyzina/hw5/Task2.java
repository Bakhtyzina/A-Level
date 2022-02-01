package ua.bakhtyzina.hw5;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[12];
        fillRandomArray(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Array elements in descending order: " + ascendingOrDescendingOrder(numbers));
        int[] array = {204, 204, 87, 55, 4, 1, -3};
        System.out.println(Arrays.toString(array));
        System.out.println("Array elements in descending order: " + ascendingOrDescendingOrder(array));
    }

    private static void fillRandomArray(int[] numbers) {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(200);
        }
    }

    private static boolean ascendingOrDescendingOrder(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}