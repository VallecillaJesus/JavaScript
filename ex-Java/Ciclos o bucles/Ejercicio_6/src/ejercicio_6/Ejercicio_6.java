
package ejercicio_6;

import javax.swing.JOptionPane;

/**
 *
 * @author INTERNET
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float numero, suma = 0;
        numero = Float.parseFloat(JOptionPane.showInputDialog("       ----- La sumandora 3000 ----"
                + "\n     Si digitas el 0, la suma finalizara."
                + "\n\n\nDigita los numeros que quieras sumar: \n\n"));
        do{
           suma += numero;
           numero = Float.parseFloat(JOptionPane.showInputDialog("Siguiente numero: "));             
        }while(numero != 0);
        
        JOptionPane.showMessageDialog(null,"La suma ha finalizado\n La suma de sus numeros es -->  " + suma);
    }
    
}
