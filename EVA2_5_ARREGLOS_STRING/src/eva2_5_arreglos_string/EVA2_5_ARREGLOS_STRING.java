/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_arreglos_string;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA2_5_ARREGLOS_STRING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[] a, b, c;//SON 3 ARREGLOS
    int x[], y, z;//SOLO LA X ES UN ARREGLO
    String cadenas[] = new String[7];
    cadenas[0] = "LUNES";
    cadenas[1] = "MARTES";
    cadenas[2] = "MIERCOLES";
    cadenas[3] = "JUEVES";
    cadenas[4] = "VIERNES";
    cadenas[5] = "SABADO";
    cadenas[6] = "DOMINGO";
    
    Scanner input = new Scanner(System.in);
    int dia;
    System.out.println("Dia de la semana (0 a 6): ");
    dia=input.nextInt();
    System.out.println(cadenas[dia]);
    }
    
}
