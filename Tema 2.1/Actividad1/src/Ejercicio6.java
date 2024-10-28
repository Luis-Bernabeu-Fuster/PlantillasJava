import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String piece;
        System.out.println("Introduce la inicial del nombre de la pieza de ajedrez: ");
                piece = sc.nextLine();
        if (piece.equals("R") || piece.equals("r")){ //Rey
            System.out.println("Puede moverse en todas direcciones pero solo avanza una posición.");
        } else if (piece.equals("D") || piece.equals("d")) { //Dama o reina
            System.out.println("Puede moverse en todas direcciones y avanzar todas las posiciones que dese");
        } else if (piece.equals("A") || piece.equals("a")){ //Alfil
            System.out.println("Pude unicamente moverse en diagonal y avanzar todas las posiciones que dese");
        } else if (piece.equals("T") || piece.equals("t")){ //Torre
            System.out.println("Puede unicamente moverse en vertical u horizontaln y avanzar todas las posiciones que dese");
        } else if (piece.equals("C") || piece.equals("c")){ //Caballo
            System.out.println("Pude unicamente moverse una casilla, hacia arriba o hacia abajo verticalmente y dos casillas, hacia izquierda o derevha horizontalmente");
        } else if (piece.equals("P") || piece.equals("p")){ //Peón
            System.out.println("Puede moverse dos casillas en su primer movimiento y solo una tras este mismo en vertical hacia arriba unicamente");
        } else {
            System.out.println("Eso no es una pieaza de ajedrez");
        }
    }
}
