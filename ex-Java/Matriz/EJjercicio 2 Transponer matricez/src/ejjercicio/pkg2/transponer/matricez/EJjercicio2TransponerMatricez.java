/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejjercicio.pkg2.transponer.matricez;
import javax.swing.JOptionPane;
public class EJjercicio2TransponerMatricez {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3],temp;
        for(int i = 0; i< 3;i++){
            for(int j = 0; j<3;j++){
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("["+i+"]"+"["+j+"]. Digite el numero: "));
            }
        }
        //Matriz inicial
        System.out.println("---- MATRIZ INICIAL ----\n");
        System.out.println(matriz[0][0]+" "+ matriz[0][1]+" "+matriz[0][2]);
        System.out.println(matriz[1][0]+" "+ matriz[1][1]+" "+matriz[1][2]);
        System.out.println(matriz[2][0]+" "+ matriz[2][1]+" "+matriz[2][2]);
        System.out.println("\n\n");
        
        for(int i = 0;i<3;i++){
            for(int j = 0; j<i;j++){
                temp = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = temp;
            }
        }
        System.out.println("---- MATRIZ FINAL -----\n");
        System.out.println(matriz[0][0]+" "+ matriz[0][1]+" "+matriz[0][2]);
        System.out.println(matriz[1][0]+" "+ matriz[1][1]+" "+matriz[1][2]);
        System.out.println(matriz[2][0]+" "+ matriz[2][1]+" "+matriz[2][2]);
    }
    
}
