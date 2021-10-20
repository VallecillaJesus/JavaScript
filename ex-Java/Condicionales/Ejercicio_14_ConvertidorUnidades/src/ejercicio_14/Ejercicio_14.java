
/*Hacer un programa que pase Kg a otra unidad
de medida de masa, mostrar en pantalla un menu
con las opciones posibles.*/

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
        float masa;
        String unidad_inicial, unidad_final;
        
        masa = Float.parseFloat(JOptionPane.showInputDialog(null,"----- Bienvenido a mi convertidor de unidades -----"
            + "\n\nPasa de una unidad a otra utilizando las"
            + "\n       opciones que te proporcionamos."
            + "\n\n Ingresa la cantidad de masa que vas a convertir: "));
        
        unidad_inicial = JOptionPane.showInputDialog("----- Convertidor Inicial -----"
                + "\n\n Unidades:"
                + "\n 1.  Kg - 'Kilogramos'"
                + "\n 2.  G - 'Gramos'"
                + "\n 3.  Mg - 'Milogramos'"
                + "\n\nDigite la unidad inicial").toLowerCase();
        
        unidad_final = JOptionPane.showInputDialog("----- Convertidor Final -----"
                + "\n\n Unidades:"
                + "\n 1.  Kg - 'Kilogramos'"
                + "\n 2.  G - 'Gramos'"
                + "\n 3.  Mg - 'Milogramos'"
                + "\n\nDigite la unidad Final").toLowerCase();
        
        switch(unidad_inicial){
            
            case "1":
            case "kilogramos":
            case "kg": switch(unidad_final){
                    case "1":
                    case "kg":
                    case "kilogramos":JOptionPane.showMessageDialog(null,"El resultado de la conversion es:"
                                          + "\n Kilogramos --> Kilogramos"
                                          + "\n\n " + masa + " Kg - Kilogramos");
                        break;
                    case "2":
                    case "g":
                    case "gramos": masa *= 1000;
                                    JOptionPane.showMessageDialog(null,"El resultado de la conversion es:"
                                          + "\n Kilogramos --> Gramos"
                                          + "\n\n " + masa + " g - gramos");
                        break;
                    case "3":
                    case "mg":
                    case "miligramos": masa = masa *(1000000/1);
                                        JOptionPane.showMessageDialog(null,"El resultado de la conversion es:"
                                          + "\n Kilogramos --> Miligramos"
                                          + "\n\n " + masa + " mg - Miligramos");
                        break;
                    default: JOptionPane.showMessageDialog(null,"La opcion Final seleccionada es incorrecta");
                }
                break;
            
            case "2":
            case "gramos":
            case "g":switch(unidad_final){
                    case "1":
                    case "kg":
                    case "kilogramos": masa = masa * 0.001f;
                                        JOptionPane.showMessageDialog(null,"El resultado de la conversion es:"
                                          + "\n Gramos --> Kilogramos"
                                          + "\n\n " + masa + " kg - Kilogramos");
                        break;
                        
                    case "2":
                    case "g":
                    case "gramos": JOptionPane.showMessageDialog(null,"El resultado de la conversion es:"
                                          + "\n Gramos --> Gramos"
                                          + "\n\n " + masa + " g - Gramos"); 
                        break;
                        
                    case "3":
                    case "mg":
                    case "miligramos": masa = masa * 1000;
                                        JOptionPane.showMessageDialog(null,"El resultado de la conversion es:"
                                          + "\n Gramos --> Miligramos"
                                          + "\n\n " + masa + " mg - Miligramos"); 
                        break;
                        
                    default: JOptionPane.showMessageDialog(null,"La opcion Final seleccionada es incorrecta");
                }
                break;
            
            case "3":
            case "mg":
            case "miligramos":switch(unidad_final){
                    case "1":
                    case "kg":
                    case "kilogramos": masa = masa * 0.000001f;
                                        JOptionPane.showMessageDialog(null,"El resultado de la conversion es:"
                                          + "\n Miligramos --> Kilogramos"
                                          + "\n\n " + masa + " kg - Kilogramos");
                        break;
                        
                    case "2":    
                    case "g":
                    case "gramos": masa = masa * 0.001f;
                                        JOptionPane.showMessageDialog(null,"El resultado de la conversion es:"
                                          + "\n Miligramos --> Gramos"
                                          + "\n\n " + masa + " g - Gramos");
                        break;
                        
                    case "3":    
                    case "mg":
                    case "miligramos": JOptionPane.showMessageDialog(null,"El resultado de la conversion es:"
                                          + "\n Miligramos --> Miligramos"
                                          + "\n\n " + masa + " mg - Miligramos");
                        break;
                        
                    default: JOptionPane.showMessageDialog(null,"La opcion Final seleccionada es incorrecta");
                }
                break;
            
            default: JOptionPane.showMessageDialog(null, "La opcion Inical seleccionada es incorrecta");
            
            }
    }
}