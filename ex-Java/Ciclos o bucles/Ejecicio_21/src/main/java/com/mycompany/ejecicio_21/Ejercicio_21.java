/*
        Pedir 10 numeros
    y al final mostrar si se 
    ha introdicido algun
        numero negativo
 */
package com.mycompany.ejecicio_21;

import javax.swing.JOptionPane;

/**
 *
 * @author misol
 */
public class Ejercicio_21 {
    public static void main(String[] args) {
        int numeros;
        boolean negativos = false;
            for(int i = 1; i <= 10; i++){
                    numeros = Integer.parseInt(JOptionPane.showInputDialog("N° " + i +"/10"
                + "\nDigita el numero: "));
                    if(numeros < 0)
                    {
                        negativos = true;
                    }      
            }
            if(negativos == true){
                System.out.println("Si hay al menos un numero negativo");
                JOptionPane.showMessageDialog(null,"Si hay almenos un numero negativo xd");
            }
            else{
                System.out.println("No exite ningun numero negativo");
                JOptionPane.showMessageDialog(null,"No existe ningun numero negativo");
            }
    }  
}
