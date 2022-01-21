public class Task2 {
    public static void main(String[] args) {
        int n = 9088;
        System.out.println("Number " + n + " is even. - It is " + evenNumber(n));
    }
    private static boolean evenNumber(int n) {
        return n % 2 == 0 ? true : false;
    }
}

