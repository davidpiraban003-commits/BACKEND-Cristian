public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array2 miArray2 = new Array2();
		miArray2.notas();
		

	}

	private void notas() {
		 double[] notas = {3.5, 4.2, 2.8, 4.8, 3.9};
	        double suma = 0;

	        
	        for (int i = 0; i < notas.length; i++) {
	            System.out.println("Nota " + (i+1) + ": " + notas[i]);
	            suma += notas[i];
	        }

	        
	        double promedio = suma / notas.length;
	        System.out.println("Promedio: " + promedio);

	        
	        int mayores = 0;
	        for (int i = 0; i < notas.length; i++) {
	            if (notas[i] > promedio) {
	                mayores++;
	            }
	        }

	        System.out.println("Notas mayores al promedio: " + mayores);
	    }
}