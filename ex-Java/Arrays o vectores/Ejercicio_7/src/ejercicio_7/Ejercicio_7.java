/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
Leer por teclado una serie de 10 numeros enteros.
La aplicacion debe indicarnos so los numeros estan ordenados 
de forma creciente, decreciente, o si estan desordednados

*/
package ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author WhiteHatHacker
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[]= new int[10];
        boolean creciente = false;
        boolean decreciente = false;
        
        System.out.println("----- Llenar el Arreglo -----");
        for(int i = 0;i<10;i++){
            System.out.print((i+1)+ ". Digite el numero: ");
            arreglo[i]= entrada.nextInt();
        }
        
        for(int i = 0;i<9;i++)
        {
            if(arreglo[i]<arreglo[i+1]){
                creciente = true;
            }
            if(arreglo[i]>arreglo[i+1]){
                decreciente = true;
            }
        }
        if(creciente == true && decreciente == false){
            System.out.println("\nLos numeros estan ordenados de forma creciente");
        }
        else if(creciente == false && decreciente == true){
            System.out.println("\nLos numeros estan ordenados de forma decreciente");
        }
        else if(creciente == true && decreciente==true){
            System.out.println("\nLos nuemros estan desordenados");
        }
        else{
            System.out.println("Los numeros son iguales");
        }
    }
    
}
