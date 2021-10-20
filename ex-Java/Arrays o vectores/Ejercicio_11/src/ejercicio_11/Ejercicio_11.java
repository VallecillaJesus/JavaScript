/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_11;

import java.util.Scanner;

/**
 *
 * @author WhiteHatHacker
 */
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = true;
        int numero,sitio =0,j = 0;
      
        
        System.out.println("--- Llenar el arreglo ---");
        //Llenando el arreglo
        do{
            
            for(int i = 0; i < 5;i++){
                
                System.out.print((i+1)+ ". Digite el nuemro: ");
                arreglo[i] = entrada.nextInt();
                
            }
           //Comprobar si el arreglo esta ordenado en orden creciente
           for(int i = 0;i<4;i++){
               if(arreglo[i] < arreglo[i+1]){
                   creciente = true;
               }
               if(arreglo[i] > arreglo[i+1]){
                   creciente = false;
                   break;
               }
           }
           
           if(creciente == false){
               System.out.println("\nEl arreglo No esta ordenado en forma creciente, vuelva a digitarlo\n");
           }
        }while(creciente == false);

        System.out.println("\nDigite un elemento a insertar: ");
        numero = entrada.nextInt();
        
        //para darnos cuenta en que posicion va el numero a insertar
        while(arreglo[j] < numero && j<5){
            sitio++;
            j++;
        }
        
        for(int i = 4; i >= sitio;i--){
            arreglo[i+1]=arreglo[i];
        }
        //Insertamos el numero indicado
        arreglo[sitio] = numero;
        
        System.out.println("\n--- Resultado del arreglo ---\n");
        
        for(int i: arreglo){
            System.out.println(i);
        }
    }
    
}
