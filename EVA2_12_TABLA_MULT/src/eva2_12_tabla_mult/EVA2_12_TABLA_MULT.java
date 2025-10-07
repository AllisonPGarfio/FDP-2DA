/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_tabla_mult;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA2_12_TABLA_MULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int num;
        
        System.out.println("AGREGUE EL NUMERO: ");
        num = input.nextInt();

                        
        for(int i=1; i<=10; i++ ){
            int resultado = num * i;
            System.out.println(num + "x" + i + "=" + resultado);
        }
    }
    
            
            
}
