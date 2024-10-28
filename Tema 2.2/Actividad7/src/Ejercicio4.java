import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Introduce la altura de la tabla: ");
        a = sc.nextInt();
        System.out.print("Introduce el ancho de la tabla: ");
        b = sc.nextInt();

        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++) {
                System.out.print("#");
            }
            System.out.println();
        }


    }
}
