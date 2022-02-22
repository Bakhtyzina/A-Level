package ua.bakhtyzina.hw9;

import java.sql.Array;
import java.util.Arrays;

public class Task1Hw4 {

    public int[] generateArray() {
        int[] array = new int[400];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 10);
        }
        return array;
    }

    public double averageAr(int[] numbers) {
        double ar = 0;
        for (int j : numbers) {
            ar += j;
        }
        return ar / numbers.length;
    }

    public double averageGeom(int[] numbers) {
        double geom = 1.0;
        for (int j : numbers) {
            geom *= j;
        }
        return Math.pow(geom, (double) 1 / numbers.length);
    }

}