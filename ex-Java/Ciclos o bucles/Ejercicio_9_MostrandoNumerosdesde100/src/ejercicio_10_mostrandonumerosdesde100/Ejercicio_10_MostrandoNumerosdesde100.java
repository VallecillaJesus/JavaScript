/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_10_mostrandonumerosdesde100;

import javax.swing.JOptionPane;

/**
 *
 * @author INTERNET
 */
public class Ejercicio_10_MostrandoNumerosdesde100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe de cuanto en cuanto quieres "
                + "\nque vaya mostrando los numeros:"));
        
        for(int i = 100; i>=1; i-= numero){
            System.out.println(i);
        }
    }  
}
