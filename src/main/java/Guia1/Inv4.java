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
public class Inv4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         // Calcula superfice de un cubo
        
        double lado, superficie;
        
        Scanner entradaEscaner = new Scanner(System.in);
        
        System.out.println("Escriba la longitud de los lados del cubo para calcular su superficie: ");
        
        lado = entradaEscaner.nextDouble();
        
        superficie = lado * lado* 6;
        
        System.out.println("La superficie del cubo es de " + superficie + " u2.");
                
        
        // TODO code application logic here
    }
    
}
