import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("0. Helado de Vainilla");
        System.out.println("1. Helado de Chocolate");
        System.out.println("2. Helado de Fresa");
        System.out.print("Introduce el num del helado que desa: ");
        int helado = sc.nextInt();

        switch (helado){
            case 0:
                System.out.println("Has pedido un helado de vainilla");
                break;
            case 1:
                System.out.println("Has pedido un helado de chocolate");
                break;
            case 2:
                System.out.println("Has pedido un helado de fresa");
                break;
            default:
                System.out.println("Error");
        }
    }
}
