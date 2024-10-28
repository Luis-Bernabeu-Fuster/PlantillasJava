import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero binario: ");
        String bin = sc.nextLine(); //Recogemos el binario con un STRING
        int decimal = Integer.parseInt(bin,2); //Usamos Intger.parseInt para pasar el binario que hemos recogido y ponemos el 2 para que pase a decimal
        //Agregar que la variable que guarde el resultado del binario una vez que ya sea decimal a de ser de tipo (Int)
        System.out.println("El numero transformado a decimal da como resultado: " + decimal);
    }
}
