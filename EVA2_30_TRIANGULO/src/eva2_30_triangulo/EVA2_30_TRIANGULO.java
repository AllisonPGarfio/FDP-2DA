/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_30_triangulo;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA2_30_TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int valor;
        
        System.out.println("INTRODUZCA UN NUMERO: ");
        valor = input.nextInt();
        
        for(int i=1;i<=valor;i++){
        
         for(int j=1;j<=i;j++){
        System.out.print("*");  
        }     
         System.out.println();
    }
   }
}

