package group_activity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WeAreTheBest {


            public static void main(String[] args) {
                String str = "AABBCCDDEE";
                String result="";
                ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
                for(int i=0;i<list.size(); i++){
                    if(!result.contains(list.get(i))){
                        result += list.get(i)+ Collections.frequency(list,list.get(i));
                    }
                }
                System.out.println(result);
            }
        }



