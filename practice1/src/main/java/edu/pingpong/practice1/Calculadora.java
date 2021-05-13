package edu.pingpong.practice1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        operaciones();
    }

    public static void operaciones(){
    
        sumar sumar = new sumar();
        restar restar = new restar();
        multiplicar multiplicar = new multiplicar();
        dividir dividir = new dividir();
        resto resto = new resto();

        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
 
        while (!salir) {
 
            System.out.println("1. Opcion 1 - Sumar.");
            System.out.println("2. Opcion 2 - Restar.");
            System.out.println("3. Opcion 3 - Multiplicar.");
            System.out.println("4. Opcion 4 - Dividir.");
            System.out.println("5. Opcion 5 - Resto division.");
            System.out.println("6. Opcion 6 - Salir.");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        sumar.suma();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        restar.resta();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        multiplicar.operacionMultiplicar();
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4");
                        dividir.operacionDividir();
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opcion 5");
                        resto.operacionResto();
                        break;
                    case 6:
                        salir = true;
                        System.out.println("Gracias por usar la calculadora, hasta la proxima.");
                        break; 

                    default:
                        System.out.println("Solo numeros entre 1 y 6");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un numero");
                teclado.next();
            }
        }    
    }
}