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
public class Inv5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Pequeña conversaciion 2
        
        String name, apellido;
        
        Scanner entradaEscaner = new Scanner(System.in);
        
        System.out.println("Hola, dime tu nombre:");
        
        name = entradaEscaner.nextLine();
        
        System.out.println("Ahora dime tu apellido:");
        
        apellido = entradaEscaner.nextLine();
        
        System.out.println("Tu apellido es " + apellido + " y tu nombre es " + name + ".");
        
        // TODO code application logic here
    }
    
}
