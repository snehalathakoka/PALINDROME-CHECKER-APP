import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Declare and initialize the input string
        String input = "noon";

        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume it is a palindrome
        boolean isPalindrome = true;

        // Compare original string with reversed (stack pop)
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
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
    }
}