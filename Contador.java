import javax.swing.JOptionPane;


public class Contador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contador  miContador= new Contador();
		miContador.Carros();
		
	

	}

	private void Carros() {

    int Carros = Integer.parseInt(JOptionPane.showInputDialog("ingrese 1 para iniciar"));
    int [] numerosCarros = {8,10,5,6,9,8}; 
    int suma  = 0;
    for (int i = 0; i <  numerosCarros.length; i++) {
    	suma+= numerosCarros[i];
		System.out.println( suma );
		
		
		JOptionPane.showMessageDialog(null, "Ingresaste: " + suma);
		
	}
    
  
    	 
    
}
}