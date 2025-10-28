/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_do_while;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA2_20_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;
        do{
        System.out.println("***MENÚ PRINCIPAL***");
        System.out.println("Presiona la opcicion: ");
        System.out.println("1.Pedidos:");
        System.out.println("2.Proveedores:");
        System.out.println("3.Facturación:");
        System.out.println("4.Salir");
        
        opcion = input.nextInt();
        switch(opcion){
            case 1: System.out.println("PEDIDOS AL SISTEMA");
            break;
            case 2: System.out.println("PROVEEDORES AL SISTEMA");
            break;
            case 3: System.out.println("FACTURACION AL SISTEMA");
            break;
        }
        
        
        }while(opcion != 4);//MIENTRAS LA OPCION SEA DIfErFENTE DE 4 
        System.out.println("FIN DEL PROGRAMA");
    }
    
}
