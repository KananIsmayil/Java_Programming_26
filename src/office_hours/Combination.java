package office_hours;

import java.util.Arrays;

public class Combination {

    /*Create a method that can print out the combination of two integer arrays
    int[] array1 = {1,2,3,4};
    int[] array2 = {5,6,7,8,9,10};

    Output:   [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] */

    public static void combination(int[] array1, int[] array2) {
  int j =0;
        int[] totalArr = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            totalArr[i] = array1[i];

        }
        for (int i = array1.length; i < totalArr.length; i++) {
            totalArr[i] = array2[j];
            j++;

        }
        System.out.println(Arrays.toString(totalArr));


    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8, 9};
combination(arr1,arr2);
    }
}