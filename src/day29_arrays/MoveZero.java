package day29_arrays;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int [] nums = {10, 0, 0, 0, 0, 5, 0, 1, 0};
        int [] fixed = new int[nums.length];
        int index = 0; // variable to keep track of indexes of the fixed array

        for(int i = 0; i < nums.length; i++){

            if(nums[i] != 0){
                fixed[index++] = nums[i]; //reading the element at position i of the nums array and storing it into the fixed array and position index. after storing the value index variable is incremented by 1
            }
        }

        System.out.println(Arrays.toString(fixed));
    }


}
