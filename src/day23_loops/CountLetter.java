package day23_loops;

public class CountLetter {
    public static void main(String[] args) {

        String word = "aabbcca";
       char letter = 'c';
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            //System.out.println(word.charAt(i));
        if(word.charAt(i) == 'a'){
            count++;
        }

        }

        System.out.println(count);





    }



}
