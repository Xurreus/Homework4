package Homework5;

public class NotDivisibaleNumbers {
    public static void printNoTDivisibleNumbers(int N){
        for (int i = 1; i<= N; i++) {
            if (i % 3 != 0 && i % 7 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int N = 30;
        printNoTDivisibleNumbers(N);
    }
}




