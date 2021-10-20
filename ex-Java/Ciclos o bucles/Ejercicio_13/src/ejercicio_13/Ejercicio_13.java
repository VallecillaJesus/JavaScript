/*
Pedir 10 numeros:

- mostrar la media de los numeros positivos
- la media de los numeros negativos
- la cantidad de ceros
 */
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
            
        float numeros,
              positivo = 0,
              negativo = 0;
        int ceros = 0,
            cantidadPositivos = 0,
            cantidadNegativos = 0;
        for(int i = 1; i <= 10;i++){
            numeros = Integer.parseInt(JOptionPane.showInputDialog("---Digita 10 numeros ---"
                    + "\n\nDigita el " + i + " numero:"));
            if(numeros == 0){
                ceros ++;
            }
            else if(numeros > 0){
                ++cantidadPositivos;
                positivo += numeros;
            }
            else{
                ++cantidadNegativos;
                negativo += numeros;
            }
        }
        positivo /= cantidadPositivos;
        negativo /= cantidadNegativos;

        System.out.println("\n\nLa media de los negativos es: " + (int)negativo);
        System.out.println("La media de los positivos es: " + (int)positivo);
        System.out.println("La cantidad es 0 fue: " + (int)ceros + "\n\n");
    }
    
}
