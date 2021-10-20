/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_8;

import javax.swing.JOptionPane;

/**
 *
 * @author INTERNET
 */
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero: "));
        
        if(numero < 0){
            JOptionPane.showMessageDialog(null,"El numero que suministras debe ser mayor de 0 ");
        }
        
        else if (numero > 9999){
            JOptionPane.showMessageDialog(null,"El numero es de 5 cifras");
        }
        
        else if(numero > 999){
            JOptionPane.showMessageDialog(null, "El numero es de 4 cifras");
        }
        
        else if(numero > 99){
            JOptionPane.showMessageDialog(null,"El numero es de 3 cifras ");
        }
       
        else if(numero > 9){
            JOptionPane.showMessageDialog(null,"El numero es de 2 cifras");
        }
        
        else if(numero < 10){
            JOptionPane.showMessageDialog(null,"El numero es de 1 cifra");
        }  
    }
}
