public class Ejercicio5 {
    public static void main(String[] args) {

            int i = 0;
            i = i++ - --i + ++i - i--;
            System.out.println(i);


        int z=9, w=19, t;
        t = z-- - z++ + --w - ++w + --z - w-- + ++z - w++;
        System.out.println("i="+z);
        System.out.println("j="+w);
        System.out.println("k="+t);

        /*
        int i = 7;
        int j = + +i--;
        */

        int c = 1;
        c = c++ + ++c * c-- - --c;
        System.out.println(c);


    }
}
