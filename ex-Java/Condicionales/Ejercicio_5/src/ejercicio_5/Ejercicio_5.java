
package ejercicio_5;

import javax.swing.JOptionPane;

public class Ejercicio_5 {

    public static void main(String[] args) {
        float horas,sueldoTotal;
        horas = Float.parseFloat(JOptionPane.showInputDialog("Digite el numero de horas trabajadas: "));
        
        if(horas < 0){
            
            JOptionPane.showMessageDialog(null, "El numero de horas no puede ser menor que cero ");
            
        }
        else
        {
            if(horas <= 40){
            
                horas *= 16;
                JOptionPane.showMessageDialog(null,"Su salario semanal es: $"+ horas);
                
            }
            else
            {
                if(horas > 40 ){
               
                    sueldoTotal = (40*16)+ ((horas - 40)*20);
                    JOptionPane.showMessageDialog(null,"Su salario semanal es: $" + sueldoTotal);
               
                }                                                
            }
        }
    }    
}
 