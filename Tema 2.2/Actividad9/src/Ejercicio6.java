import java.util.Scanner;

public class Ejercicio6 {
    public static int Decimal(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero a Operar: ");
        return sc.nextInt();

    } //Recogemos numero de tipo (Int)
    public static String Binario(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero a Operar: ");
        return sc.nextLine();
    } //Recogemos variables de tipo (String)

    public static String DB(int Decimal){
        return Integer.toBinaryString(Decimal);
    }
    public static String DH(int Decimal){
        return  Integer.toHexString(Decimal).toUpperCase();
    }
    public static String DO(int Decimal){
        return Integer.toOctalString(Decimal);
    }

    public static int BD(String Binario){
        return Integer.parseInt(Binario,2);
    }
    public static String BH(String Binario){
        int decimal = BD(Binario);
        return DH(decimal);
    }
    public static String BO(String Binario){
        int decimal = BD(Binario);
        return DO(decimal);
    }

    public static String HB(String Binario){
        int decimal = HD(Binario);
        return DB(decimal);
    }
    public static int HD(String Binario){
        return Integer.parseInt(Binario, 16);
    }
    public static String HO(String Binario){
        int decimal = HD(Binario);
        return DO(decimal);
    }

    public static String OB(String Binario){
        int decimal = OD(Binario);
        return DB(decimal);
    }
    public static int OD(String Binario){
        return Integer.parseInt(Binario,8);
    }
    public static String OH(String Binario){
        int decimal = OD(Binario);
        return DH(decimal);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nav;
        boolean correcto = false;
        System.out.println("""
                Sleeccione una opcion:
                1 - Decimal a Binario.
                2 - Decimal a Hexadecimal.
                3 - Decimal a Octal.
                
                4 - Binario a Decimal
                5 - Binario a Hexadecimal
                6 - Binario a Octal
                
                7 - Hexadecimal a Binario
                8 - Hexadecimal a Decimal
                9 - Hexadecimal a Octal
                
                10 - Octal a Binrio
                11 - Octal a Decimal
                12 - Octal a Hexadecimal
                """);


        do {
            try {
                do {
                    System.out.print("Introduce la opción que desa: ");
                    nav = sc.nextInt();
                    correcto = true;
                    switch (nav) {
                        case 1:
                            System.out.println("El Decimal pasado a binario da como resultado: " + DB(Decimal()));
                            break;
                        case 2:
                            System.out.println("El Decimal pasado a Hexadecimal da como resultado: " + DH(Decimal()));
                            break;
                        case 3:
                            System.out.println("El Decimal pasado a Octal da como resultado: " + DO(Decimal()));
                            break;
                        case 4:
                            System.out.println("El Binario pasado a Decimal da como resultado: " + BD(Binario()));
                            break;
                        case 5:
                            System.out.println("El Binario pasado a Hexadecimal da como resultado: " + BH(Binario()));
                            break;
                        case 6:
                            System.out.println("El Binario pasado a Octal da como resultado: " + BO(Binario()));
                            break;
                        case 7:
                            System.out.println("El Hexadecimal pasado a Binario da como resultado: " + HB(Binario()));
                            break;
                        case 8:
                            System.out.println("El Hexadecimal pasado a Decimal da como resultado: " + HD(Binario()));
                            break;
                        case 9:
                            System.out.println("El Hexadecimal pasado a Octal da como resultado: " + HO(Binario()));
                            break;
                        case 10:
                            System.out.println("El Ocatl pasado a Binario da como resultado: " + OB(Binario()));
                            break;
                        case 11:
                            System.out.println("El Ocatl pasado a Decimal da como resultado: " + OD(Binario()));
                            break;
                        case 12:
                            System.out.println("El Ocatl pasado a Hexadecimal da como resultado: " + OH(Binario()));
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
    }
}
