/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_captura_datos;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA2_15_CAPTURA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tam;
        
        System.out.println("CUANTAS CALIFICACIONES SE VAN A CAPTURAR? ");
        tam = input.nextInt();
        
        int cali[] = new int[tam];//CREA ARREGLO
        
        for(int i=0; i<cali.length; i++){
            System.out.println("CALIFICACION NUM." + (i+1) + ":");
            cali[i] = input.nextInt();
        }
        //LECTURA
        for(int i=0; i<cali.length; i++){
            System.out.println("["+cali[i]+"]");
        }
    
    //PROMEDIO DEL GRUPO
    //SUMAR TODAS LAS CALIFICACIONES
    int sumaC = 0;
    
    for(int i=0; i<cali.length; i++){
            sumaC = sumaC + cali[i];
            //sumac += cali[i]
            
    }
    System.out.println("ACUMULADO: " + sumaC);
    double promedio = sumaC / (double)tam;
    System.out.println("PROMEDIO: " + promedio);
    }
}
    
