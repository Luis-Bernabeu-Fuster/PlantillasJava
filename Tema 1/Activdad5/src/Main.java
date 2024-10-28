import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el tamaño de un lado del cuadrado: ");
        double ladoCuadrado = sc.nextInt();
        double areaCuadrado = Math.pow(ladoCuadrado,2);
        System.out.println("El área del cuadrado es: " + areaCuadrado + " cm");

        System.out.print("Introduce el tamaño del  largo del rectangulo: ");
        double largoRactangulo = sc.nextDouble();
        System.out.print("Introduce el tamaño del ancho del rectangulo: ");
        double anchoRectangulo = sc.nextDouble();
        double perimetroRectangulo = ( 2* (largoRactangulo + anchoRectangulo) );
        System.out.println("El perimetro del  rectangulo es: " + perimetroRectangulo + " cm");

        System.out.print("Introduce la base del triangulo: ");
        double baseTriangulo = sc.nextDouble();
        System.out.print("Introduce la altura del triangulo: ");
        double alturaTriangulo = sc.nextDouble();
        double areaTriangulo= (baseTriangulo * alturaTriangulo)/2;
        System.out.println("El área del triangulo es: " + areaTriangulo + " cm");

        System.out.print("Introduce el radio del circulo: ");
        double radioCirculo = sc.nextDouble();
        double areaCirculo = Math.PI * (radioCirculo * radioCirculo);
        double circunferncia = Math.pow(radioCirculo,2) * Math.PI ;
        System.out.println("El área del circulo es de: " + areaCirculo + " cm" );
        System.out.println("La circunferencia es de :" + circunferncia + " cm");

    }
}
