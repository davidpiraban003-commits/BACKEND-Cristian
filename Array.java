
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array miArray=new  Array();
		miArray.iniciar();

	}

	private void iniciar() {
		// TODO Auto-generated method stub
		String ArregloCosas[];
		ArregloCosas = new String[5];
		
		
		
		ArregloCosas[0]= "¿Que mas?";
		ArregloCosas[1]= "¿Que tal todo?";
		ArregloCosas[2]= "¿Como te fue ayer?";
		ArregloCosas[3]= "¿Siii que tal?";
		ArregloCosas[4]= "¡Ahhh me alegro mucho!";
		
		System.out.println(" Dame el valor de este texto" + ArregloCosas[0]);
		System.out.println(" Dame el valor de este texto" + ArregloCosas[1]);
		System.out.println(" Dame el valor de este texto" + ArregloCosas[2]);
		System.out.println(" Dame el valor de este texto" + ArregloCosas[3]);
		System.out.println(" Dame el valor de este texto" + ArregloCosas[4]);
		
		
	}

}

