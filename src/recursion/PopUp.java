package recursion;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JButton;

class PopUp extends JPanel{
JButton boton1 = new JButton("Aceptar");
	Image bgimage = null;
	PopUp(){
	setLayout(null);
	bgimage = Toolkit.getDefaultToolkit().getImage("/home/kala/git/Varios/Images/frame.jpg");
	boton1.setBounds(30, 160, 160, 30);
add(boton1);
	MediaTracker mt = new MediaTracker(this);
	mt.addImage(bgimage, 0);
	
	try{
		mt.waitForAll();
	}catch(InterruptedException e){
		e.printStackTrace();
	}
	
	
	
}
	protected void paintComponent(Graphics g){

		super.paintComponent(g);
		g.drawImage(bgimage,1,1,null);		
		
	}
	
	
	
	
}