package group_activity;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAll {
    public static void main(String[] args) {
        String [] a={"ted","talk","learn"};

        ArrayList<String> word = new ArrayList<>(Arrays.asList(a));
        System.out.println(reverseAll(word));
    }

static ArrayList<String> reverseAll(ArrayList<String>str){
    ArrayList<String>newArr=new ArrayList<>();

        for (int i = 0; i < str.size(); i++) {
        String rev="";
        for (int j = str.get(i).length()-1; j>=0; j--) {
            rev+=str.get(i).charAt(j);
        }
        str.set(i,rev);


    }
        return str;
}

}
