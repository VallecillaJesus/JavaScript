/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Leer 10 enteros en una tabla. guardar en otra tabla
los elementos pares de la primera, y a continuacion
los elementos impares.
 */
package ejercicio_13;

import java.util.Scanner;

/**
 *
 * @author WhiteHatHacker
 */
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int enteros[] = new int[10];
        int conteo_pares = 0, conteo_impares=0;
        
        System.out.println("--- Llenando el arreglo");
        for(int i = 0; i<10;i++){
            System.out.print((i+1)+ ". Digite el nuemro:  ");
            enteros[i] = entrada.nextInt();
            if((enteros[i]%2)== 0){
                conteo_pares++;
            }
            else{
                conteo_impares++;
            }
        }
        int par[] = new int[conteo_pares], impar[] = new int[conteo_impares];
        int h =0;
        int j = 0;
        for(int i = 0; i<10;i++){
            if((enteros[i]%2)== 0){
                par[h] = enteros[i];
                h++;
                
            }
            else
            {
                impar[j] = enteros[i];
                j++;
            }
        }
        System.out.println("\n\n\t\t-- TABLA ENTEROS --");
        for(int i: enteros){
            System.out.println(i);
        }
        System.out.println("\n\n-- RESULTADOS --");
        System.out.println("--- Impares ---");
        for(int i:impar){
            System.out.println(i);
        }
        System.out.println("--- Pares ---");
        for(int i:par){
            System.out.println(i);
        }
    }
    
}
