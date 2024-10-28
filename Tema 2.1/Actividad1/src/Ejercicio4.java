import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double precio = 0;
        System.out.println("Introduce el precio del articulo: ");
        precio = sc.nextDouble();

        if (precio >= 300.00){
            System.out.println("Tu articulo es igual o supera los 300€, por ello se aplica el impuesto del 5%: " + (precio*0.05+precio));
        }else {
            System.out.println("Tu articulo es menor de 300€, por ello esta libre del impuesto");
        }
    }
}
