import java.util.ArrayDeque;
import java.util.Deque;

public class palindromecheckerapp {
    public static void main(String[] args) {
        String input = "refer";
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            char firstChar = deque.removeFirst();
            char lastChar = deque.removeLast();

            if (firstChar != lastChar) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
