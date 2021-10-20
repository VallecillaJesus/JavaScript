//Pedir el numero de sueldos a ingresar
//Registrar los sueldos
//Mostrar en consola o en pantalla el mayor sueldo

package com.mycompany.ejercicio_20;
import javax.swing.JOptionPane;
public class Ejercicio_20 {

    public static void main(String[] args) {
        
        //Inicializing vars
        int numSueldos;
        float sueldo, sueldoMaximo = 0;
        do{
            numSueldos = Integer.parseInt(JOptionPane.showInputDialog("---   SUELDOS CALCULATOR   ---"
                    + "\n\n Digite el numero de sueldos a registrar: "));
        }while(numSueldos < 0);
        for(int i = 1; i <= numSueldos; i++){
            do{
                sueldo = Float.parseFloat(JOptionPane.showInputDialog("Sueldo N° " + i
                + "\n\n                Digite el sueldo:  "));
            }while(sueldo < 0);
            //determining returning action for sueldoMaximo
            /*
              Ternary Operator of the if statement
            */
            sueldoMaximo = sueldo>sueldoMaximo? sueldoMaximo=sueldo:sueldoMaximo;
        }
        
        //printing the results in the console:
        System.out.println("El sueldo Maximos es: " + sueldoMaximo);
        //printing in a message dialog the results:
        JOptionPane.showMessageDialog(null,"EL sueldo maximos es: " + sueldoMaximo);
    }
    
}
