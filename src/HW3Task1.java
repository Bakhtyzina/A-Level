import java.util.Scanner;
import java.util.Arrays;

public class HW3Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = in.nextLine();
        System.out.println(text);
        String newText = delSpace(text);
        System.out.println(newText);
        System.out.println("It's palindrome. It's " + palindrome(newText));
    }

    private static String delSpace(String text) {
        String delSp = text.replaceAll(" ", "");
        return delSp;
    }

    private static boolean palindrome(String line) {
        int n = line.length();
        for (int i = 0; i <= (n - 1) / 2; i++) {
            if (line.charAt(i) == line.charAt((n - 1) - i)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}

