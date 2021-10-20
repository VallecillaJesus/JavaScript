/*
Pedir 10 numeros y al final mostrar la suma
de los 10 numeros pedidos
 */
package ejercicio_11_pedir10numeros;

import javax.swing.JOptionPane;

/**
 *
 * @author INTERNET
 */
public class Ejercicio_11_Pedir10Numeros {
    public static void main(String[] args) {
        int suma = 0;
        for(int numero, i = 1; i<= 10; i++){
                numero = Integer.parseInt(JOptionPane.showInputDialog("----- La suma de 10 numeros ------"
                    + "\n\nEscribe el " + i 
                    + " numero: \n"));
            suma += numero; 
        }       
        System.out.println("La suma de todos los numeros es: " + suma);
    }
}
