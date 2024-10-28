public class Ejercicio2 {
    public static void main(String[] args) {

        int repit;
        for (int i = 2; i < 1000; i++){ //Mientras que i no supere 1000 i aumenta en +1 cada bucle
            repit = 0;
            for (int j = 1; j <=i; j++){ //A su vez en cada una de esos bucles si i es <= j aumenta en +1 cada bucle
                if (i%j == 0){ //Si el resto de i%j es 0 repite aumenta +1
                    repit++;
                }
            }
            if (repit == 2){ //Mientras que repite no pase de 2 imprime i porque sera primo
                System.out.println(i);
            }
        }
    }
}
