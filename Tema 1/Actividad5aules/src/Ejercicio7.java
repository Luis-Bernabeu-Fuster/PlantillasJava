import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        System.out.println( 5.6+-14 );// Resultado -8.4 Double
        System.out.println((12+0.01)/3);// Resultado 4.003333333333333 Double
        System.out.println((18.0-23.3)/(64-13));// Resultado -0.103921568627451 Double
        System.out.println(-23.49*3.5);//Resultado -82.21499999999999 Double
        System.out.println((34-12)*(9/10)+1.2);//Rsultado 1.2 Double
        System.out.println(-8/16+3.5);//Resultado 3.5 Double


        //Ejercicio 8
        System.out.println(10%5);
        System.out.println(-3%2);
        System.out.println(-8%4);
        System.out.println(7%2);
        System.out.println(100%3);


        //Ejercicio 9
        final int salarioXhora = 20;
        final double precioMenu = 8.58;
        final double PI = Math.PI * 2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantas horas has trabajado: ");
        double horas = sc.nextDouble();
        System.out.println("Al haber trabajado " + horas + " has ganado: " + (salarioXhora * horas) + "€");

        System.out.print("Cuntos menus se han pedido: ");
        int cantidadMenu = sc.nextInt();
        System.out.println("Se han pedido " + cantidadMenu + " la factura es de: " + (precioMenu*cantidadMenu) + "€");

        System.out.print("Cuanto mide el radio del circulo: ");
        double radio = sc.nextDouble();
        System.out.println("El perimetro de el circulo con radio " + radio + " es de: " + (PI*radio) + "cm");

    }
}
