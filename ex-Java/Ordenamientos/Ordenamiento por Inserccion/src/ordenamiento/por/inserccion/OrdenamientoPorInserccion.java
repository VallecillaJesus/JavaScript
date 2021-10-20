/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento.por.inserccion;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author WhiteHatHacker
 */
public class OrdenamientoPorInserccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos,pos,aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos"));
        
        arreglo = new int[nElementos];
        
        for(int i = 0; i<nElementos; i++){
            System.out.print((i +1) + ". Digite el numero de elementos: ");
            arreglo[i] = entrada.nextInt();
        }
        
        for(int i = 0; i<nElementos;i++){
            pos = i;
            aux = arreglo[i];
            
            while((pos>0) && (arreglo[pos-1]>aux)){
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
       
            arreglo[pos] = aux;
        }
        
        System.out.println("\n\n --- ARREGLO ORDENADO CRECIENTEMENTE --- ");
        for(int i: arreglo){
            System.out.println(i);
        }
        
        System.out.println("\n\n --- ARREGLO ORDENADO DECRECIENTEMENTE --- ");
        for(int i = (nElementos-1); i>=0;i--){
            System.out.println(arreglo[i]);
        }
    }
    
}
