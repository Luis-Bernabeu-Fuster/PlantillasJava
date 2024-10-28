public class EjemploBucle {
    public static void main(String[] args) {
        /*
        for (int fila = 1; fila <= 4; fila++) { //para cada una de las 4 filas
                    for (int col = 1; col <= 9; col ++) //para cada una de las 9 columnas
                            System.out.print(col * fila + "\t"); //muestra la multiplicación
                    System.out.println(); //Empieza una nueva fila
        }
         */

        for (int fila = 1; fila <= 5; fila++) { //para cada una de las 4 filas
                    for (int col = 1; col <= ( 6 - fila ); col ++) //para cada una de las 9 columnas
                           System.out.print("#"); //muestra la multiplicación
                    System.out.println(); //Empieza una nueva fila
        }
    }
}
