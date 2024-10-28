import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Introduzca un entero:");

        try {
            numero = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("No has introducido un número.");
            //e.printStackTrace();
        }

        System.out.println("Sigue ejecutándose el programa");
    }
}
