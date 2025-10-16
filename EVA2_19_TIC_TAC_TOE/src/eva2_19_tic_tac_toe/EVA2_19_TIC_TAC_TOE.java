/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_tic_tac_toe;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA2_19_TIC_TAC_TOE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int tt[][] = new int [3][3];
      int fila, col, jug;
      Scanner input = new Scanner(System.in);
      for (int i = 0; i < 10; i++) {
          System.out.println("INTRODUCE TU JUGADA DE FILA: ");
          fila=input.nextInt();
          System.out.println("INTRODUCE TU JUGADA DE COLUMNA: ");
          col=input.nextInt();
          System.out.println("JUGADOR(1O2): ");
          jug=input.nextInt();
          
          tt[fila][col]= jug;
          
         for(int j=0; j<tt.length; j++){
          for(int k=0; k<tt[j].length; k++){
              System.out.print("["+tt[j][k]+"]");
          }
          System.out.println();
       }
    }
      }
 }
    
