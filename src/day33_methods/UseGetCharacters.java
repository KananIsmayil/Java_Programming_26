package day33_methods;

public class UseGetCharacters {

    public static void printAtoZUpper(){
        for(char i = 'A'; i <= 'Z'; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printZtoAUpper(){
        for(char i = 'Z'; i >= 'A'; i--){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printAtoZLower(){
        for(char i = 'a'; i <= 'z'; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printZtoALower(){
        for(char i = 'z'; i >= 'a'; i--){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void print0To9(){
        for(char i = '1'; i <= '9'; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}



