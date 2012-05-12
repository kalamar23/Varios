package recursion;
import java.awt.Graphics;
import java.awt.MediaTracker;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.Image;
// metodo recursivo que permita ordenar una array de enteros al azar de 1 a 100, de mayor a menor y de menor a mayor
public class OrdenSimple extends JFrame {

	
	
	
OrdenSimple(){
		setSize(600,620);
setTitle("Ordenador");
add(new ContentPanel2());
System.out.println("Dirección directorio :" + System.getProperty("user.dir"));
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
// El siguiente metodo llena un array con numeros enteros al azar 	
	
	public static void main(String[] args) {

		
		Orden or = new Orden();
		or.setLocationRelativeTo(null);
		
	}

}


class ContentPanel2 extends JPanel{
	
	Image bgimage = null;
	ImageIcon ico = new ImageIcon("/home/kala/git/Varios/Images/frame.jpg");
ContentPanel2(){
	
	bgimage = ico.getImage();
}
	protected void paintComponent(Graphics g){

		super.paintComponent(g);
		
		int imWidth = bgimage.getWidth(null);
		int imHeight = bgimage.getHeight(null);
		
		g.drawImage(bgimage,1,1,null);		
		
	}
	
	
}