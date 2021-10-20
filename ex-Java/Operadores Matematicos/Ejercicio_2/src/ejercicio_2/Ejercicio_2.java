
package ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        float horas_trabajadas,salario_hora,resultado;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite el numero de horas trabajadas por semana: ");
        horas_trabajadas = entrada.nextFloat();
        System.out.print("Digite el salario por hora: ");
        salario_hora = entrada.nextFloat();
        
        resultado = horas_trabajadas*salario_hora;
        System.out.println("Su sueldo semanal es: $"+ resultado +" pesos Colombianos");
    }  
}
