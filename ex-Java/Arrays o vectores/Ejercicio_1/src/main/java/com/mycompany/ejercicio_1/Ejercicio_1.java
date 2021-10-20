/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * Exercise
- Leer 5 numeros
- guardarlos en un arreglo
- mostrarlos en el mismo orden introducido

 */
package com.mycompany.ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author misol
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] numeros = new float[5];
        System.out.println("Guardando numeros en el Arrray");
        
        for(int i=0;i<5;i++){
            System.out.println((i+1)+". Digita un numero:  ");
            numeros[i]= entrada.nextFloat();
        }
        System.out.println("Los numeros ingresados son: ");
        for(float i:numeros){
            System.out.print(((int)i) + " ");
        }
    }
}
