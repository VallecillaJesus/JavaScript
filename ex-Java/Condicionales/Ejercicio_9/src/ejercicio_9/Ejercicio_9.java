/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_9;

import javax.swing.JOptionPane;

/**
 *
 * @author INTERNET
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mes, dia , año;
             
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));       
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
  
        if((dia < 0) || (dia > 31)){   
            JOptionPane.showMessageDialog(null,"El dia es incorrecto");    
        }
        else if((mes < 0) || (mes > 12)){
            JOptionPane.showMessageDialog(null,"El mes es incorrecto");
        }
        else if((año < 0) || (año > 2021)){   
            JOptionPane.showMessageDialog(null,"El año es incorrecto");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"La fecha es " + dia + " / " + mes + " / " + año);
        }
    }
}