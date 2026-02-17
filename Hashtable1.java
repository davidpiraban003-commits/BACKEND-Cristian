import java.util.Hashtable;

public class Hashtable1 {
public static void main(String[] args) {
        
        Hashtable<String, Integer> edades = new Hashtable<>();
        
        edades.put("Cristian", 56);
        edades.put("Pablito", 10);
        edades.put("Fernanda", 20);
        edades.put("Marina", 32);
        
        System.out.println(edades);
        System.out.println(edades.size());

        }
}
