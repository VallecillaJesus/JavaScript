/*
Pedir 10 sueldos
- Mostrar su suma 
- Cuantos hay mayores de 1000

 */
package ejercicio_14;

import javax.swing.JOptionPane;

/**
 *
 * @author INTERNET
 */
public class Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mayor0 = 0;
        float sueldo, suma = 0; 
        
        for(int i = 1; i <= 10; i++){
            
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("----- Valor Salarial ----"
                    + "\n "+i+"/10"
                + "\n Digite 10 salarios"
                + "\n\nDigite su salario: \n"));
            
            while(sueldo < 0){
                sueldo = Integer.parseInt(JOptionPane.showInputDialog("----- Valor Salarial ----"
                    + "\n "+i+"/10"
                + "\n Digite 10 salarios"
                            + "\n\n No digites valores negativo\nNo seas mala honda :(("
                + "\n\nDigite su salario: \n"));
            }
            
            if(sueldo > 1000){
                mayor0 ++;
            }
            suma += sueldo;
        }
        JOptionPane.showMessageDialog(null, "La suma es: " + suma
        + "\nLa cantidad de salarios mayores a 1000 son:    " + mayor0 + "        ");
    }
    
}
