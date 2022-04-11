package group_activity;

import java.util.ArrayList;
import java.util.Arrays;

public class BadPairs {
    public static void main(String[] args) {
        Integer[] a = {3, 4, 6, 1, 1, 10, 8, 7};
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(a));
        System.out.println(badPairs(nums));
    }
public static ArrayList<Integer>badPairs(ArrayList<Integer>nums){
    for (int i = 0; i < nums.size()-1; i+=2) {
        Integer num = nums.get(i);
        Integer num2 = nums.get(i+1);
        if(num> num2){
            nums.remove(num);
            nums.remove(num2);
        }
    }
        return nums;
}

}



