package recursion;


//La siguiente clase realiza los procesos del programa , formando el backend de la aplicación
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import recursion.ContentPanel;

public class Proceso extends ContentPanel {

	
	private int[] num;
	
	
static StringBuffer array = new StringBuffer();


	Proceso(int[] copiado){
	

		this.num = copiado;
visualizar();
	}
	
	
	private void visualizar (){
		
		
		for(int va : num){
			
			array.append(("|" + String.valueOf(va)) + "|");
			
		}
		
		System.out.println(array);
		
	
	
/*	SwingUtilities.invokeLater(new Runnable(){
		public void run(){
			Font fuente = new Font("ARIAL", Font.PLAIN,20);
			display1.setFont(fuente);
			display1.setText(String.valueOf(array));
			display1.setBounds(110,110,300, 40);
			add(display1);
			repaint();
		}
		
	});*/
	
	
	
}
	
	
	
	
	
	private void creciente(){
		
		
		
		
		
		
		
		
	}
	
	private void decreciente(){
		
	}
	
	

	
	
}
