/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.HashMap;

/**
 *
 * @author giama
 */
public class HashMapExam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashMap<Integer, String> m = new HashMap<>();
        
            m.put(1, "lunes");
            m.put(2, "martes");
            m.put(3, "miercoles");
            m.put(4, "jueves");
            m.put(5, "viernes");
            m.put(6, "sabado");
            m.put(7, "domingo");
            m.put(8, "dias de las semanas");
            
            System.out.println("dias de las semanas: \n" + m);
    }
    
}
