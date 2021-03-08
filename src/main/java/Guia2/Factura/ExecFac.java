/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2.Factura;

/**
 *
 * @author giama
 */
public class ExecFac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Factura pedido1 = new Factura();
        String desc1, numPieza1;
        int Cant1;
        double Valor1;        
        
        pedido1.establecerDescPieza("taladro black decker de medio caballo de potencia para banco");
        pedido1.establecerQtyArticulo(2);
        pedido1.establecerNumDePieza("123456789");
        pedido1.establecerV1rArticulo(50);
        
        desc1 = pedido1.obtenerDescPieza();
        System.out.println("La descripción de la piesza es: " + desc1);
        
        Cant1 = pedido1.obtenerQtyArticulo();
        System.out.println("La cantidad disponible es: " + Cant1);
        
        numPieza1 = pedido1.obtenerNumDePieza();
        System.out.println("El número de la piesza es: " + numPieza1);
        
        Valor1 = pedido1.obtenerV1rArticulo();
        System.out.println("El valor del artículo es $" + Valor1);
    }
    
}
