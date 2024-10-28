public class Ejercicio8 {
    public static void main(String[] args) {

        int n = 1;
        int suma = 4;
        while (n <= 25) {
            System.out.println(n);
            n = n + suma;
        }

         /*     Iteración       Variable        n<=25       Acción

                1a              n=1             true        incrementa n(5)
                2a              n=5             true        incrementa n(9)
                3a              n=9             true        incrementa n(13)
                4a              n=13            true        incrementa n(17)
                5a              n=17            true        incrementa n(21)
                6a              n=21            true        incrementa n(25)
          */
    }
}
