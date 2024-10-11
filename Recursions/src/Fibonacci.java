public class Fibonacci {


    public static int fibonacuci(int n) {
        // Base cases
        if (n <= 0) {
            return 0; // Fibonacci(0) = 0
        } else if (n == 1) {
            return 1; // Fibonacci(1) = 1
        } else {
            // Recursive case
            return fibonacuci(n - 1) + fibonacuci(n - 2);
        }

}

public void main() {
    int n = 10; // Change this value to compute a different Fibonacci number

    System.out.println("Fibonacci number at position " + n + " is: " + fibonacuci(n));
}
}

