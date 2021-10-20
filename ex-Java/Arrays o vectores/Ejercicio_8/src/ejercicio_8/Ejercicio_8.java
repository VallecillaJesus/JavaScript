/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Diseñar una aplicacion que declare una tabla de 10 elementos enteros
Leer mediante el teclado 8 nummeros
Despues se debe pedir un numero y una posicion
Insertarlo en la posicion indicada, desplazando los que eten detras
*/
package ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author WhiteHatHacker
 */
public class Ejercicio_8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tabla[] = new int[10],numero,numeroPosicion,posicion;
        boolean space = false;
        
        System.out.println("---- Ingresar 8 numeros a la tabla ----");
        for(int i = 0; i < 8;i++){
            System.out.print((i+1) +". Digita el numero: ");
            tabla[i] = entrada.nextInt();
        }
        System.out.println("\n\n---- Digite el numero que desea ingresar -----");
        System.out.print("Digite el numero: ");
        numero = entrada.nextInt();
        System.out.println("---- Digite la posicion del numero que desea ingresar ----");
        System.out.print("Digite posicion:");
        posicion = entrada.nextInt();
        int distancia=-1;
        numeroPosicion = posicion;
        int iterador = posicion;
        
            for(int i:tabla){
                if(tabla[i]>posicion){
                    distancia++;
                } 
            } 
            
        for(int i = 0; i<distancia;i++){
            posicion++;
            tabla[posicion]=tabla[iterador];
            iterador++;
        }
        tabla[numeroPosicion]=numero;
        
        for(int i:tabla){
            System.out.println(i);
        }
    }
}
