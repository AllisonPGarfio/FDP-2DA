/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_33_cuenta;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA2_33_CUENTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int retiro; 
        int fondos = 1000000;
        
        do{
        System.out.println("***BANCO DE MÉXICO***");
        System.out.println("Cuanto quiere retirar? ");
        retiro=input.nextInt();
        
        if(retiro>0){
       fondos-=retiro; //SIRVE PARA RESTAR AUNQUE LA CANTIDAD SE PASE
        System.out.println("SU TOTAL ES:" + fondos);
        }
        }while(fondos>0);
        System.out.println("FONDOS INSUFICIENTES " + fondos);
        }
}

