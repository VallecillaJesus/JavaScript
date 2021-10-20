/*
    Pedir 5 calificaciones de alumnos y al final decir si hay
    alugn suspenso.
 */
package com.mycompany.ejercicio_22;

import javax.swing.JOptionPane;

/**
 *
 * @author misol
 */
public class Ejercicio_22 {
    public static void main(String[] args) {
        // TODO code application logic here
        //Begining the variables
        float score;
        boolean suspenso = false;
        
        for(int i = 1; i <= 5; i++){
            do{
                score = Float.parseFloat(JOptionPane.showInputDialog("Score #" + i));
            }while(score <0 || score >10);
            if(score < 5){
                suspenso = true;
            }

        }
        if(suspenso == true){
            System.out.println("Si hay almenos un suspenso");
        }
        else
        {
            System.out.println("No hay ningun suspenso");
        }
    }
    
}
