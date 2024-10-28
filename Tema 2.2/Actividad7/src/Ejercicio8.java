public class Ejercicio8 {
    public static void main(String[] args) {

        int contador = 0;
        int repit;
        for (int i = 1; contador < 50; i++){
            repit = 0;
            for (int j = 1; j <=i; j++){
                if (i%j == 0){
                    repit++;
                }
            }
            if (repit == 2){
                System.out.println(i);
                contador++;
            }
        }
    }
}
