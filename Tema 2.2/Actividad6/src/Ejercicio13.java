import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
                                                //LUIS BERNABEU FUSTER
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int dinero;
        int cont = 0;
        String resp;

        do {
            System.out.print("Introduce la cantidad de dinero que quieres descomponer: ");
            dinero = sc.nextInt();
            if (dinero > 0) {
                for (; dinero >= 500; dinero -= 500, cont++) {
                }
                System.out.println("Hay " + cont + " billetes de 500€");
                cont = 0;
                for (; dinero >= 200; dinero -= 200, cont++) {
                }
                System.out.println("Hay " + cont + " billetes de 200€");
                cont = 0;
                for (; dinero >= 100; dinero -= 100, cont++) {
                }
                System.out.println("Hay " + cont + " billetes de 100€");
                cont = 0;
                for (; dinero >= 50; dinero -= 50, cont++) {
                }
                System.out.println("Hay " + cont + " billetes de 50€");
                cont = 0;
                for (; dinero >= 20; dinero -= 20, cont++) {
                }
                System.out.println("Hay " + cont + " billetes de 20€");
                cont = 0;
                for (; dinero >= 10; dinero -= 10, cont++) {
                }
                System.out.println("Hay " + cont + " billetes de 10€");
                cont = 0;
                for (; dinero >= 2; dinero -= 2, cont++) {
                }
                System.out.println("Hay " + cont + " monedas de 2€");
                cont = 0;
                for (; dinero >= 1; dinero -= 1, cont++) {
                }
                System.out.println("Hay " + cont + " monedas de 1€");
                cont = 0;
            }else {
                System.out.println("Error el numero introducido es negativo , imposible realizar.");
            }
            System.out.println("Hecho por Luis©");
            System.out.print("Desea volver a ejecutando el programa (si/no): ");
            resp = sc1.nextLine().toUpperCase();
        }while (resp.equals("SI"));
        System.out.println("Sliendo del programa.");
    }
}