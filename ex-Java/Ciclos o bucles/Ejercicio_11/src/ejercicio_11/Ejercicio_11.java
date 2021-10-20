/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_11;

/**
 *
 * @author INTERNET
 */
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long numero,impares = 1;
        int contador = 0;
        for(int i = 1; i <= 60; i++ ){
            
            if(i % 2 > 0)
            {   
                contador++;
                System.out.println(i);
                impares *= i;
                if(contador == 10){
                    break;
                } 
            }
        }
        System.out.println("\n\n"+ impares);
    }
}
