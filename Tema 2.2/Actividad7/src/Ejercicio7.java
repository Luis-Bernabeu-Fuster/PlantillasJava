public class Ejercicio7 {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++){
            for (int j = 1; j <= i ;j++ ){
                if ((j%2) != 0){
                    System.out.print("* ");
                } else {
                    System.out.print("o ");
                }
            }
            System.out.println();
        }

    }
}
