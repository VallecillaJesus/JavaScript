/* Programa que calcule el cuadrado de una suma
    
    
*/
package ejercicio_6;
import java.util.Scanner;
public class Ejercicio_6 {

    public static void main(String[] args) {
        double numero1,numero2,resultado,resultado2;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite el primer numero --> ");
        numero1 = entrada.nextDouble();
        System.out.print("Digite el segundo numero --> ");
        numero2 = entrada.nextDouble();
        
        resultado = ((Math.pow(numero1,2)) + (Math.pow(numero2,2))) + (2*numero1*numero2);
        resultado2 = Math.pow((numero1 + numero2),2);
                
        System.out.println("\n--------------------------------------------------");
        System.out.println("El cuadrado de la suma es: " + resultado);
        System.out.println("El cuadrado de la suma es: " + resultado2);
    }
    
}
