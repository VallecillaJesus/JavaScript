/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5_juegonumerosaleatorios;

import javax.swing.JOptionPane;

/**
 *
 * @author INTERNET
 */
public class Ejercicio_5_JuegoNumerosAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double aleatorio;
        int opcion;
        
        aleatorio = Math.round(Math.random() * 100);
        if(aleatorio%2 == 0){
            opcion = 1;
        }
        else
        {
            opcion = 2;
        }
            
        int numero = Integer.parseInt(JOptionPane.showInputDialog("---Bienvenido a mi humilde juego---"
                + "\nDetermina si el siguiente numero es par o impar"
                + "\n\n     "+ (int)aleatorio
                + "\n\n Segun el anterior numero responde"
                        + "\n Es par o impar:"
                        + "\n\n 1.  Par"
                        + "\n 2.  Impar\n\n"));
        
        while(numero != opcion){
            JOptionPane.showMessageDialog(null,"La opcion seleccionada es incorrecta, sigue intentando");
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("---Intenta de nuevo---"
                + "\nDetermina si el siguiente numero es par o impar"
                + "\n\n     "+ (int)aleatorio
                + "\n\n Segun el anterior numero responde"
                        + "\n Es par o impar:"
                        + "\n\n 1.  Par"
                        + "\n 2.  Impar\n\n"));
        }
        JOptionPane.showMessageDialog(null,"¡¡CORRECTOO!!!\nAhora podras descubrir la cura para el cancer");
    } 
}
