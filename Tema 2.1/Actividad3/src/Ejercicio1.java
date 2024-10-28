public class Ejercicio1 {
    public static void main(String[] args) {

        /* 1.a Se ejecuta 4 veces
           1.b Como verdadero se ejecuta 3 veces
           1.c La sentencia se ejecutara 3 veces
           1.d Inicializa antes del while, se verifica en la zona de "contador <= 3" y cambia en "contador = contador + 1"
           1.e No cambiaria porque se ejecutaria 4 veces y solo 3 como verdadero ya que parara antes de ser igual a 4
           1.f Terminara el bucle directamente
         */

        int contador = 1;
        while (contador == 0) {
            System.out.println("contador igual a : " + contador);
            contador = contador + 1;
        }
        System.out.println("Termina el bucle");
    }
}
