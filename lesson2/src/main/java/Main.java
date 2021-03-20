package main.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    // для ввода массивов (задания со свездочкой)
    public static int[] initArray() {
        System.out.println("Введите размер массива");
        int array[] = new int[scanner.nextInt()];
        System.out.println("Ввод массива");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    //////////////////////////////////////////////////////

    //task1
    public static void revertArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
    }

    //task2
    public static int[] initArr() {
        int[] arr = new int[8];
        arr[0] = 0;
        for (int i = 1; i < 8; i++) {
            arr[i] = arr[i - 1] + 3;
        }
        return arr;
    }

    //task3
    public static void doubleIfLessThenSix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //task4
    public static int[][] diagEqOne(int n) {
        int array[][] = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }

    //task5
    public static void maxAndMin(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Maximum = " + max + " Minimum = " + min);
    }

    //task6
    static boolean checkBalance(int[] arr) {
        int leftSum = 0, rightSum = 0;

        for (int i = 0; i < arr.length + 1; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            for (int j = i; j < arr.length; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) return true;
        }
        return false;
    }

    //task7
    static void moveArray(int[] arr, int n) {

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int tmp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = tmp;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                int tmp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = tmp;
            }
        }
    }

    public static void main(String[] args) {

    }
}
