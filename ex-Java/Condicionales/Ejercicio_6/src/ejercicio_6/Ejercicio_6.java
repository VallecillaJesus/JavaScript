
package ejercicio_6;

import javax.swing.JOptionPane;

public class Ejercicio_6 {

    public static void main(String[] args) {
        int numero1,numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero "));
        
        if(numero1 % 2 == 0 & numero2 % 2 == 0){
            
            JOptionPane.showMessageDialog(null,"Los numeros son pares");
            
        }
        else
        {
            
            if(numero1 % 2 != 0 & numero2 % 2 != 0){
                
                JOptionPane.showMessageDialog(null,"Los numeros son impares");
            
            }
            else
            {
                
                if(numero1 % 2 == 0 & numero2 % 2 != 0){
                    
                    JOptionPane.showMessageDialog(null,"El numero " + numero1 + " es par mientras que el numero " + numero2 + " es impar");
                    
                }
                else
                {
                    
                    JOptionPane.showMessageDialog(null,"El numero " + numero1 + " es impar mientras que el numero " + numero2 + " es par");
                    
                }
            }
        }
    }
}
