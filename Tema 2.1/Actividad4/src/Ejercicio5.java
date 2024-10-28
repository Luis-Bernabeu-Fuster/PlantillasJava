public class Ejercicio5 {
    public static void main(String[] args) {

        /*
            5.a Imprime los multiplos que hay hasta que el resto de contador/4 sea 0 incrementando +1 al contador cada vez
            5.b 5 veces
            5.c La condición se ejecuta las 5 veces
            5.d 1 vez
            5.e Interación      Variable        contador<=10        Acción
                                contador=1             true         incrementa contador (1)
                1a              contador=2             true         incrementa contador (2)
                2a              contador=3             true         incrementa contador (3)
                3a              contador=4             true         incrementa contador (4)

            5.f Que cuando la condición sea verdadera el contador sea igual a 10 para que termine el programa
            5.g Lo mismo pero con una linea más al principio en la que sera 0
         */

        int contador = 1;
        do{
            System.out.println(contador);
            if (contador % 4 == 0) {
                System.out.println("Multiplo de 4 encontrado. Salir");
                contador = 10;
            }
            contador++;
        }while (contador <= 10);
    }
}
