public class Ejercicio4 {
    public static void main(String[] args) {

     /*     Interación      Variable        i<=10       Acción

             6a             suma=10,i=5     true        suma=15,incrementa i(6)
             7a             suma=15,i=6     true        suma=21,incrementa i(7)
             8a             suma=21,i=7     true        suma=28,incrementa i(8)
             9a             suma=28,i=8     true        suma=36,incrementa i(9)
             10a            suma=36,i=9     true        suma=45,incrementa i(10)
             11a            suma=45,i=10    true        suma=55,incrementa i(11)
      */

        //5. Bucle mal diseñado mpara que sea infinito

        int i = 1; //inicializador
        int suma = 0;

        while (i <= 10) {
            suma = suma + i;
            System.out.println(suma);
        }

        System.out.println(suma);

    }
}
