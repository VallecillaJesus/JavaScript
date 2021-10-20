/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_9_mostrarnumeros;

import javax.swing.JOptionPane;

/**
 *
 * @author INTERNET
 */
public class Ejercicio_9_MostrarNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero hasta donde quieres ir: "));
        for(int i = 1; i <= numero;i++){
            System.out.println(i);
        }
    }
}
