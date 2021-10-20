/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.matrices;

import javax.swing.JOptionPane;

public class Ejercicio3Matrices {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,"BIENVENIDO AL DAIGONALIZADOR");
        String size = JOptionPane.showInputDialog("Digite un numero que indicara el tamaño de la diagonal: ");
        String simbolo = JOptionPane.showInputDialog("Digite el simbolo de la diagonal: ");
        String matriz[][] = new String[Integer.parseInt(size)][Integer.parseInt(size)];
        String mSimbolo = JOptionPane.showInputDialog("Digite el simbolo de fondo");
    
        for(int i = 0;i<matriz.length;i++){
            matriz[i][i]= simbolo;
        }
        for(int i = 0;i<matriz.length;i++){
            for(int j =0; j<matriz.length;j++){
                if(matriz[i][j]== null){
                    matriz[i][j] = mSimbolo;
                }
            }
        }
            
        for(int i=0;i<matriz.length;i++){
            for(int j = 0; j<matriz.length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
