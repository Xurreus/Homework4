package Homework5;

public class ArryaAverage {
    public static void main(String[] args){
        int[] array = {0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95};
        int sum = 0;
        for (int num : array){
            sum += num;
            double average = (double) sum / array.length;
            System.out.println("The average is "+average);
        }


    }

}
