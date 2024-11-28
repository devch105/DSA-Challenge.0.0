package stack;
import java.util.*;

public class stackopn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Testcases: ");
        int test = sc.nextInt();
        sc.nextLine(); // Consume the newline character after nextInt()

        for (int i = 0; i < test; i++) { // Corrected loop condition
            System.out.print("Enter String: ");
            String A = sc.nextLine();

            if (checkParenthesis(A)) {
                System.out.println("1"); // Balanced
            } else {
                System.out.println("0"); // Not balanced
            }
        }
        sc.close(); // Close scanner to avoid resource leaks
    }

    public static boolean checkParenthesis(String A) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) { // Check for underflow
                    return false; // More closing than opening
                }
                stack.pop();
            }
        }

        return stack.isEmpty(); // Return true if all parentheses are matched
    }
}