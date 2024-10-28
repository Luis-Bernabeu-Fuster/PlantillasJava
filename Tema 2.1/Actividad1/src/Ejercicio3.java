import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = 0;
        System.out.print("Introduce un numero positivo o negativo: ");
        numero = sc.nextInt();

            if (numero > 0){
                System.out.println("El numero " + numero + " es positivo siendo, " + numero +" el numero introducido" );
            }if (numero > 0) {
                System.out.println("Todos los numeros positivos son mayores a 0");
            }else if (numero <0) {
                System.out.println("El numero " + numero + " es negativo");
            }else {
                System.out.println("El numero introducido es 0");
            }
    }
}
