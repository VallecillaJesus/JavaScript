/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Crear un programa que lea por teclado una tabla de 10 numeros enteros
y la desplaze una posicion hacia abajo: el primero pasa a ser el segundo
el segundo pasa a ser el tercero y asi sucesivament, El ultimo a ser el primero

 */
package ejercicio_9;

/**
 *
 * @author WhiteHatHacker
 */
import java.util.Scanner;
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int ultimo;
        
        for(int i = 0; i < 10;i++){
            System.out.print((i+1)+ ". Digita el numero:  ");
            arreglo[i] = entrada.nextInt();
        }
        ultimo = arreglo[9];//Guardamos el ultimo elemennto del arreglo
        for(int i= 8;i>=0;i--){
            arreglo[i+1]=arreglo[i];
        }
        arreglo[0] = ultimo;
        System.out.println("\n");
        for(int i:arreglo){
            System.out.println(i);
        }
    }
    
}
