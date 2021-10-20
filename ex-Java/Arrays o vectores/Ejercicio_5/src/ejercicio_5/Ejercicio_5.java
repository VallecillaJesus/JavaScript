/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

    Ejercicio 5

    + Leer pot teclado dos tablas de 10 numeros enteros
      y mezclarlas en una tercera de la forma: 
      
      * el 1° de A
      * el 1° de B
      * el 2° de A
      * el 2° de B
*/
package ejercicio_5;

/**
 *
 * @author WhiteHatHacker
 */

import java.util.Scanner;
public class Ejercicio_5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] a,b,c;

        a = new int[10];
        b = new int[10];
        c = new int[20];
        
        //Pedimos los objetos del arreglo A
        System.out.println("---- Digita los elemmentos del arreglo A --- ");
        for(int i = 0; i < a.length; i++){
            System.out.print((i + 1)+ ". Numero del arreglo:  ");
            a[i] = entrada.nextInt();
        }
        System.out.println("---- Digita los elementos del arreglo B ----");
        //Pedimos los objetos del arreglo B
        for(int  i =0;i<b.length; i++){
            System.out.print((i + 1)+ ". Numero del arreglo:  ");
            b[i] = entrada.nextInt();
        }
        //Let mix both arrays
        //Interador i arreglo a y b
        //iterador j para el arreglo c
        
        int j = 0;
        for(int i = 0; i <10;i++){
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }
        //Imprimimos el resultado de la combinacion
        System.out.println("---- Numeros del Arreglo C ----");
        for(int i:c)
            System.out.println(i);
    }
}
