import java.util.Hashtable;

public class Hastable2 {
    public static void main(String[] args) {
        Hastable2 miHastable2 = new Hastable2();
            miHastable2.iniciar();

    }
    private void iniciar() {
        Hashtable<Integer, String> tablaProductos = new Hashtable<>();
        tablaProductos.put(1, "Licuadora");
        tablaProductos.put(2, "Nevera");
        tablaProductos.put(3, "Exprimidor");
        tablaProductos.put(4, "Microondas");
        tablaProductos.put(5, "Cafetera");

        System.out.println(tablaProductos.get(1));
          System.out.println(tablaProductos.get(2));
           System.out.println(tablaProductos.get(3));
           System.out.println(tablaProductos.get(4));
           System.out.println(tablaProductos.get(5));

           System.out.println(tablaProductos.size());

    }
}
