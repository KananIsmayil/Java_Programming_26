package day18_string;

public class EmptyOrBlank {
    public static void main(String[] args) {
    String str ="Last Example";
        System.out.println(str.isEmpty());
        str = "";
        System.out.println(str.isEmpty());//true

        String s = " ";
        System.out.println(s.isEmpty());//false because a space is there,space is a character
        if(s.length() == 0 ){

        }
        System.out.println(s.isBlank());






    }

}
