//Leer un numero y mostrar su cuadrado 
//repetir el proceso hasta que se
//produzca un numero negativo
package ejercicio_1;
import java.util.Scanner;
/**
 *
 * @author INTERNET
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double numero, cuadrado;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba un numero --> ");
        numero = entrada.nextDouble();
        
                    
        while(numero>0){
             
            cuadrado = (int)Math.pow(numero,2);
            System.out.println("\nEl cuadrado del numero es: " + cuadrado + "\nEl numero no es negativo" );
            System.out.print("\n\nEscriba un numero --> ");
            numero = entrada.nextDouble();
            
        }
        
        System.out.println("El numero digitado es negativo, Felicitaciones has salido"
                + "\ndel bucle, cerdo malparido");
    }
}
