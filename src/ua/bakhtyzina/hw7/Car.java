package ua.bakhtyzina.hw7;

public class Car {
    private String manufacturer;
    private String engine;
    private String colour;
    private int petrol;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPetrol(int petrol) {
        this.petrol = petrol;
    }

    public String toString() {
        return manufacturer + "; " + engine + "; " + colour + "; " + petrol;
    }

    public Car() {
    }

    public Car(String manufacturer, String engine, String colour) {
        this();
        this.manufacturer = manufacturer;
        this.engine = engine;
        this.colour = colour;
        this.petrol = 100;
    }

    public void startEngine(String name) {
        System.out.println(name + " started the engine");
    }

    public boolean isEnoughPetrolLevel() {
        return this.petrol >= 50;
    }
}
