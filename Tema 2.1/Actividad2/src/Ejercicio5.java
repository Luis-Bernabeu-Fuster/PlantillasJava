import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String piece;
        System.out.print("Introduce la inicial del nombre de la pieza de ajedrez: ");
        piece = sc.nextLine().toUpperCase();
        switch(piece){
            case "R": //Rey
            System.out.println("El Rey puede moverse en todas direcciones pero solo avanza una posición.");
            break;

            case "D": //Dama o reina
            System.out.println("La Dama puede moverse en todas direcciones y avanzar todas las posiciones que dese");
            break;

            case "A"://Alfil
            System.out.println("El Alfil puede unicamente moverse en diagonal y avanzar todas las posiciones que dese");
            break;

            case "T"://Torre
            System.out.println("La Torre puede unicamente moverse en vertical u horizontaln y avanzar todas las posiciones que dese");
            break;

            case "C"://Caballo
            System.out.println("El Caballo puede unicamente moverse una casilla, hacia arriba o hacia abajo verticalmente y dos casillas, hacia izquierda o derevha horizontalmente");
            break;

            case "P":
            System.out.println("El Peón puede  moverse dos casillas en su primer movimiento y solo una tras este mismo en vertical hacia arriba unicamente");
            break;

            default:
            System.out.println("Eso no es una pieaza de ajedrez");
        }
    }
}
