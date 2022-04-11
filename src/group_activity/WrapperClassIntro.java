package group_activity;

import java.util.ArrayList;
import java.util.Arrays;

public class WrapperClassIntro {
    /*Please implement this method to return the sum of all integers found in the parameter String.

   /* String s="jav45ai1000sgre1at82"
    result: 45+1000+1+82 ----> 1128*/
    public static void main(String[] args) {
        String s = "jav45ai1000sgre1at82";
        int let = 0;
        String letB = "";
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (Character.isDigit(letter)) {
                let++;
                letB += " " + letter;
                while (i < s.length() - 1 && Character.isDigit(s.charAt(i + 1))) {
                    let += s.charAt(i + 1);
                    i++;
                }

            }

        }
        System.out.println(letB);
    }
}