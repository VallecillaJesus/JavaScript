/*Pedir dos numeros y decir cual es el mayor o si son iguales*/

package ejericio_2;

import javax.swing.JOptionPane;

public class Ejericio_2 {

    public static void main(String[] args) {
        
        float numero1, numero2;
        numero1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el primer numero: "));
        numero2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el segundo numero: "));
        
        if(numero1 > numero2){
            
        JOptionPane.showMessageDialog(null,"El numero " + (int)numero1 + " es Mayor que el numero " + (int)numero2 );
        }
        else
        {
            if(numero1 < numero2){
                JOptionPane.showMessageDialog(null,"El numero " + (int)numero2 + " es mayor que el numero " + (int)numero1);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Los numeros ingresados son iguales ");
            }
        }
    }
}
