public class Ejercicio2 {
    public static void main(String[] args) {

        //2.a
/*
        int k = 0;
        switch (k) {
            case 0: //Si K es igual a 0 se escribira zero
                System.out.println("zero");
                break;
            case 1: //Si K es igual a 1 se escribira one
                System.out.println("one");
                break;
            default: //Si K no es ni 0 ni 1 por defecto escribira default
                System.out.println("default");
        }
*/
        //2.b
        /*
        int k = 0;
        switch (k + 1) {
            case 0: //Si tras sumar +1 K es igual a 0 se escribira zero
                System.out.println("zero");
                break;
            case 1: //Si tras sumar +1 K es igual a 1 se escribira one
                System.out.println("one");
                break;
            default: //Si tras sumar +1 K es diferente a 0 o 1 se escribira default
                System.out.println("default");
                break; //Despues del default no hace falta break
        }
*/
        //2.c
        /*
        int k = 6;
        switch (k / 3.0) { //El switch no permite trabajar con doubels así que habria que cambiar el 3.0 a "int"
            case 2:
                System.out.println("zero");
                break;
            case 3:
                System.out.println("one");
                break;
            default:
                System.out.println("default");
                break; //Despues del default no hace falta break
        }
*/
        //2.d
        /*
        int k = 6;
        switch (k / 3) {
            case 1:
                System.out.println("zero");
                break;
            case 3:
                System.out.println("one");
                break;
                //Esta mal porque no tiene un default
        }
*/
        //2.e
/*
        int k = 3;
        switch (k) {
            case 1: //Si K es igual a 1 escribira one
                System.out.println("one");
            case 2: // Si K es igual a 2 escribira two
                System.out.println("two");
            case 3: //Si K es igual a 3 escribira three
                System.out.println("three");
            case 4: //Si K es igual a 4 escribira four
                System.out.println("four");
            default: //Si K no es ninguna de las anteriores escribira default
                System.out.println("default"); //Flta un break debajo de cada caso para que no imprima seguido
        }
*/
        //2.f
        /*
        int k = 3;
        switch (k) { //Esta mal ya que si k es igual a 1,2,3 o 4 imprimira todos los casos seguidos
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("default");
        }
*/
        //2.g
        /*
        int k = 1;
        switch (k) { //El case 1 no hace nada y tampoco tiene un break asique si K es igual a 1 imprimira el case 2
            case 1:
            case 2:
                System.out.println("one");
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("default");
        }
*/
        //2.h
        /*
        int k = 1;
        switch (k) { //No puede existir dos veces el case 2 y no hay un default
            case 1:
            case 2:
                System.out.println("one");
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
            case 2:
                System.out.println("four");
                break;
        }
*/
        //2.i
        /*
        int k = 1;
        switch (k) { //El case 1 no hace nada y ademas despues del break no hay ni un case ni un default asique el sout no funcionara
            case 1:
            case 2:
                System.out.println("one");
                System.out.println("two");
                break;
            System.out.println("four");
        }
*/
    }
}
