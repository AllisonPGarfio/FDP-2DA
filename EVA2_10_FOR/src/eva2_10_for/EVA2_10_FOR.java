/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_for;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA2_10_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //IMPRIMIR DEL 1 AL 20
       for(int i = 1; i<=20; i++){
           System.out.print(i + " - ");
       }
       System.out.println("");
       for(int i = 20; i>=1; i--){
           System.out.print(i + " - ");
       }
       //IMPRIMIR LOS PARES DE 0 A 100
       //+=. -=, / =
       System.out.println("");
       for(int i = 0; i<=100; i+=2){
           System.out.print(i + " - ");
       }
       System.out.println("");
       for(int i = 100; i>=0; i-=2){
           System.out.print(i + " - ");
       }
       //SOLICITAR DOS NUMEROS AL USUARIO, IMPRIMIR LA LISTA
       //ENTRE ESOS NUMEROS 
       Scanner input = new Scanner(System.in);
       int rep, rep2;
       
       System.out.println("ELIJA EL PRIMER NUMERO: ");
       rep = input.nextInt();
       System.out.println("ELIJA EL SEGUNDO NUMERO: ");
       rep2 = input.nextInt();
                
        for(int i=rep; i<=rep2; i++ ){
            System.out.println(i);
        }
       //INVERSO
       
       System.out.println(" ");

                
        for(int i=rep2; i>=rep; i-- ){
            System.out.println(i);
        }
    }
    
}
