/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_ciclo_infinito;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA2_24_CICLO_INFINITO {

    final static String usuario = "admin";
    final static String pwd = "admin";
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String usu, contra;
       
       while(true){
       System.out.println("***ACCESO AL SISTEMA***");
       System.out.println("USUARIO: ");
       usu = input.nextLine();
       System.out.println("CONTRASEÑA: ");
       contra = input.nextLine();
       
       if(usu.equals(usuario)&& contra.equals(pwd))
           break;//termina el ciclo
       }
       System.out.println("BIENVENIDO AL SISTEMA");
    }
    
}
