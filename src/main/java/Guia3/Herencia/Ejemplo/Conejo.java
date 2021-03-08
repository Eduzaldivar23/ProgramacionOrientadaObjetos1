/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3.Herencia.Ejemplo;
import Guia3.Herencia.Mascota;

/**
 *
 * @author giama
 */
public class Conejo extends Mascota{
    
    public String raza;
    
    public Conejo(String nombre, String alimento,int edad, String raza){
        
        super(nombre, alimento, edad);
        this.raza = raza;
        
    }
    
    public void mostrar(){

        System.out.println(super.getNombre() + "-" + super.getTipo_alimentacion() + "-" + super.getEdad() + "-" + raza);
        
    }
}
