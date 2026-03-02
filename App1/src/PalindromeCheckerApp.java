import java.util.Scanner;
import java.util.Stack;

/**
 * ==================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * ==================================================
 *
 * UC5: Stack-Based Palindrome Checker
 *
 * Goal:
 * Use a stack to reverse characters and validate palindrome.
 *
 * Data Structure: Stack
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC5.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop characters and compare with original string
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        scanner.close();
    }
}