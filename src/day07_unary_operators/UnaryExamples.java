package day07_unary_operators;

public class UnaryExamples {

    public static void main(String[] args) {

        int b = 10;
        b++;
        System.out.println(b); //11
        b--; //11
        System.out.println(b); //10
        System.out.println(b++); //10
        System.out.println(b++);// 11
        System.out.println(b);// 12


        int a = 40;
        System.out.println(--a);// 39
        System.out.println(--a);// 38
        System.out.println(a--);// 38
        System.out.println(--a);// 36
        System.out.println(--a);// 35
        System.out.println(a--);// 35


        int c = 14;
        int z = c++;

        System.out.println(c); //15
        System.out.println(z); //14
        System.out.println(c);//15
       // c--; // 14 -1
        //c++; // 13 +1
        //--c; // 13 //14-1
        //c--; // 13(-1)
        //c++; // 12 (+1)
        //System.out.println(c);

        char n = 'b';
        char o = n++;

        System.out.println((int)n);
        System.out.println(o);




    }







}
