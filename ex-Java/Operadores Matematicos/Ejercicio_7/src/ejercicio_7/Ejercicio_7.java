
package ejercicio_7;
import java.util.Scanner;
public class Ejercicio_7 {


    public static void main(String[] args) {
        int horas, semanas,dias;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite el numero de horas --> ");
        
        horas = entrada.nextInt();
        
        semanas = horas/168;
        dias = (horas%168)/24;
        horas %=24;
        
        System.out.println("\n------------------------");
        System.out.println("semanas --> "+ semanas);
        System.out.println("Dias --> "+ dias);
        System.out.println("Horas --> "+horas);
    }
    
}
