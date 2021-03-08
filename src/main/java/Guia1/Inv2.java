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
public class Inv2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            // Calcula el area de un cuadrado
            
        double lado, area;
        
        Scanner entradaEscaner = new Scanner(System.in);
        
        System.out.println("Escriba la longitud de los lados del cuadrado para calcular su area: ");
        
        lado = entradaEscaner.nextDouble();
        
        area = lado * lado;
        
        System.out.println("El area del cuadrado es de " + area + " u2.");
        // TODO code application logic here
    }
    
}
