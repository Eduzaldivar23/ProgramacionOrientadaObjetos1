/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.HashSet;

/**
 *
 * @author giama
 */
public class HashSetExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashSet<String> hset = new HashSet<>();
        
            hset.add("Adidas");
            hset.add("Reef");
            hset.add("Vans");
            hset.add("Orange");
            hset.add("Zegna");
            
            hset.add("Adidas");
            hset.add("Reef");
            
            hset.add(null);
            hset.add(null);
            
            System.out.println(hset);
    }
    
}
