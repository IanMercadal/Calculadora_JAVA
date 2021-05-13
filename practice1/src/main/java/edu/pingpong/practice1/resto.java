package edu.pingpong.practice1;

import java.util.Scanner;

public class resto{
    public void operacionResto(){

        System.out.println("Introduce 2 numeros");

        System.out.println("Introduce el primer numero");
        Scanner entrada = new Scanner(System.in);
        float numero1 = entrada.nextFloat();

        System.out.println("Introduce el segundo numero");
        Scanner entrada2 = new Scanner(System.in);
        float numero2 = entrada.nextFloat();
    
        float sumaTotal = numero1 / numero2;

        System.out.println("El resto de la division es: " + (numero1 % numero2));
    }
}
