package group_activity;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfString {
    public static void main(String[] args) {
        String[] str = {"123", "34", "513"};
        ArrayList<String> nums = new ArrayList<>(Arrays.asList(str));
        System.out.println(sumOfString(nums));
    }
   public static ArrayList<Integer> sumOfString(ArrayList<String>list) {
       ArrayList<Integer> newArr = new ArrayList<>();
       for (String each : list) {

           int sum = 0;
           for (int i = 0; i < each.length(); i++) {
               sum += Integer.parseInt(each.charAt(i) + "");
           }
      newArr.add(sum);

       }
return newArr;
    }




}
