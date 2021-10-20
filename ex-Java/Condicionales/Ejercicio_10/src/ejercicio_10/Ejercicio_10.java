/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_10;

import javax.swing.JOptionPane;

/**
 *
 * @author INTERNET
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia, mes, año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Año: "));
        
        if((año >= 1 ) && (año <= 2021)){
            
            if((mes == 2) && ((dia >= 1) && (dia <= 28))){
                
                JOptionPane.showMessageDialog(null,"La fecha es: " + dia + " / " + mes + " / " + año);
            }
            else
            {
                if(((mes == 3) || (mes == 4) || (mes == 6)) && ((dia <= 31) &&( dia >= 1))){
            
                    JOptionPane.showMessageDialog(null,"La fecha es: " + dia + " / " + mes + " / " + año);
                }
                else
                {
                   if(((mes == 1) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 9) || (mes == 10) || (mes == 11) || (mes == 12)) && ((dia <= 30) && ( dia >= 1))){
                       
                       JOptionPane.showMessageDialog(null,"La fecha es: " + dia + " / " + mes + " / " + año);
                    }
                   else
                   {
                       JOptionPane.showMessageDialog(null,"La fecha es incorrecta");
                   }
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"El año es incorrecto");
        }      
    }
}
