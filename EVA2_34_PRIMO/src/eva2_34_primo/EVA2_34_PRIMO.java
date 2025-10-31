/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_34_primo;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA2_34_PRIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int valor;
        
        System.out.println("INGRESE UN NUMERO: ");
        valor = input.nextInt();
        
        if(valor<=1){
            System.out.println("TU NUMERO NO ES PRIMO");
        }else{
            int i=2;
            for(;i<valor; i++){
                if(valor%i==0){
                    break;
                }
            }
        if(i==valor){
            System.out.println("EL NUMERO ES PRIMO");
        }else{
            System.out.println("EL NUMERO NO ES PRIMO");
        }
    }
    }
}
