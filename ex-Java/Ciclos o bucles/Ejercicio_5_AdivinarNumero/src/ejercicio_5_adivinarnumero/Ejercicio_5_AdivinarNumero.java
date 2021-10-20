/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5_adivinarnumero;

import javax.swing.JOptionPane;

/**
 *
 * @author INTERNET
 */
public class Ejercicio_5_AdivinarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double aleatorio = Math.random()*100;
        aleatorio = (int)aleatorio;
        int intentos = 0,numero = Integer.parseInt(JOptionPane.showInputDialog("--------BIENVENIDO---------"
                + "\n\nAdivina el numero del 1 al 100: "
                + "\n\nDigita un numero:\n"));
        
        while(numero != aleatorio){
            intentos++;
            if(numero > aleatorio){
                
                numero = Integer.parseInt(JOptionPane.showInputDialog("--------NUEVO INTENTO---------"
                + "\n\nAdivina el numero del 1 al 100"
                        + "\n\n Ouch! , el numero es menor!!"
                + "\n\nDigita un numero:\n"));
            }
            else
            {
                numero = Integer.parseInt(JOptionPane.showInputDialog("--------NUEVO INTENTO---------"
                + "\n\nAdivina el numero del 1 al 100"
                        + "\n\n Ouch! , el numero es mayor!!"
                + "\n\nDigita un numero:\n"));
            }
        }
        JOptionPane.showMessageDialog(null," ------ FELICITACIONES ------ "
                + "\n\n    Adivinaste el numero"
                + "\n\nEl numero era :  "+ (int)aleatorio
                + "\n\nNumero de intentos:  "+ intentos);
    }
    
}
