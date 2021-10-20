//Dadas 6 notas escribir la cantidad de alumnos aprobados, condicionados (=4)
//y suspensos.
package com.mycompany.ejercicio_19;

import javax.swing.JOptionPane;

public class Ejercicio_19 {

    public static void main(String[] args) {   
        float notas;
        int aprobados = 0,
            suspensos = 0,
            condicionados = 0;
        
        for( int i = 1; i <= 6; i++){
            do{
                notas = Float.parseFloat(JOptionPane.showInputDialog("------Digita 6 notas ------\n"
                        + "\n\tNota N° " + i));
            }while(notas < 0 || notas >10);
            
            if(notas >=5){
                aprobados++;
            }
            else if(notas  == 4){
                condicionados++;
            }
            else
            {
                suspensos++;
            }
        }
        System.out.println(
          "El numero de estudiantes aprobados es   --> "+ aprobados
        + "\nEl numero de estudiantes condicionados  --> " + condicionados
        + "\nEl numero de estudiantes suspensos      --> " + suspensos);
    }
}