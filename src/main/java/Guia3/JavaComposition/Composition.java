/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3.JavaComposition;

/**
 *
 * @author giama
 */
public class Composition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Direccion dl= new Direccion("calle A", 3);
        Direccion d2= new Direccion("calle B", 7);
        Persona p= new Persona("pepe", 20);
        p.setDirección(dl);
        Empresa e= new Empresa();
        e.setCif("1A");
        e.setDirección(d2);
        
        System.out.println(p.getDirección().getCalle());
        System.out.println(e.getDirección().getCalle());
    }
    
}
