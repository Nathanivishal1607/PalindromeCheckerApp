import java.util.Scanner;

/**
 * ==================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * ==================================================
 *
 * UC4: Character Array Based Palindrome Check
 *
 * Goal:
 * Convert string to char[] and compare characters
 * using two-pointer technique.
 *
 * Data Structure: char[]
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC4.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert String to Character Array
        char[] characters = input.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
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