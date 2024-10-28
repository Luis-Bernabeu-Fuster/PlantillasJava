import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        int contador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor inicial para el contador: ");
        contador = sc.nextInt();
        while (contador <= 3) {
            System.out.println("contador igual a : " + contador);
            contador = contador + 1;
        }
        System.out.println("Termina el bucle");

        // 3.a Se imprimiran los valores -2, -1, 0 y 1
        // 3.b Se finalizara el bucle directamente
    }
}
