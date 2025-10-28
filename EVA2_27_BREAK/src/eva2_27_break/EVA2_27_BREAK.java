/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_break;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA2_27_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int valor, adivinar;
        
        do{
           adivinar = (int)(Math.random()*5);
           System.out.println("(-1 PARA TERMINAR)ADIVINA EL NUMERO: ");
           valor=input.nextInt();
           if(valor==adivinar)
               System.out.println("FELICIDADES, ACERTASTE");
           else if(valor== -1){
               System.out.println("GRACIAS POR JUGAR :3");
               break; //TERMINA LA EJECUCION DEL CICLO 
           }else{
               System.out.println("INCORRECTO");
           }
        }while(valor!=-1);//CONDICION PARA REPETIR ES (true)
    }
    
}
