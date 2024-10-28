import java.util.Scanner;

public class Ejercici1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Eres el propietario de la máquina: ");
        boolean isOwner = sc.nextBoolean();

        if (isOwner == true){
            System.out.println("Hola bien venido al sistema");
        }else {
            System.out.println("Acceso denegado");
        }
    }
}
