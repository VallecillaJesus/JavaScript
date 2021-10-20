/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Crear un programa que lea por teclado una tabla de 10 numeros enteros y desplace
N posiciones en el arreglo(N es digitado por el usuario).
 */
package ejercicio_10;

import java.util.Scanner;

/**
 *
 * @author WhiteHatHacker
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Inicializamos las variables
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int posiciones;
        int iterador;
        
        //Pedimos los valores del arreglo
        System.out.println("--- LLene el arreglo ---");
        for(int i = 0; i<10;i++){
            System.out.print((i+1) + ". Digite el numero:  ");
            arreglo[i] = entrada.nextInt();
        }
        //Pedimos el numero de posiciones que desea dezplazar
        System.out.println("\n");
        System.out.print("Cuantas posiciones quiere que se desplaze:  ");
        posiciones = entrada.nextInt();
        
        //Empezamos con la parte logica del codigo
        iterador = 9 - posiciones;
        int ultimos[] = new int[posiciones];
        int h = 9 - posiciones;
        for(int i = 0;i<posiciones;i++){
            h++;
            ultimos[i] = arreglo[h];
        }
        for(int i=iterador;i>=0;i--){
            arreglo[i+posiciones]=arreglo[i];
        }
        for(int i =0;i<posiciones;i++){
            arreglo[i] = ultimos[i];
        }
        //Mostramos el resultado en el arreglo
        for(int i : arreglo){
            System.out.println(i);
        }
    }
    
}
