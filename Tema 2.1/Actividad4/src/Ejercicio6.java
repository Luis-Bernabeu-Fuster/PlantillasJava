import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        int numero = 0;
        int m = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("De que numetro quieres saber la tabla de multiplicar: ");
        numero = sc.nextInt();

        do {
            System.out.println(numero + "x" + m + "=" + (numero*m));
            m++;
        } while (m <= 10);
    }
}
