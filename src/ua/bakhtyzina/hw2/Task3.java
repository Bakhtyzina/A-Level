package ua.bakhtyzina.hw2;

public class Task3 {
    public static void main(String[] args) {
        //Ex3
        float a = -34;
        float b = -46;
        float c = 27;
        System.out.println(a + " and " + b + " and " + c);
        minAbsolute(a, b, c);
    }

    private static void minAbsolute(float a, float b, float c) {
        float n1 = a >= 0 ? a : -a;
        float n2 = b >= 0 ? b : -b;
        float n3 = c >= 0 ? c : -c;
        System.out.println("Min absolute number: " + (Math.min(n1, n2) < n3 ? Math.min(n1, n2) : n3));
    }
}
