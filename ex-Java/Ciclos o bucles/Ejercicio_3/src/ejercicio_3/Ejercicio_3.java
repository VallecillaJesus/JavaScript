/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

import javax.swing.JOptionPane;

public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while(numero!=0){
            if(numero%2 == 0){
                JOptionPane.showMessageDialog(null,"El numero es par");
            }
            else{
                JOptionPane.showMessageDialog(null,"El numero es Impar");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
        JOptionPane.showMessageDialog(null,"El numero ingresado es 0 , por lo tanto,\nHas salido del ciclo, Felicitaciones");
    }
    
    
}
