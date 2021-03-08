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
public class Factura {
    
    private String numDePieza;
    private String descPieza;
    private int cantArticulo;
    private double priceArticulo;
    String desc1;
    
    public void establecerNumDePieza(String pNumDePieza)
    {
        numDePieza = pNumDePieza;
    }
    
    public String obtenerNumDePieza()
    {
        return numDePieza;
    }
    
    public void establecerDescPieza(String pDescPieza)
    {
        descPieza = pDescPieza;
    }
    
    public String obtenerDescPieza()
    {
        return descPieza;
    }
    
    public void establecerQtyArticulo (int pQtyArticulo)
    {
        cantArticulo = pQtyArticulo;
    }
    
    public int obtenerQtyArticulo()
    {
        return cantArticulo;
    }
    
    public void establecerV1rArticulo(double pV1rArticulo)
    {
        priceArticulo = pV1rArticulo;
    }
    
    public double obtenerV1rArticulo()
    {
        return priceArticulo;
    }
}
