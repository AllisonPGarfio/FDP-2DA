/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_2_switch;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA1_2_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //SWITCH ES UNA INSTRUCCION DE OPCION MULTIPLE
        Scanner input = new Scanner(System.in);
        int dia;
        
        System.out.println("Dia de la semana en numero (1-7)");
        dia = input.nextInt();
        
        switch(dia){ //OPCIONES = CASOS
            case 1: 
                System.out.println("LUNES");
                break;
            case 2: 
                System.out.println("MARTES");
                break;
            case 3: 
                System.out.println("MIERCOLES");
                break;
            case 4: 
                System.out.println("JUEVES");
                break;
            case 5: 
                System.out.println("VIERNES");
                break;
            case 6: 
                System.out.println("SÁBADO");
                break;
            case 7: 
                System.out.println("DOMINGO");
                break;//FIN DEL CASO Y DEL SWITCH
                
            default: //OPCIONAL, SIEMPRE AL FINAL NO NECESITA EL BREAK
                System.out.println("NUMERO NO IDENTIFICADO");
        }
    }
    
}
