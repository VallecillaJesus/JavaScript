/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Exercise 3

- Leer 5 numeros por teclado
- Almacenarlos en un arreglo
- realizar la media de los numeros positivos
- realizar la media de los numeros negativos
- contar numero de ceros

*/
package com.mycompany.ejercicio3_arreglos;

import java.util.Scanner;

public class Ejercicio3_arreglos {

    public static void main(String[] args) {
       
       Scanner in = new Scanner(System.in);
       float[] num = new float[5];
       
       int zero = 0,np= 0,nn=0;
       float numPositive = 0;
       float numNegative = 0;
       
       for(int i = 0; i<num.length;i++){
           System.out.println((i+1) + ". Introduce numero: ");
           num[i] = in.nextFloat();
       }
       for(float i:num){
           if(i == 0){
               zero++;
           }
           else if(i <0){
                numNegative += i;
                nn++;
           }
           else{
               numPositive += i;
               np++;
           }
       }
        numNegative /= nn;
        numPositive /= np;
        
        System.out.println("-----------------------------------------------"
                + "\n\nLos resultados son:"
                + "\nLa media de los numeros positivos es: " + (int)numPositive
                + "\nLa media de los numeros negativos es: " + (int)numNegative
                + "\nLa cantidad de ceros ingresados es:   " + zero);
    }
    
}
