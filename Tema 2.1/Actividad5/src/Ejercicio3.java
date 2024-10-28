import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int suma = 0;
        int n;
        int d = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa de sumas activado, si desea terminar la operación pulse 0");

        do {
            System.out.print("Numero para operación: ");
            n = sc.nextInt();
            suma = n + suma;
            d++;
            if (n %2 == 1){
                i++;
            }
            if (n == 0){
                d--;
            }
        }  while ( n != 0 );
        System.out.println("Total de impares insertados: " + i );
        System.out.println("Resultado = " + suma);
        System.out.println("Total de numeros insertados: " + d );
        System.out.println("Programa finalizado");
    }
}
