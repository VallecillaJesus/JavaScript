/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
+ Leer los datos correspondiente a dos tablas de 12 elementos numericos, y mezclarlos en una tercera de la forma: 

    - 3 de la tabla A
    - 3 de la B
    - otros 3 de A
    - otros 3 de la B
    - etc.
*/
package ejercicio_6;

/**
 *
 * @author WhiteHatHacker
 */
import java.util.Scanner;
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        //Initializing the arrays
        int[] a, b, c;
        a = new int[12];
        b = new int[12];
        c = new int[24];
        //Inicializo la entrada de datos del arreglo A
        System.out.println("---- Digita los valores del arreglo A ----\n");
        for(int i = 0; i < 12;i++){
            System.out.print((i+1) + "/12 .Digita el numero: ");
            a[i] = entrada.nextInt();
        }
        //Inicializo la entrada de datos del arreglo B
        System.out.println("\n\n---- Digita los valores del arreglo B ----\n");
        for(int i = 0; i < 12; i++){
            System.out.print((i+1) + "/12 .Digita el numero: ");
            b[i] = entrada.nextInt();
        }
        int j = 0;
        int ia = 0;
        int ib = 0; //Inicializamos el iterador para el arreglo C
        for(int i = 0; i<4;i++){
            c[j] = a[ia];
            j++;
            ia++;
            c[j] = a[ia];
            j++;
            ia++;
            c[j] = a[ia];
            j++;
            ia++;
            
            c[j] = b[ib];
            ib++;
            j++;
            c[j] = b[ib];
            ib++;
            j++;
            c[j] = b[ib];
            j++;
        }
        System.out.println("---- Resultado arreglo C ----\n");
        for(int i:c){
            System.out.println(i);
        }
    }
    
}
