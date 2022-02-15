package ua.bakhtyzina.hw9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Task3Hw4Test {
    private Task2Task3Hw4 target;
    int[] array = {0, 5, 9, 13, 17, 3, 2, 97, 89, 102, 88, 75};

    @BeforeEach
    void setUp() {
        target = new Task2Task3Hw4();
    }

    @Test
    void generateArray_arrayCreated() {
        Assertions.assertNotNull(target.generateArray());
    }

    @Test
    void generateArray_arrayLength() {
        Assertions.assertEquals(1000, target.generateArray().length);
    }

    @Test
    void primeNumber_primeFine() {
        Assertions.assertEquals(7, target.primeNumber(array));
    }

    @Test
    void compositeNumber_compositeFine() {
        Assertions.assertEquals(4, target.compositeNumber(array));
    }
}