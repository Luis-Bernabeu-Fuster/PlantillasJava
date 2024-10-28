import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        final String CHOCOLATE = "CHOCOLATE";
        final String VAINILLA = "VAINILLA";
        final String FRESA = "FRESA";
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("Helado de Vainilla");
        System.out.println("Helado de Chocolate");
        System.out.println("Helado de Fresa");
        System.out.print("Introduce el numero sabor del helado que desa: ");
        String helado = sc.nextLine().toUpperCase();

        switch (helado){
            case VAINILLA:
                System.out.println("Has pedido un helado de vainilla");
                break;
            case CHOCOLATE:
                System.out.println("Has pedido un helado de chocolate");
                break;
            case FRESA:
                System.out.println("Has pedido un helado de fresa");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
