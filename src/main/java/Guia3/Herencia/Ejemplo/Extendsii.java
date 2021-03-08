/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3.Herencia.Ejemplo;

/**
 *
 * @author giama
 */
public class Extendsii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pez pez = new Pez("Nemo", "Gránulos", 7, "Pez payaso");
        Ave ave = new Ave("Ash", "Berros", 2, "Perico australiano");
        Conejo conejo = new Conejo("Bunny", "Heno", 3, "Conejo europeo");
        
        System.out.println("----------------------------------------------------");
        pez.mostrar();
        System.out.println("----------------------------------------------------");
        ave.mostrar();
        System.out.println("----------------------------------------------------");
        conejo.mostrar();
        System.out.println("----------------------------------------------------");
        
    }

}
