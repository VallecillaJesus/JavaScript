/*
 Pedir un numero:
 - Mostrar la tabla de multiplicar de dicho numero
 - El numero debe estar entre 0 y 10
 */
package ejercicio_16;

import javax.swing.JOptionPane;

public class Ejercicio_16 {

    public static void main(String[] args) {
        int numero,multiplicacion;
        
            numero = Integer.parseInt(JOptionPane.showInputDialog("----- Tablas de Multiplicar -----"
                    + "\n\nDigita el numero cuya tabla quieres que aparezca : \n\n"));
        
        while(numero < 0 || numero > 10){  
            numero = Integer.parseInt(JOptionPane.showInputDialog("----- Tablas de Multiplicar -----"
                    + "\n\nEl numero digitado debe estar entre 0 y 10\n"
                    + "\nDigita el numero cuya tabla quieres que aparezca : \n\n"));
        }
        for(int i = 0; i <= 10; i++){
            multiplicacion = numero * i;  
            System.out.println(numero + " x " + i + " = " + multiplicacion);
        }
    }  
}
