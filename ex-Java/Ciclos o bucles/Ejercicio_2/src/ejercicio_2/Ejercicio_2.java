/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

import javax.swing.JOptionPane;

/**
 *
 * @author INTERNET
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float numero;
        numero = Float.parseFloat(JOptionPane.showInputDialog("Digite un numero: "));
        
        while(numero != 0){
            
            if(numero < 0){
                JOptionPane.showMessageDialog(null,"El numero " + (int)numero + " es negativo");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"El numero " + (int)numero + " es positivo");
            }
            
            numero = Float.parseFloat(JOptionPane.showInputDialog(" Digite un numero: "));
        }
        
        JOptionPane.showMessageDialog(null,"El numero es igual a 0, has salido del bucle");
    }
    
}
