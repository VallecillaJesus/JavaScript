/*Hacer un programa que lea un numero entero y 
muestre si el numero es multiplo de 10*/
package ejercicio_1;

import javax.swing.JOptionPane;

public class Ejercicio_1 {

    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero"));
        
        if(numero%10 == 0){
            JOptionPane.showMessageDialog(null,"El "+ numero +" ingresado es multiplo de 10");
        }
        else{
            JOptionPane.showMessageDialog(null,"El " + numero +" ingresado no es multiplo de 10");
        }
    }
}
