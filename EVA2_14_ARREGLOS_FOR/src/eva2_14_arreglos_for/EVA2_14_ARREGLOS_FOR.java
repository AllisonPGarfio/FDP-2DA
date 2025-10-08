/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_arreglos_for;

/**
 *
 * @author garfi
 */
public class EVA2_14_ARREGLOS_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int arreglo[] = new int[10];
       //System.out.println(arreglo.length); //TAMAÑO DEL ARREGLO
       /* arreglo[0]= 100;
       arreglo[1]= 200;
       arreglo[2]= 300;
       arreglo[3]= 400;
       arreglo[4]= 500;
       arreglo[5]= 600;
       arreglo[6]= 700;
       arreglo[7]= 800;
       arreglo[8]= 900;
       arreglo[9]= 1000;*/
       
      for(int i=0; i <arreglo.length; i++){
       arreglo[i] = (int)(Math.random()*100);
      } 
       
      for(int i=0; i <arreglo.length; i++){
          System.out.print("["+arreglo[i]+"]");
      }
      

    }
    
}
