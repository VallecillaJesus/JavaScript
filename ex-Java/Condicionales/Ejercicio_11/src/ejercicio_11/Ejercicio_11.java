
package ejercicio_11;

import javax.swing.JOptionPane;


public class Ejercicio_11 {

    public static void main(String[] args) {
        int numero1, numero2, suma, resta, mult, div;
        char operacion;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digita el primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digita el segundo numero: "));
        operacion = JOptionPane.showInputDialog("Digita la letra de la operacion que deseas realizar: ").charAt(0);
        
        switch(operacion){
            
            case 's':
            case 'S': suma = numero1 + numero2;
                    JOptionPane.showMessageDialog(null,"La suma es igual a " + suma);
                    break;
            case 'r':
            case 'R': resta = numero1 - numero2;
                    JOptionPane.showMessageDialog(null,"La resta es igual a " + resta);
                    break;
            case 'm':
            case 'p':
            case 'P':
            case 'M': mult = numero1 + numero2;
                    JOptionPane.showMessageDialog(null,"La multiplicacion es igual a " + mult);
                    break;
            case 'd':
            case 'D': div = numero1 + numero2;
                    JOptionPane.showMessageDialog(null,"La division es igual a " + div);
                    break; 
            default: JOptionPane.showMessageDialog(null,"El caracter ingresado no corresponde a ninguna operacion");        
        }           
    }
}
