/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Programa que simule un cajero automatico con un saldo
//inicial de 100 dolares, con el siguiente menu de 
//opciones

package ejercicio_13;

import javax.swing.JOptionPane;

/**
 *
 * @author INTERNET
 */
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float saldo = 1000f;
        int opcion, deposito, retiro;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("-----Bienvenido a mi cajero automatico-----"
                + "\n\nOpciones:"
                + "\n1. Depositar"
                + "\n2. Retirar"
                + "\n3. Salir"
                + "\n\nDigite el numero de la accion que quiere realizar: "));
        
        switch(opcion){
            case 1: deposito = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor a depositar: "));
                    if(deposito > 0){
                        saldo += deposito;
                        JOptionPane.showMessageDialog(null, "Se ha realizado el deposito con exito\nEl deposito ha sido de: $" + deposito + "\nSaldo disponible $" + deposito);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"El deposito debe ser mayor que 0 ");
                    }
                    break;
            case 2: retiro = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor a retirar"));
                    if((retiro > 0) && (retiro <= saldo)){
                        saldo -= retiro;
                        JOptionPane.showMessageDialog(null,"Se ha realizado el retiro con exito\nEl retiro ha sido de: $" + retiro + "\nSaldo disponible $" + saldo);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "El Valor de retiro debe ser mayor a 0 y menor que a su saldo disponible \n( $"+ saldo + " - saldo disponible )");
                    }
                    break;
                    
            case 3: JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestros servicios xDDD!!!");
                    break;
                    
            default: JOptionPane.showMessageDialog(null,"El numero ingresado no corresponde a ninguna opcion");
        }
    }
    
}
