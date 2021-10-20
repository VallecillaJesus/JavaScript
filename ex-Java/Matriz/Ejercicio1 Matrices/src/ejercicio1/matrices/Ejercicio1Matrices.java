/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Ejercicio 1

Crear y cargarr una matriz de tamaño n x m
y decir si es simetrica o no.
 */
package ejercicio1.matrices;
import java.util.Scanner;
import javax.swing.JOptionPane;
        
public class Ejercicio1Matrices {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int matriz[][],nFilas,nColumnas;
        boolean sim = true;
        
        
        System.out.println("--- MATRIZ ----\n");
        System.out.print("Digite el numero de filas: ");
        nFilas = entrada.nextInt();
        System.out.print("\nDigite el numero de columnas: ");
        nColumnas = entrada.nextInt();
        
        matriz = new int[nFilas][nColumnas];
        System.out.println("\nDigite una Matriz: ");
        
        for(int i = 0;i<nFilas;i++){
            for(int j = 0; j<nColumnas;j++){
                System.out.print("Matriz["+i+"]["+j+"] : ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        if(nFilas == nColumnas){
            int i,j;
            i=0;
            while(i<nFilas && sim == true){
                j=0;
                while(j<i && sim == true){
                    if(matriz[i][j] != matriz[j][i]){
                        sim = false;
                    }
                    j++;
                }
                i++;
            }
            if(sim == true){
                JOptionPane.showMessageDialog(null,"La matriz es simetrica");
            }
            else{
                JOptionPane.showMessageDialog(null,"La matriz no es simetrica");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"La matriz no es simetrica");
        }
    }
    
}
