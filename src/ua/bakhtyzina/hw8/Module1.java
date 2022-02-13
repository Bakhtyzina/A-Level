package ua.bakhtyzina.hw8;

import java.util.Arrays;
import java.util.Scanner;

public class Module1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the array length: ");
        int arrayLength = in.nextInt();
        int[] array = generateArray(arrayLength);
        System.out.println(Arrays.toString(array));
        System.out.print("Specifies the sort order. Ascending - input 1; Descending - input 2:  ");
        int choiceSort = in.nextInt();
        sortArray(array, choiceSort);
        System.out.println(Arrays.toString(array));
        int[] newArray = everyThirdElementCubed(array);
        System.out.println("Every third elements in array cubed: " + Arrays.toString(newArray));
    }

    private static int[] generateArray(int arrayLength) {
        Scanner in = new Scanner(System.in);
        if (arrayLength < 10) {
            System.out.println("Input the correct array length, ARRAY LENGTH > = 10 ");
            arrayLength = in.nextInt();
            return generateArray(arrayLength);
        } else {
            int[] array = new int[arrayLength];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 201) - 100;
            }
            return array;
        }
    }

    private static int[] ascSortArray(int[] array) {
        int n;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    n = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = n;
                }
            }
        }
        return array;
    }

    private static int[] desSortArray(int[] array) {
        int n;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] < array[j]) {
                    n = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = n;
                }
            }
        }
        return array;
    }

    private static int[] sortArray(int[] array, int choiceSort) {
        Scanner in = new Scanner(System.in);
        if (choiceSort == 1) {
            System.out.println("Ascending sort: ");
            return ascSortArray(array);
        } else if (choiceSort == 2) {
            System.out.println("Descending sort: ");
            return desSortArray(array);
        } else {
            System.out.println("Input correct number. Ascending - INPUT 1; Descending - INPUT 2");
            choiceSort = in.nextInt();
            return sortArray(array, choiceSort);
        }
    }

    private static int[] everyThirdElementCubed(int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < newArray.length; i++) {
            if (i % 3 == 0) {
                newArray[i] = (int) Math.pow(newArray[i], 3);
            }
        }
        return newArray;
    }

}