import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double preuspuesto = 0;
        int edad = 0;
        System.out.print("Introduce tu edad: ");
        edad = sc.nextInt();
        System.out.print("Introduce tu presupuesto: ");
        preuspuesto = sc.nextDouble();

        if (edad >= 21 && preuspuesto >= 10000) {
                System.out.println("Tienes edad y presupuesto necesarios para alquilar el coche");
        }else {
                System.out.println("No tienes edad o presupuesto suficiente para alquilar un coche");
        }

        //Si cambiasemos el AND (&&) por un OR (||) lo que sucederia es que si cumpliese al menos una de las dos condiciones, daria por valido que puedas alquilar el cohe.
    }
}
