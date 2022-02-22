package ua.bakhtyzina.hw9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.lesson9.CarFactory;
import practice.lesson9.PersonFactory;

import static org.junit.jupiter.api.Assertions.*;

class Task1Hw4Test {
    private Task1Hw4 target;
    int[] array1 = {5,15,1};
    int[] array2 = {4,9};

    @BeforeEach
    void setUp() {
        target = new Task1Hw4();
    }

    @Test
    void generateArray_arrayCreated() {
        Assertions.assertNotNull(target.generateArray());
    }
    @Test
    void generateArray_arrayLength() {
        Assertions.assertEquals(400, target.generateArray().length) ;
    }

    @Test
    void averageAr_ArFine() {
        Assertions.assertEquals(7.0, target.averageAr(array1));
    }
    @Test
    void averageGeom_GeomFine() {
        Assertions.assertEquals(6.0, target.averageGeom(array2));
    }
}