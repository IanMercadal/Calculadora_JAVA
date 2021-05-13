package edu.pingpong.practice1;


public class Calculadora {

    public static void main(String[] args) {
        operaciones();
    }

    public static void operaciones(){
    
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
 
        while (!salir) {
 
            System.out.println("1. Opcion 1 - Sumar.");
            System.out.println("2. Opcion 2 - Restar.");
            System.out.println("3. Opcion 3 - Multiplicar.");
            System.out.println("4. Opcion 4 - Dividir.");
            System.out.println("5. Opcion 5 - Salir.");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        //fiveOrderedNumbers.five();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        //fiveInverseNumbers.fiveInverse();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        //numbersPositiveNegatives.posNeg();
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4");
                        //stringLength.stringInputLenght();
                        break;
                    case 5:
                        salir = true;
                        break; 

                    default:
                        System.out.println("Solo nnmeros entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un numero");
                teclado.next();
            }
        }    
    }
}