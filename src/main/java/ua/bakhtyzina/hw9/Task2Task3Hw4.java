package ua.bakhtyzina.hw9;

import java.util.Arrays;

public class Task2Task3Hw4 {

    public int[] generateArray() {
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 100);
        }
        return array;
    }

    public int primeNumber(int[] numbers) {
        int composite = 0;
        int prime = 0;
        int n = 0;
        for (int i : numbers) {
            if (i == 1) {
                n++;
            }
            if (i == 0) {
                n++;
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        composite++;
                        break;
                    }
                }
            }

        }
        prime = numbers.length - composite - n;
        return prime;
    }

    public int compositeNumber(int[] numbers) {
        int composite = 0;
        for (int i : numbers) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    composite++;
                    break;
                }
            }
        }
        return composite;
    }
}