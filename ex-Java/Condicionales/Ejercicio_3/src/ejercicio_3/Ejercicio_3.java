/*
Programa que indica si una letra es mayuscula o es minuscula xD
 */
package ejercicio_3;

import javax.swing.JOptionPane;

/**
 *
 * @author INTERNET
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letra;
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null,"La letra es mayuscula");
        }
        else{
            JOptionPane.showMessageDialog(null,"La letra es minuscula");
        }
    }
    
}
