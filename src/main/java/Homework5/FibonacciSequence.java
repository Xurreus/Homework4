package Homework5;

public class FibonacciSequence {
    public static int fibonacciResult(int N) {
        if (N <= 1)
            return N;

        int result = 1;
        int first = 0;
        int second = 1;

        for (int i = 2; i <= N; i++) {
            int next = first + second;
            first = second;
            second = next;
            result = next; // Update result with the latest Fibonacci number
        }

        return result;
    }

    public static void main(String[] args) {
        int N = 20;
        int result = fibonacciResult(N);
        System.out.println("The result is " + result);
    }
}
