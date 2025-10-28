/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_continue;

/**
 *
 * @author garfi
 */
public class EVA2_29_CONTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONTINUE__ DETIENE LA LITERACION (REPETEICION)ACTUAL
        //IMPRIMIR NUMEROS PARES 
        for (int i=0; i<100; i++){
            int resi = i%2;
            if(resi != 0)
                continue;//SE INTERRUMPE EL CICLO
            System.out.print(i+"-");
        }
    }
    
}
