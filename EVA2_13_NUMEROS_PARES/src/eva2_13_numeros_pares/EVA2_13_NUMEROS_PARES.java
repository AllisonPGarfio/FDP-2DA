/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA2_13_NUMEROS_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int rep, rep2;
       
       System.out.println("ELIJA EL PRIMER NUMERO: ");
       rep = input.nextInt();
       System.out.println("ELIJA EL ULTIMO NUMERO: ");
       rep2 = input.nextInt();
       
       for(int i=rep; i <=rep2; i++){
           int resi = i % 2;
           if(resi == 0)
              System.out.print(i + "-");
       }
    }
    
}
