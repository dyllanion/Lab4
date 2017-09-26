import java.util.InputMismatchException;
import java.util.Scanner;

public class WordRepeater {
    public static void main(String[] args) {
        // Open the scanner
        Scanner scan = new Scanner(System.in);

        int repeat = 1;

        System.out.print("Enter a word: ");
        String word = scan.next();

        System.out.print("How many times do you want to repeat it? ");
        try {
            repeat = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You didn't enter an integer!");
            System.out.println("Printing your word one time!\n");
        }

        while (repeat > 0) {
            System.out.println(word);
            repeat--;
        }
    }
}
