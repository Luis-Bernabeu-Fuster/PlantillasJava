import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero decimal: ");
        int decimal = sc.nextInt();
        String binario = Integer.toBinaryString(decimal);
        System.out.println("El numero decimal pasado a binario da como resultado: " + binario);
    }
}
