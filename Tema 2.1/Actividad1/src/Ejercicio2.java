import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = 0;
        System.out.println("Introduce tu edad: ");
        age = sc.nextInt();

        if ( age <= 13){
            System.out.println("Se le aplica la tarifa de niños");
        }else {
            System.out.println("Se le aplica la tarifa de adulto");
        }
        System.out.println("Disfrute la pelicula");
    }
}
