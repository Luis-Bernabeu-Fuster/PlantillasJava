import java.util.Scanner;

public class Si {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        /*
        String respuesta;
        System.out.print("¿Está lloviendo? (Y or N): ");
        respuesta = scan.nextLine();

        if (respuesta.equals("Y")) {
            System.out.println("Activa limpiaparabrisas");
        } else {
            System.out.println("Desactiva limpiaparabrisas");
        }
         */

        System.out.println("Introduce numero de jugadores: ");
        int numJugadores = scan.nextInt();
        if (numJugadores == 1) {
            System.out.println("Single player");
        } else if (numJugadores == 2) {
            System.out.println("Two player");
        } else if (numJugadores == 3) {
            System.out.println("Multiplayer");
        } if (numJugadores < 1) {
            System.out.println("Error ningun jugador seleccionado");
        }else {
            System.out.println("Not possible, too many players");
        }
    }
}
