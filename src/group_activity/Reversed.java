package group_activity;

public class Reversed {
    public static void main(String[] args) {
      String name = "ABc456!@Def123$%0&";

      String num ="";
      String lowerCase ="";
      String upperCase ="";
      String charAt = "";

        for (int i = 0; i<name.length() ; i++) {
            if(name.charAt(i)>='0'&& name.charAt(i)<='9'){
                num+= name.charAt(i);
            }else if(name.charAt(i)>= 'A'&& name.charAt(i) <= 'Z'){
                upperCase = upperCase+name.charAt(i);
            }else if(name.charAt(i)>= 'a'&& name.charAt(i) <= 'z'){
                lowerCase += name.charAt(i);
            }else{
                charAt += name.charAt(i);

            }

        }

        System.out.println(num);
        System.out.println(lowerCase);
        System.out.println(upperCase);
        System.out.println(charAt);






    }




}
