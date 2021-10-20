/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7;

import javax.swing.JOptionPane;

/**
 *
 * @author INTERNET
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2,n3;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digita el primer numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digita el segundo numero: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digita el tercer numero: "));
        
        if((n1>n2) && (n2>n3)){
            JOptionPane.showMessageDialog(null, "El orden de los numeros es: " + n3 + " - " + n2 + " - " + n1);
        }
        else if ((n1>n3) && (n3>n2))
        {
          JOptionPane.showMessageDialog(null,"El orden de los numeros es: " + n2 + " - " + n3 + " - " + n1);      
        }
        else if ((n2>n1) && (n1>n3))
        {
          JOptionPane.showMessageDialog(null,"El orden de los numeros es: " + n3 + " - " + n1 + " - " + n2);      
        }
        else if ((n2>n3) && (n3>n1))
        {
          JOptionPane.showMessageDialog(null,"El orden de los numeros es: " + n1 + " - " + n3 + " - " + n2);      
        }
        else if ((n3>n1) && (n1>n2))
        {
          JOptionPane.showMessageDialog(null,"El orden de los numeros es: " + n2 + " - " + n1 + " - " + n3);      
        }
        else if ((n3>n2) && (n2>n1))
        {
          JOptionPane.showMessageDialog(null,"El orden de los numeros es: " + n1 + " - " + n2 + " - " + n3);      
        }
    }
}
 