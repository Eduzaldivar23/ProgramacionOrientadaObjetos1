/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia1;

import java.util.Scanner;

/**
 *
 * @author Daniel Bichara
 */
public class Inv1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            // Pequeña conversacion
        
        String name;
        
        Scanner entradaEscaner = new Scanner(System.in);
        
        System.out.println("Hola, dime tu nombre");
        
        name = entradaEscaner.nextLine();
        
        System.out.println("Mucho gusto " + name + ".");
        // TODO code application logic here
    }
    
}
