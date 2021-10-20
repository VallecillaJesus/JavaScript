/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

2 exercise
    - leer 5 numeros
    - guardarlos en un arreglo
    - mostrarlos en el orden inverso al que fueron infresados
 */

package com.mycompany.ejercicio2_arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio2_arreglos {
    
    public static void main(String[] args) {
        
        int num[] = new int[5];
        
        Scanner numero = new Scanner(System.in);
        
        for (int i = 0; i < num.length; i++) {
 
            System.out.print("Introduce un número: ");
            num[i] = numero.nextInt();            
        }
        
        System.out.println("Imprimiendo orden inverso.");
        
        for (int i = num.length - 1; i >= 0 ; i--) {
            System.out.println("Indice  " + i + " =" + num[i]);
        }
    }    
}
