package Task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] array2d = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = random.nextInt(101);
            }
        }
        System.out.println("Array: ");
        for (int[] i : array2d) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Maximum value of array is " + getMaxValue(array2d));
        System.out.println("Minimum value of array is " + getMinValue(array2d));
        System.out.println("Average value for array is " + getAverageValue(array2d));

    }

    public static int getMaxValue(int[][] array) {
        int max = array[0][0];
        for (int[] i : array) {
            for (int j : i) {
                if (j > max) {
                    max = j;
                }
            }
        }
        return max;
    }

    public static int getMinValue(int[][] array) {
        int min = array[0][0];
        for (int[] i : array) {
            for (int j : i) {
                if (j < min) {
                    min = j;
                }
            }
        }
        return min;
    }

    public static double getAverageValue(int[][] array)  {
        int counter = 0;
        double sum = 0;
        double average = 0;
        for (int[] i : array) {
            for (int j : i) {
                sum += j;
                counter++;
            }
            average = sum / counter;
        }
        return average;
    }

}





