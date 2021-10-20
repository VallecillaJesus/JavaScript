/*
    Programa que pide numeros y al detectar un numero negativo
    da la media de la suma de todos los numeros ingresados.
 */
package ejercicio_7;

import javax.swing.JOptionPane;

/**
 *
 * @author INTERNET
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double numero, suma = 0, media, contador = 0;
        
        numero = Double.parseDouble(JOptionPane.showInputDialog("Digita el primer numero: "));
        
        while(numero<0){
            JOptionPane.showMessageDialog(null,"El numero debe ser mayor que 0");
            numero = Double.parseDouble(JOptionPane.showInputDialog("Digita el primer numero: "));
        }
            do{
            contador++;
            suma += numero;
            media = (suma/contador);
            numero = Double.parseDouble(JOptionPane.showInputDialog("Digita el siguiente numero: "));
            }while(numero > 0);
            
            JOptionPane.showMessageDialog(null, "La media de los numeros es: " + media);               
     
    }
    
}
