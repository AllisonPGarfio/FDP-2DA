/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_32_factorial;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA2_32_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int factorial;
        int factorial2=1;
        
        System.out.println("INTRODUZCA UN NUMERO: ");
        factorial = input.nextInt();
        
        
        for(int i=1; i<=factorial; i++){
            factorial2= factorial2*i;
            System.out.println(factorial2);
        }
    }
    
}
