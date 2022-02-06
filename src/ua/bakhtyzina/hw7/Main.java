package ua.bakhtyzina.hw7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(" ", " ", " ");
        car1.setManufacturer("Manufacturer1");
        car1.setEngine("Engine1");
        car1.setColour("Red");
        car1.setPetrol(27);
        System.out.println("Car1: " + car1);
        Car car2 = new Car(" ", " ", " ");
        car2.setManufacturer("Manufacturer2");
        car2.setEngine("Engine2");
        car2.setColour("Green");
        car2.setPetrol(98);
        System.out.println("Car2: " + car2);
        car1.startEngine("Bob");
        System.out.println("Car1 has enough petrol -  " + car1.isEnoughPetrolLevel());
        System.out.println("Car2 has enough petrol -  " + car2.isEnoughPetrolLevel());
        Car car3 = new Car("Manufacturer3", "Engine3", "Black");
        System.out.println("Car3: " + car3);

    }
}
