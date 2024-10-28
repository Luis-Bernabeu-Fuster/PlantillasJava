import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String guess;
        System.out.print("Adivina mi nombre jefe: ");
        guess = sc.nextLine();

        for (String pato = "Duffy Dack"; !guess.equals(pato) ;){
            System.out.print("Yo no me llamo asi bobolon, prueba otra vez: ");
            guess = sc.nextLine();
        }
        System.out.print("Has acertado my nombre");
    }
}
