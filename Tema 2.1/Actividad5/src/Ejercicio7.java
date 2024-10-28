import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        //Luis Bernabeu Fuster
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int limite;
        int i = 2;
        int total;
        System.out.print("Introduce el primer numero: ");
        num1 = sc.nextInt();
        while (num1 <= 0 ) {
            System.out.println("Primer numero erroneo imposible realizar");
            System.out.print("Introduce de nuevo el primer numero: ");
            num1 = sc.nextInt();
        }

        System.out.print("Introduce el segundo numero: ");
        num2 = sc.nextInt();
        while (num2 <= num1){
            System.out.println("Segundo numero menor que el primero, error fatal");
            System.out.print("Introduce de nuevo el segundo numero: ");
            num2 = sc.nextInt();
        }

        System.out.print("Introduce el limite de numeros totales en la serie:");
        limite = sc.nextInt();
        while (limite <= 2 || limite >= 30){
                System.out.println("Limite erroneo");
                System.out.print("Introduce de nuevo el limite de numeros totales en la serie:");
                limite = sc.nextInt();
        }

        System.out.print(num1 + " " + num2 + " ");
        do {
                    total = num1 + num2;
                    System.out.print(total + " ");
                    num1 = num2;
                    num2 = total;
                    i++;
        } while (limite > i );
    }
}
