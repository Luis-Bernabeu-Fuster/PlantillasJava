public class Ejercicio3 {
    public static void main(String[] args) {
        String hola = "Hola caracola";
        int n = 1;

        do {
            System.out.println(hola);
            n++;
        } while ( n <=5);

        /*      Interación      Variable        n<=5        Acción

                                n=1             true        imprime Hola caracola, incrementa n(2)
                1a              n=2             true        imprime Hola caracola, incrementa n(3)
                2a              n=3             true        imprime Hola caracola, incrementa n(4)
                3a              n=4             true        imprime Hola caracola, incrementa n(5)
                4a              n=5             true        imprime Hola caracola
         */
    }
}
