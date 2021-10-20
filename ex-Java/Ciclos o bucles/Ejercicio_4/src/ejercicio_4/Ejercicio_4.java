/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4;

import javax.swing.JOptionPane;

/**
 *
 * @author INTERNET
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero, registro = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("numero: "));
        
        for(int i = 0;i >= 0;){
            numero = Integer.parseInt(JOptionPane.showInputDialog("numero: "));
            registro ++;
            i = numero;
        }
        JOptionPane.showMessageDialog(null,"El numero de numeros ingresados es: " + registro);
    }
    
}
