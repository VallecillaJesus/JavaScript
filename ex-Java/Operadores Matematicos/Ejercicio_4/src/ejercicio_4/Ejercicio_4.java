
package ejercicio_4;

import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        int personal;
        float carros_vendidos;
        float valor_carro_vendido;
        float salario_vendedor;
        float salario_vendedores;
        
        float comisionTotal_carrosVendidos;
        float comision_valorCarro;
        float comision_valorCarros_vendidos;
        
        final float porcentaje_valor_carrosVendidos = 0.05f;
        final int sueldo_mensual = 1000;
        final int comision_carroVendido = 150;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite el numero de empleados: ");
        personal = entrada.nextInt();
        System.out.print("Digite numero de carros vendidos: ");
        carros_vendidos = entrada.nextFloat();
        System.out.print("Digite el valor de los carros vendidos: ");
        valor_carro_vendido = entrada.nextFloat();
        
        comisionTotal_carrosVendidos = carros_vendidos * comision_carroVendido;
        comision_valorCarro = valor_carro_vendido * porcentaje_valor_carrosVendidos;
        salario_vendedor = comisionTotal_carrosVendidos + comision_valorCarro + sueldo_mensual;
        salario_vendedores = personal * salario_vendedor;
        comision_valorCarros_vendidos = comision_valorCarro * carros_vendidos;
        
        System.out.println("\n--------------------------------------------------------------------------------------");
        
        System.out.println("\nLa comision por el total de carros vendidos es de: $" + comisionTotal_carrosVendidos);
        System.out.println("La comision por el valor de un carro vendido es de: $" + comision_valorCarro);
        
        System.out.println("\nEl sueldo de cada uno de los empleados es de: $" + salario_vendedor);
        System.out.println("En total el valor a pagar por todos los empleados es de: $" + salario_vendedores);
        
        System.out.println("\nLa comision por el valor de TODOS los carros vendidos es de: $" + comision_valorCarros_vendidos);
    }
    
}
