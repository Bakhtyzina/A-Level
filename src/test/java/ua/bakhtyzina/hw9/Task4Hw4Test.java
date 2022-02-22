package ua.bakhtyzina.hw9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Task4Hw4Test {
    Task4Hw4 target;

    @BeforeEach
    void setUp() {
        target = new Task4Hw4();
    }

    @Test
    void generateArray_arrayCreated() {
        Assertions.assertNotNull(target.generateArray());
    }

    @Test
    void generateArray_arrayLength() {
        Assertions.assertEquals(2000, target.generateArray().length);
    }

    @Test
    void changeEvenToZero_changeFine() {
        int[] array = target.changeEvenToZero(target.generateArray());
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                Assertions.assertEquals(0, array[i]);
            }

        }
    }
}