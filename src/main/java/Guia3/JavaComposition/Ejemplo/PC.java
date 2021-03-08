/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3.JavaComposition.Ejemplo;

/**
 *
 * @author giama
 */
public class PC {
   
    public String modelo;
    public CPU cpu = new CPU();
    public RAM ram = new RAM();
    
    public void PC(String modelo, String cpu, String ram){
        
        this.cpu.CPU(cpu);
        this.ram.RAM(ram);
        this.modelo = modelo;
    }
    
    public void getPC(){
        
       System.out.println(modelo + " - " + cpu.getCPU() + " - " + ram.getRAM() + " (RAM)");
     
    }
}

