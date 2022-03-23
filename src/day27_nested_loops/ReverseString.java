package day27_nested_loops;

public class ReverseString {

    public static void main(String[] args){
        String name = "Java";  // "avaJ"
           String str = "";          //0123
        for(int i =name.length()-1;i >= 0  ; i--){   // i = 3210
            str += ""+name.charAt(i);
        }
        System.out.println(str);
char ch1=str.charAt(0);
        System.out.println(ch1);

        System.out.println("---------------------------------------------");


           // 1,2,3,4,5,6,7,8,9,10   //10,9,8,7,6,5,4,3,2,1


        for(int i =1; i <= 10; i++){
            System.out.print(i + ",");

        }
        System.out.println();
        System.out.println("______________________________");

        for(int i =10; i >0; i--){
            System.out.print(i + ",");
        }

        System.out.println();

        String str2 = "AZERBAIJAN";
                     //0123456789


        char ch = str2.charAt(7);

        System.out.println(ch);

        String email = "kenan@gmail.com"; //  name = "Kenan", domain ="com", mail=gmail


        String name1 = email.substring(0,email.indexOf('@'));

   String name2=name1.substring(0,1).toUpperCase()+name1.substring(1,name1.length());

   String domain = email.substring(email.lastIndexOf('.')+1,email.length());

   String mail  = email.substring(email.indexOf('@')+1,email.lastIndexOf('.'));


        System.out.println("name2 = " + name2);
        System.out.println("domain = " + domain);
        System.out.println("mail = " + mail);


    }
}
