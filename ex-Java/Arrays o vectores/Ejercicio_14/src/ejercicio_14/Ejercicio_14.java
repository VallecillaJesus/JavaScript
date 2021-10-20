/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

leer dos series de 10 numeros, que estaran ordenados crecientemente.
Copiar las dos tablas en una tercera, de forma que sigan ordenadas.

 */
package ejercicio_14;

import java.util.Scanner;

/**
 *
 * @author WhiteHatHacker
 */
public class Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        int sitio = 0,tabla1[] = new int[10],tabla2[] = new int[10],fusion[] = new int[20];
        boolean creciente_1 = false;
        boolean creciente_2 = false;
        //Pedimos los datos de la primera tabla
        do{
            
            System.out.println("\n\n--- Llenando la primera tabla ---\n\n");
            for(int i = 0; i < 10; i++){
                System.out.print((i + 1)+". Digita el numero:  ");
                tabla1[i] = entrada.nextInt();
            }
            //Llenamos los datos de la segunda tabla
            System.out.println("\n\n--- Llenamos la segunda tabla ---\n\n");
            for(int i = 0; i<10; i++){
                System.out.print((i +1)+". Digite el numero:  ");
                tabla2[i] = entrada.nextInt();
            }
        //Comprobar si las tablas estan correctamente ordenadas
            for(int i = 0; i <9;i++){
                if(tabla1[i]<tabla1[i+1]){
                    creciente_1 = true;
                }
                else{
                    creciente_1 = false;
                }
            }
            for(int i = 0; i<9; i++){
               if(tabla2[i] < tabla2[i+1]){
                   creciente_2 = true;
               }
               else{
                   creciente_2 = false;
               }
            }
        }while(creciente_1 == false || creciente_2 == false);

    }
    
    
}
