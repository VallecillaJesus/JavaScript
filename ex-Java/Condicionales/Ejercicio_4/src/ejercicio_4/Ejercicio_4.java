/*
En MegaPlaza se hace 20% de descuento a los clientes 
cuya compra supere los $300.¿Cual sera la cantidad que 
pagara una persona por su compra?
 */
package ejercicio_4;

import javax.swing.JOptionPane;

public class Ejercicio_4 {

    public static void main(String[] args) {
        float precio;
        float descuento;
        float subtotal;
        
        precio = Float.parseFloat(JOptionPane.showInputDialog("Valor de la compra: "));
        descuento = precio * 0.20f;
        
        if(precio>300){
            
            subtotal = precio;
            precio -= descuento;
            JOptionPane.showMessageDialog(null,"El valor anterior al descuento fue $" + subtotal + "\nSe le ha hecho un descuento de $" + descuento + "\nEl valor total de la compra es $" + precio);
            
        }
        else
        {
            
           JOptionPane.showMessageDialog(null, "No tiene derecho ha descuento\nEl valor de la compra es $" + precio);
           
        }
    }    
}
