/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedasecuencial;

import javax.swing.JOptionPane;

/**
 *
 * @author WhiteHatHacker
 */
public class BusquedaSecuencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arreglo[],nElementos, dato;
        boolean band = false;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero de elementos que tendra el arreglo:  "));
        arreglo = new int[nElementos];
        
        for(int i = 0; i < nElementos; i++){
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1)+ ". Digite el numero: "));
        }
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar: "));
        
        int i = 0;
        
        while(i < nElementos && band == false){
            if(dato == arreglo[i]){
                band = true;
            }
            i++;
        }
        
        if(band == false){
            JOptionPane.showMessageDialog(null,"El numero a buscar no fue encontrado, no se encuentra en el arreglo");
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero si se encuentra en el arreglo");
        }
        
        
    }
    
}
