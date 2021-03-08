package Guia2;
import java.util.HashSet;
public class HashSetExam2 {
    public static void main(String[] args) {
        // TODO code application logic here
        
         HashSet<String> meses = new HashSet<>();
        
            meses.add("ropa");
            meses.add("carros");
            meses.add("impresion");
            meses.add("impresion 3d");
            meses.add("quimicos");
            meses.add("reciclaje");
            meses.add("batucada");
            meses.add("baile");
            meses.add("clases");     
            
            System.out.println("mis negocios son: " + meses);
            
        HashSet<String> m = new HashSet<>();         
        
            m.add("ivon");
            m.add("laura");
            m.add("rosita");
            m.add("marta");
            m.add("gricelda");
            m.add("noemi");
            m.add("marcela");
            m.add("lisbeth");
            
        System.out.println("nombres de mis novias: " + m);
            
         HashSet<String> hset = new HashSet<>();
        
            hset.add("keny");
            hset.add("sofia");
            hset.add("valeria");
            hset.add("ale");
            hset.add("carla");
            
            System.out.println("nombre de mis hermanas: " + hset);
         
    }
    
}
