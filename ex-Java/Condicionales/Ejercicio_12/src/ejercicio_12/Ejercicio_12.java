/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_12;

import javax.swing.JOptionPane;

/**
 *
 * @author INTERNET
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        
        nota = Integer.parseInt(JOptionPane.showInputDialog("Escriba su calificacion"));
            
            switch(nota){
                case 0:
                case 1:
                case 2: JOptionPane.showMessageDialog(null,"Insuficiente");
                        break;
                case 3:
                case 4: JOptionPane.showMessageDialog(null, "Suficiente");
                        break;
                case 5:
                case 6: JOptionPane.showMessageDialog(null,"Bien");
                        break;
                case 7:
                case 8: JOptionPane.showMessageDialog(null,"Notable");
                        break;
                case 9:
                case 10: JOptionPane.showMessageDialog(null,"Sobresaliente");
                        break;
                
                default: JOptionPane.showMessageDialog(null,"La nota suministrada es incorrecta debe ser de 0 a 10");
            }
        }    
    }
    

