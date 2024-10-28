import java.util.Scanner;

public class EJERCICIO1 {
    public static void main(String[] args) {

        int suma = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa de sumas activado, si desea terminar la operación pulse 0");

            do {
                System.out.print("Numero para operación: ");
                n = sc.nextInt();
                suma = n + suma;
                } while ( n != 0 );
        System.out.println("Resultado = " + suma);
        System.out.println("Programa finalizado");
    }
}
