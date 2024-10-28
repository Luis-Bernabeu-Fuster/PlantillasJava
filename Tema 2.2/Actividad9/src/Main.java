import java.util.Scanner;

public class Main {

        public static int pideNum() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce el numero a operar: ");
            return sc.nextInt();
        }
        public static int pideNum2(){
            int posicion;
            Scanner sc2 = new Scanner(System.in);
            System.out.print("Numero: ");
            posicion = sc2.nextInt();
            return posicion;
        }
        public static boolean capicua(int num){ //bolean para que sea verdadero o falso
            if (num != voltea(num)){ //Si num es diferente de el numero volteado
                return false; //devuelve falso
            }
            return true; //sino devuelve verdadero
        }
        public static boolean primo(int num) { //Opción 2
            int veces = 0;
            for (int i = 2; i <= num; i++) {
                if (num % i == 0) {
                    veces++;
                    if (veces >= 2) {
                        return false;
                    }
                }
            }
            return true;
        }
        public static int sigPrimo(int num) { //Opción 3
            int siguiente = num;
            do {
                siguiente++;
            }while (primo(siguiente) == false);
            return siguiente;
        }
        public static int potencia(int num){
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Exponente para la base: ");
            int exponente = sc1.nextInt(); //Recoge el numero para que sea exponente
            int potencia = (int) Math.pow( num, exponente); //Numero elevado al exponente que hemos escrito en la linea anterior
            return potencia;
        }
        public static int cuentanum(int num){
            int contador = 0;
            int div = 0;
           while (num > 0){ //Minetras el numero sea mayor a 0
               num = num/10; //Divide entre 10 para ir quitando digitos
               contador++; //
           }
            return contador;
        }
        public static int voltea(int num){ //Opción 6
            int volteado = 0;
            int digito;
            while (num > 0){
                digito = num %10; //digito es igual al resto de 10/ el num
                num = num/10; // num pasa a valer el reusultado de num/10
                volteado =volteado * 10 + digito;
            }
            return volteado;
        }
        public static int digitoN(int num){
            Scanner sc5 = new Scanner(System.in);
            int digito;
            int solucion;
            System.out.print("Que posición desa conocer: ");
            int posicion = sc5.nextInt();
            digito = (int) Math.pow(10,(cuentanum(num)-1) - posicion); //diez elevado a la cantidad de digitos del numero que analizamos MENOS 1 para que empiece a contar desde 0 y el resultado MENOS  la posicion que queremos averiguar
            solucion = num / digito; //el numero entre el 10 elevado
            solucion = solucion % 10;//Aqui selecciona el numero que esta en la posicion elegida
            return solucion;
        }
        public static int posicion(int num){
            int posicion = 0;
            int vuelta = voltea(num);
            Scanner sc2 = new Scanner(System.in);
            System.out.print("Introduce el digito que busca: ");
            int busca = sc2.nextInt();
            while (vuelta > 0){ //Usando el volteanum se contara de izquiera a derecha
                int numactual = vuelta % 10; //Cogemos el ultimo digito del numero introducido dado la vuelta
                if (numactual == busca) { //Si el numero actual es igual al que buscabamos
                    return posicion; // Devuelve el valor de posición
                }
                    vuelta = vuelta/10; //Elimina el ultimo dgito que tenia el numero
                    posicion++; //Posición aumenta +1 y vuelve al bucle

            }
            return -1;//Si se termina el bucle y no se encuentra el numero que se busca devuelve -1
        }
        public static int quitaDetras(int num){
            int quita;
            int cont = 0;
            int numero = 0;
            Scanner sc3 = new Scanner(System.in);
            System.out.print("Cuantos digitos desa quitar: ");
            quita = sc3.nextInt();
            while (cont < quita){ //Mentras el contador es menor a la cantidad de digitos a quitar
                numero = num % 10; //Cogemos el resto del numero introducido para que no moleste al dividir
                num = num / 10; // Despues lo dividimos entre 10 y hacemos que aumente contador
                cont++;
            }
            return num;
        }
        public static int quitaAlante(int num){
            num = voltea(num); //Voltea el numero
            num = quitaDetras(num); //Llamas a quitaDetras
            num = voltea(num); //Y el resultado de quitaDetras lo voltea de nuevo
            return num;
        }
        public static int pegaDetras(int num){
          Scanner sc4 = new Scanner(System.in);
          int pega;
          int ayuda = 0;
          System.out.print("Numero para pegar: ");
          pega = sc4.nextInt();
          ayuda = cuentanum(pega); //Hacemos que una variable coja el valor que da "cuentanum" al numero que queremos pegar detras
          ayuda = (int) Math.pow(10,ayuda); //Esa variable la usamos para elvear 10
          num = num * ayuda; //multiplicamos el numero por la variable
          pega = num + pega; // y por ultimo sumamos el numero al numero que queremos pegar
          return pega;
        }
        public static int pegaAlante(int num){
            num = voltea(num);
            num = pegaDetras(num);
            num = voltea(num);
            return num;
        }
        public static int trozoDeNumero(int num){
            Scanner resp = new Scanner(System.in);
            int vuelta;
            int numeroSin = 0;
            int digito = 0;
            System.out.print("Parametro inicial: ");
            int resp1 = resp.nextInt(); //Recoge el numero por el que se desa iniciar
            System.out.print("Parametro final: ");
            int resp2 = resp.nextInt(); //Recoge el numero final por el que se desa que termine
            vuelta = voltea(num); //Volteamos el numero, lo guardamos en esta variable

            while ( resp1 != digito) { //Mientras el digito tenga un valor diferente al numero inicial recogido(rep1)
                digito = vuelta % 10; //El digito valdra el resto de dividr la variable(vuelta) entr 10
                numeroSin = vuelta; //Esta variable guardara el valor que tiene vuelta tras quitar el resto
                vuelta = vuelta / 10; //Por ultimo el valor de la variable(vuelta) se actualizara al resultado de dividir "vuelta" entre 10
            }
            vuelta = voltea(numeroSin); //Hcemos que la variable vuelta tenga el valor de la variable "numeroSin" pero volteada
                while (resp2 != digito) { //Mientras el digito tenga un valor diferente al numero inicial recogido(rep2)
                    digito = vuelta % 10; //Se repite lo mismo que lo anteriormente mencionado
                    numeroSin = vuelta;
                    vuelta = vuelta / 10;
            }
            return numeroSin; //Devuelve "numeroSin"
        }
        public static int juntaNum(int num, int posicion){//14
            int solucion = 0;
            int ayuda = 0;
            ayuda = (int) Math.pow(10,cuentanum(posicion));
            num = ayuda * num;
            solucion = num + posicion;
            return solucion;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nav;
        boolean correcto = false;
        System.out.println("""
        Sleeccione una opcion:
        1. esCapicua
        2. esPrimo
        3. siguientePrimo
        4. potencia
        5. digitos
        6. voltea
        7. digitoN
        8.  posicionDeDigito
        9. quitaPorDetras
        10. quitaPorDelante
        11. pegaPorDetras
        12. pegaPorDelante
        13. trozoDeNumero
        14. juntaNumeros""");

        do {
            try {
                do {
                    System.out.print("Introduce la opción que desa: ");
                    nav = sc.nextInt();
                    correcto = true;
                    switch (nav) {
                        case 1:
                            System.out.println("¿ El numero insertado es capicua ?");
                            if (capicua(pideNum())){
                                System.out.println("VERDADERO");
                            } else {
                                System.out.println("FALSO");
                            };
                            break;
                        case 2:
                            System.out.println("¿ El numero insertado es primo ?");
                            if (primo(pideNum())){
                                System.out.println("Es primo");
                            } else {
                                System.out.println("No es primo");
                            }
                            break;
                        case 3:
                            System.out.println("El menor primo que es mayor al número introducido es: " + sigPrimo(pideNum()));
                            break;
                        case 4:
                            System.out.println("Dada la base y la potencia es resultado es: " + potencia(pideNum()));
                            break;
                        case 5:
                            System.out.println("El total de digitos que tiene el numero introducido es: " + cuentanum(pideNum()));
                            break;
                        case 6:
                            System.out.println("El numero  al reves es " + voltea(pideNum()));
                            break;
                        case 7:
                            System.out.println("Devuelve el dígito que está en la posición de un número entero: " + digitoN(pideNum()));
                            break;
                        case 8:
                            System.out.println("Si aparece -1 es que el digito que busca no aparece en el numero introducido");
                            System.out.println("El numero que has introducido aparece por primeravez en la posición: " + posicion(pideNum()));
                            break;
                        case 9:
                            System.out.println("Tras eliminar la cantidad de digitos a la derecha insertada, el numero resultante es: " + quitaDetras(pideNum()));
                            break;
                        case 10:
                            System.out.println("Tras eliminar la cantidad de digitos a la derecha insertada, el numero resultante es: " + quitaAlante(pideNum()));
                            break;
                        case 11:
                            System.out.println("Tras añadir delante la cantidad de digitos insetrada, el numero resultante es: " + pegaDetras(pideNum()));
                            break;
                        case 12:
                            System.out.println("Tras añadir delante la cantidad de digitos insetrada, el numero resultante es: " + pegaAlante(pideNum()));
                            break;
                        case 13:
                            System.out.println(trozoDeNumero(pideNum()));
                            break;
                        case 14:
                            System.out.println(juntaNum(pideNum(),pideNum2()));
                            break;
                        default:
                            System.out.println("No ha elegido ninguna opción valida");
                            correcto = false;
                    }
                } while (!correcto);

            } catch (Exception e) {
                System.out.println("Solo se permiten números, vuelva a probar.");
                sc.next();
                correcto = false;
            }
        }while (!correcto);
        System.out.println("Hecho por Luis Bernabeu Fuster ©");
    }
}