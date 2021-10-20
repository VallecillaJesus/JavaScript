/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo.burbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author WhiteHatHacker
 */
public class MetodoBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos,aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de elementos a registrar:  "));
        arreglo = new int[nElementos];
        
        for(int i = 0; i<nElementos; i++){
            System.out.print((i+1)+ ". Digite el numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        for(int i = 0; i<(nElementos -1); i++){
            for(int j = 0; j <(nElementos-1);j++){
                if(arreglo[j] > arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1]= aux;
                }
            }
        }
        System.out.println("\n\n ----ARREGLO ORDENADO CRECIENTEMENTE ----");
        for(int i : arreglo){
            System.out.println(i);
        }
        System.out.println("\n ---- ARREGLO ORDENADO DECRECIENTEMENTE ----");
        for(int i = nElementos-1;i >= 0;i--){
            System.out.println(arreglo[i]);
        }
        
    }
    
}
