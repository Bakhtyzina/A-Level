package ua.bakhtyzina.hw4;

import java.util.Arrays;

public class Task2Task3 {
    public static void main(String[] args) {
        int[] numbers = generateArray();
        primeNumber(numbers);
        compositeNumber(numbers);
    }

    private static int[] generateArray() {
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 100);
        }
        return array;
    }

    private static void primeNumber(int[] numbers) {
        int composite = 0;
        int prime = 0;
        int n = 0;
        for (int i : numbers) {
            if (i == 1) {
                n++;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    composite++;
                    break;
                }
            }

        }
        prime = numbers.length - composite - n;
        System.out.println("The number of PRIME numbers = " + prime);
    }

    private static void compositeNumber(int[] numbers) {
        int composite = 0;
        for (int i : numbers) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    composite++;
                    break;
                }
            }
        }
        System.out.println("The number of COMPOSITE numbers = " + composite);
    }
}