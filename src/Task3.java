public class Task3 {
    public static void main(String[] args){
         //Ex3
        float a = -34;
        float b = -65;
        float c = 27;
        System.out.println(a + " and " + b + " and " + c);
        minAbsolute(a, b, c);
    }
    private static void minAbsolute(float a, float b, float c) {
        float n1 = Math.abs(a);
        float n2 = Math.abs(b);
        float n3 = Math.abs(c);
        System.out.println("Min absolute number: " + (Math.min(n1, n2) < n3 ? Math.min(n1, n2) : n3));
    }
}
