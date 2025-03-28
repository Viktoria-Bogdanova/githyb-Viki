package FirstHWViki;
import java.util.Scanner;

public class HW2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        String originalText = "My name is <Test>";

        System.out.print("Enter the replacement for your name: ");
        String userInput = scanner.nextLine();

        String newText = originalText.replace("<Test>", userInput);

        System.out.println("Updated text: " + newText);

        System.out.print("Enter first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter second string: ");
        String secondString = scanner.nextLine();

        if (firstString.equals(secondString)){
            System.out.println("First string equals second string.");

        }else {
            System.out.println("First string does not equals second string.");

        }

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] words = input.trim().split("\\s+");

        int wordCount = input.isBlank() ? 0 : words.length;
        System.out.println("Word count is: " + wordCount);

        String result = String.join(" ", firstString, secondString);

        System.out.println("All strings are: " + result);
        scanner.close();
    }
}
