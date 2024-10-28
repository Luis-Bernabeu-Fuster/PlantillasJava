public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("A");
        for (int f = 0; f < 5; f++){
            for (int c = 0; c <= f; c++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("B");
        for (int f = 0; f < 5; f++){
            for (int c = 0; c <= f; c++){
                System.out.print("\b *");
            }
            System.out.println();
        }

        System.out.println("C");
        for (int f = 1; f <= 5; f++){
            for (int c = f; c >= 1; c--){
                System.out.print(c);
            }
            System.out.println();
        }

        System.out.println("\b");
        System.out.println("D");
        for (int f = 0; f <= 5; f++) {
            for (int c = 5; c >= f; c--) {
                System.out.print(" ");
            }
            for (int k = 0; k < f; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
