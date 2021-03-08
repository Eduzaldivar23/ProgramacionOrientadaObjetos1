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
public class Inv3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            // Calcula volumen de un cubo
        
         double lado, volumen;
        
        Scanner entradaEscaner = new Scanner(System.in);
        
        System.out.println("Escriba la longitud de los lados del cubo para calcular su volumen: ");
        
        lado = entradaEscaner.nextDouble();
        
        volumen = lado * lado* lado;
        
        System.out.println("El volumen del cubo es de " + volumen + " u3.");
        
        // TODO code application logic here
    }
    
}
