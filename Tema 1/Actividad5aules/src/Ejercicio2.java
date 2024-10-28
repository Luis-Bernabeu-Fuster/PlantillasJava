public class Ejercicio2 {
    public static void main(String[] args) {

        System.out.println(1/2 + 1/2); //Da 0 porque la operación no esta preparada para trabajar con decimas
        System.out.println( 1.0/2 +  1.0/2);
        System.out.println( 1/2.0 +  1/2.0);

        //Ejercicio 3
        System.out.println(-9/10);
        System.out.println(9/10);
        //Da 0 porque las operaciones no estan preparadas para trabajar con decimas

        //Ejercicio 4
        System.out.println((35 + 0.0)/7); //Double

        //Ejercicio 5
        System.out.println( (3/4 + 6.7) / 3.0); // 1 operación (3/4)= Dato devuelto es 0 int
                                                // 2 operación (0 + 6.7)= Dato devuelto es 6.7 Double
                                                // 3 operación (6.7/3.0)= Dato devuelto es 2.234 Double

        //Ejercicio 6
        int entero = 10;
        double decimal = 20.0;
        System.out.println((decimal / entero - 2) / 4); //Resultado 0.0 Tipo de dato Double

    }
}
