import java.util.Scanner;


public class HW3Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = in.nextLine();
        System.out.println(text);
        System.out.println(wordCount(text));
    }

    private static int wordCount(String text) {
        int wCont = 0;
        for (int i = 1; i <= text.length() - 1; i++) {
            if (text.charAt(i - 1) != ' ' && text.charAt(i) == ' ') {
                wCont++;
            }
        }
        if (text.charAt(text.length() - 1) != ' ') {
            return ++wCont;
        } else {
            return wCont;
        }

    }
}
