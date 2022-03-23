package day18_string;

public class RecapMethod {
    public static void main(String[] args) {

        String s = "pen";// s is String literal, so it is in the String pool
        String s2 = new String("pen");// s2 is object in the heap,beacuse we used new
        System.out.println("compare with == " +(s == s2));
        System.out.println("compare with equals() " + (s.equals(s2)));
        System.out.println("compare with equals()" + s.equals("Pen"));
        System.out.println("compare with .equalsIgnoreCase() " +s.equalsIgnoreCase("Pen"));

        boolean isSame = s.equalsIgnoreCase("Pen");
        if(s.equals("pen")){

        }
        int len = s.length();
        System.out.println(len);

        if(s.length() > 4){
            System.out.println("long world");
        }else{
            System.out.println("short word");
        }





    }




}
