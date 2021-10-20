
package ejercicio_3;
import java.util.Scanner;
public class Ejercicio_3 {

    public static void main(String[] args) {
        float guillermo,juan,luis,total;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Cantidad de dinero de Guillermo: ");
        
        guillermo = entrada.nextFloat();
        juan = guillermo/2;
        luis = (guillermo+juan)/2;
        total = guillermo + luis + juan;
        
        System.out.println("\nEl dinero que posee Guillermo es: "+guillermo);
        System.out.println("El dinero que posee Juan es: "+ juan);
        System.out.println("El dinero que posee Luis es: "+ luis);
        System.out.println("El dinero total entre los 3 es: " + total);
    }
}
