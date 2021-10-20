/*
Ejercicio 12: Leer por teclado una tabla de 10 elementos numericos enteros
y una posicion(entre 0 y 9). Eliminar el elemento situado en la posicion
dada sin dejar huecos.
 */
package ejercicio_12;

import java.util.Scanner;

/**
 *
 * @author WhiteHatHacker
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int num_posicion;
        
        //Pediendo los numeros del arreglo al usuario
        System.out.println("--- llenando el arreglo ---\n");
        for(int i = 0; i <10; i++){
            System.out.print((i +1)+". Digite el numero:  ");
            arreglo[i] = entrada.nextInt();
        }
        System.out.println("\n\t--- Digita la posicion del numero a eliminar ---");
        System.out.print("\nDigita el numero de la posicion: ");
        num_posicion = entrada.nextInt();
        
        for(int i = num_posicion; i<9;i++){
            arreglo[i] = arreglo[i+1];
        }
        arreglo[9] = 0;
        
        for(int i = 0;i<10;i++){
            System.out.println(arreglo[i]);
        }
    }
    
}
