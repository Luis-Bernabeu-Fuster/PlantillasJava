import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero que inicia la cuenta regresiva: ");
        n = sc.nextInt();

        do {
            System.out.println(n);
            n--;
        } while (n >= 0);
    }
}
