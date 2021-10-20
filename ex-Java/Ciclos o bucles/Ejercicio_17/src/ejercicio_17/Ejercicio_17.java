/*
Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas.
En cada factura figura:

 - El codigo del articulo
 - La cantidad vendida en litros y el precio por litro

Se pide de 5 facturas introducidas:

 - Facturacion total
 - Cantidad en litros vendidos del articulo 1
 - Cuantas facturas se emitieron de mas de 600

*/


package ejercicio_17;

import javax.swing.JOptionPane;

public class Ejercicio_17 {

    public static void main(String[] args) {
        
        int code,
            liters,
            litersProductOne = 0,
            totalLiters = 0,
            upperBills = 0;
        
        float literPrice,
              totalBills = 0;
        
        for(int i = 1; i <= 5; i++){
            
            code = Integer.parseInt(JOptionPane.showInputDialog("Product: "+ i + " / 5"
                    + "\n\nInsert the product's code: "));
                while(code < 0 ){
                    code = Integer.parseInt(JOptionPane.showInputDialog("Product: " +i + " / 5"
                            + "\n\nThe code must be greater than 0"
                        + "\n\nInsert the product's code: "));
                }

            liters = Integer.parseInt(JOptionPane.showInputDialog("Product: "+i + " / 5 "
                    + "\n\nInsert the amount of liters: "));
                while(liters < 0 ){
                    liters = Integer.parseInt(JOptionPane.showInputDialog("Product: "+ i + " / 5"
                            + "\n\nLiters must be greater that 0"
                        + "\n\nInsert the amount of liters: "));
                }

            literPrice = Float.parseFloat(JOptionPane.showInputDialog("Product: "+i + " / 5" 
                    + "\n\nInsert the price per liter: "));
                while(literPrice < 0 ){
                    literPrice = Integer.parseInt(JOptionPane.showInputDialog("Product: "+i + " / 5"
                            + "\n\nThe literPrice must be greater than 0"
                        + "\n\nInsert the price per liter: "));
                }
                
                if(i == 1){
                    litersProductOne = liters;
                }
                
            literPrice += liters;
            
            if(literPrice > 600){
                upperBills++;
            }
            totalLiters += liters;
            totalBills += literPrice;
            
        }
        JOptionPane.showMessageDialog(null,"------ Bills Review -------"
                + "\n\n Total of selled liters : " + totalLiters
                + "\n Total billed : " + totalBills
                + "\n Liters of the first product :  " + litersProductOne
                + "\n Bills greater than 600 : " + upperBills);
    }
    
}
