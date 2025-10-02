/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_exa1;

import java.util.Scanner;

public class EVA2_1_EXA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int natacion;
        int ciclismo;
        int carrera;
        int total;
       Scanner input = new Scanner(System.in);

        System.out.println("TIEMPO HECHO EN NATACION: ");
        natacion = input.nextInt();
        
        System.out.println("CAPTURE EN MINUTOS EL TIEMPO HECHO EN CICLISMO: ");
        ciclismo = input.nextInt();
        

        System.out.println("CAPTURE EN MINUTOS EL TIEMPO HECHO EN CARRERA: ");
        carrera = input.nextInt();
        
        
        total = natacion+ciclismo+carrera;
        
        
        if((total<120) && ((natacion<60) && (ciclismo<60) && (carrera<60))){
            
          System.out.println("EXCELENTE");
            
        }
        else if ((total<150) || ((natacion<70) && (ciclismo<70) && (carrera<70))){
             System.out.println("BUENA");
            
            
        }
        else{
             System.out.println("REGULAR");
            
        }

        

 
        
    }
    
}
