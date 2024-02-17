package Homework5;

public class ArrayWithElement {
    public static void main(String[] args) {
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 5;
        }

        for (int num : array) {
            System.out.println(num + "");
        }
    }
}

