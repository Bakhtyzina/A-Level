package ua.bakhtyzina.hw2;

public class Task1 {
    public static void main(String[] args){
        // Ex1
        double x1 = -1, y1 = -3;
        double x2 = 3, y2 = 4;
        double x3 = 5, y3 = -5;
        System.out.println("A(" + x1 + ";" + y1 + ");");
        System.out.println("B(" + x2 + ";" + y2 + ");");
        System.out.println("C(" + x3 + ";" + y3 + ");");
        double ar = areaTriangle(x1, y1, x2, y2, x3, y3);
        System.out.println("Area of a triangle ABC: " + ar);
    }

    private static double areaTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        return 0.5 * Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1));
    }

}

