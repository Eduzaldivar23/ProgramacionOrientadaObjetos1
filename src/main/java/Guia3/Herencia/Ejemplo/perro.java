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
public class perro extends Mascota {
    
    public String especie;
    
    public perro(String nombre, String alimento,int edad, String especie){
        
        super(nombre, alimento, edad);
        this.especie = especie;
        
    }
    
    public void mostrar(){

        System.out.println(super.getNombre() + "-" + super.getTipo_alimentacion() + "-" + super.getEdad() + "-" + especie);
        
    }
    
}
