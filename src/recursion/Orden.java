package recursion;


import javax.swing.JFrame;

// metodo recursivo que permita ordenar una array de enteros al azar de 1 a 100, de mayor a menor y de menor a mayor
public class Orden extends JFrame {

	Orden() {
		setSize(600, 620);
		setUndecorated(true);
		add(new ContentPanel());

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	

	
	
	
	
	
	
	// El siguiente metodo llena un array con numeros enteros al azar

	public static void main(String[] args) {

		Orden or = new Orden();
		or.setLocationRelativeTo(null);

	}

}

