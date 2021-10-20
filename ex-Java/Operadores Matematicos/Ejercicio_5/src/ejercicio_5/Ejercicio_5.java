
package ejercicio_5;
import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        float participacion,primerParcial,segundoParcial,examenFinal,notaFinal;
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite la calificacion en participacion: ");
        participacion = entrada.nextFloat();
        System.out.print("Digite la calificacion del primer parcial: ");
        primerParcial = entrada.nextFloat();
        System.out.print("Digite la calificacion del segundo parcial: ");
        segundoParcial = entrada.nextFloat();
        System.out.print("Digite la calificacion del examen final: ");
        examenFinal = entrada.nextFloat();
        
        participacion *= 0.10f;
        primerParcial *= 0.25f;
        segundoParcial *= 0.25f;
        examenFinal *= 0.40f;
        notaFinal = participacion + primerParcial + segundoParcial + examenFinal;
        
        System.out.println("\n----------------------------------------------------------------\n");
        System.out.println("La calificacion en participacion es: " + participacion);
        System.out.println("La calificacion en el primer examen parcial es: " + primerParcial);
        System.out.println("La calificacion en el segundo examen parcial es de: " + segundoParcial);
        System.out.println("La calificacion en el examen final es de: " + examenFinal);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("La calificacion final obtenida por el estudiante es de: " + notaFinal +"\n");
    }   
}
