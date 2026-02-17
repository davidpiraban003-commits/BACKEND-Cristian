import java.util.Hashtable;

public class Hastable3 {
    public static void main(String[] args) {
        Hashtable<String, Integer> edades = new Hashtable<>();
        
        edades.put("Fenando", 56);
        edades.put("Pablito", 10);
        edades.put("paloma", 20);
        edades.put("Camila", 32);
        
        System.out.println(edades.get("Fenando"));
        if (edades.containsKey("Pablito")) {
            System.out.println("La edad de Pablito es: " + edades.get("Pablito"));
        } else {
            System.out.println("No se encontró la edad de Pablito.");
        }
        System.out.println(edades);
        System.out.println(edades.size());
    }
}
