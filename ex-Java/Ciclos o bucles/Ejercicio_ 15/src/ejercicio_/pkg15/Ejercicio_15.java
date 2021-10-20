/*

Dadas las edades y alturas de 5 alumnos: 

 - mostrar la edad media
 - estatura media
 - cantidad de alumnos mayores de 18
 - cantidad de alumnos que miden mas de 1.75

 */
package ejercicio_.pkg15;

import javax.swing.JOptionPane;

public class Ejercicio_15 {

    public static void main(String[] args) {
        int edad,altos= 0,adultos= 0,conteoEdades = 0,conteoAlturas = 0;
        float altura,mediaAltura = 0,mediaEdades=0 ;
        
        for(int i = 1; i <= 5; i++){
            edad = Integer.parseInt(JOptionPane.showInputDialog("---Edades Y Altura---     " + i + "/5"
                    + "\n\n Digita las edades: "));
            while(edad < 0){
            edad = Integer.parseInt(JOptionPane.showInputDialog("---Edades Y Altura---     " + i + "/5"
                    + "\n\nLas edades deben ser mayor a 0"
                    + "\n\n Digita las edades: "));
            }
            conteoEdades ++;
            if( edad >= 18){
                adultos++;
            }
            mediaEdades += edad;
        }
        for(int i = 1; i <=5; i++){
                        altura = Float.parseFloat(JOptionPane.showInputDialog("---Edades Y Altura---     " + i + "/5"
                    + "\n\n Digita las alturas: "));
            while(altura < 0){
            altura = Float.parseFloat(JOptionPane.showInputDialog("---Edades Y Altura---     " + i + "/5"
                    + "\n\nLas alturas deben ser mayor a 0"
                    + "\n\n Digita las alturas: "));
            }
            conteoAlturas++;
            if( altura >= 1.75){
                altos++;
            }
            mediaAltura += altura;
        } 
        mediaEdades /= conteoEdades;
        mediaAltura /= conteoAlturas;
        
        JOptionPane.showMessageDialog(null,"La media de las edades es:    " + mediaEdades 
         + "\nLa media de las alturas es:    " + mediaAltura +   "\n"
         + "\n-------------------------------------------------------"
         + "\n\nEl numero de mayores de 18 años es:   " + adultos + "                "
         + "\nEl numero de altos es:   " + altos);
    }
}
