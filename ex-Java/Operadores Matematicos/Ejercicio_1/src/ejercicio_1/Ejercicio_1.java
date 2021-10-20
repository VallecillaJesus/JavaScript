/*Ejercicio 1 : Programa que calcula y imprima la suma
de tres calificaciones */
package ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {


    public static void main(String[] args) {
        float nota1,nota2,nota3,resultado;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe las 3 notas obtenidas: ");
        
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        
        resultado = nota1+nota2+nota3;
        
        System.out.println("\nLa suma total de las notas es: "+ resultado);
        
    }
    
}
