public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("A");
        for (int i = 1; i < 10; i+=2){
            System.out.println(i);
        }
        /*
        Interacción             Variable            i<10        Acción

            1a                     i=1              true        suma i(+2)
            2a                     i=3              true        suma i(+2)
            3a                     i=5              true        suma i(+2)
            4a                     i=7              true        suma i(+2)
            5a                     i=9              true        suma i(+2)
            6a                     i=11             false       out
         */

        System.out.println("B");
        for (int i = 1; i < 18; i*=2){
            System.out.println(i);
        }
    }
}
