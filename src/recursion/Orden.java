package recursion;
import java.awt.Graphics;
import java.awt.MediaTracker;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.Image;
// metodo recursivo que permita ordenar una array de enteros al azar de 1 a 100, de mayor a menor y de menor a mayor
public class Orden extends JFrame {

	
	
	
Orden(){
		setSize(600,600);
add(new ContentPanel());	
setTitle("Ordenador");
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	
	
// El siguiente metodo llena un array con numeros enteros al azar 

	
	
	
	
	public static void main(String[] args) {

		
		Orden or = new Orden();
		or.setLocationRelativeTo(null);
		
	}

}


class ContentPanel extends JPanel{
	
	Image bgimage = null ;
	
	
ContentPanel(){
	MediaTracker mt = new MediaTracker(this);
	bgimage = Toolkit.getDefaultToolkit().getImage("/home/kala/git/Varios/Images/frame.jpg");
	System.out.println(bgimage);
	mt.addImage(bgimage, 0);
	try{
		mt.waitForAll();
	}catch(InterruptedException e){
		e.printStackTrace();
	}
}
	protected void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		int imWidth = bgimage.getWidth(null);
		int imHeight = bgimage.getHeight(null);
		
		g.drawImage(bgimage,1,1,null);		
	}
	
}