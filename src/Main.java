public class Main {

    public static void main(String[] args) {
        String input = "level";

        long start = System.nanoTime();

        int begin = 0;
        int end = input.length() - 1;
        boolean isPalindrome = true;

        while (begin < end) {
            if (input.charAt(begin) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }
            begin++;
            end--;
        }

        long finish = System.nanoTime();
        long executionTime = finish - start;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }
}