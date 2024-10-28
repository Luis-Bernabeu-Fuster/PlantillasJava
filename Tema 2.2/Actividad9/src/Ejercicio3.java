public class Ejercicio3 {
    public static int voltea(int i) {
        int volteado = 0;
        int digito;
        while (i > 0) {
            digito = i % 10; //digito es igual al resto de 10/ el num
            i = i / 10; // num pasa a valer el reusultado de num/10
            volteado = volteado * 10 + digito;
        }
        return volteado;
    }
    public static boolean capicua(int i){
        if (i != voltea(i)){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        for (int i = 10; i < 9999; i++) {
            if (capicua(i)){
                System.out.println(i);
            }
        }
    }
}

