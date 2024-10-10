import java.util.Scanner;

public class PlantillaMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nav;
        boolean correcto = false;
        System.out.println("Sleeccione una opcion");
        System.out.println("Pulse 1 para abrir la imagene");
        System.out.println("Pulse 2 para borrar la imagen");
        System.out.println("Pulse 3 para salir del menu de opciones");

        do {
            try {
                do {
                    System.out.print("Introduce la opción que desa: ");
                    nav = sc.nextInt();
                    correcto = true;
                    switch (nav) {
                        case 1:
                            System.out.println("Abriendo imagen.");
                            System.out.println("Opción Valida");
                            break;
                        case 2:
                            System.out.println("Borrando imagen.");
                            System.out.println("Opción Valida");
                            break;
                        case 3:
                            System.out.println("Sliendo del menu.");
                            System.out.println("Opción Valida");
                            break;
                        default:
                            System.out.println("No ha elegido ninguna opción valida");
                            correcto = false;
                    }
                } while (!correcto);

            } catch (Exception e) {
                System.out.println("Solo se permiten números, vuelva a probar.");
                sc.next();
                correcto = false;
            }
        }while (!correcto);
    }
}
