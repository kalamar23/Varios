package recursion;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
public class PopUp extends JFrame {
	
	PopUp(){
		setSize(404,171);
		setUndecorated(true);
		add(new Entrada());
		setLocationRelativeTo(null);

		setVisible(true);
		
		
	}
}

class Entrada extends JPanel{
	
JButton boton1 = new JButton("Aceptar");
	Image popup = null;
	Entrada(){
	setLayout(null);
	popup = Toolkit.getDefaultToolkit().getImage("/home/kala/git/Varios/Images/popup.jpg");
	MediaTracker mt = new MediaTracker(this);
	mt.addImage(popup, 0);
	
	try{
		mt.waitForAll();
	}catch(InterruptedException e){
		e.printStackTrace();
	}
	
	
	
}
	protected void paintComponent(Graphics g){

		super.paintComponent(g);
		g.drawImage(popup,1,1,null);		
		
	}
	
	
	
	
}