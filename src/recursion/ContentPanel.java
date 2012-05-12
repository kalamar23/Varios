package recursion;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

class ContentPanel extends JPanel implements ActionListener {
	JButton boton1 = new JButton("Ingresar numeros");
	Image bgimage = null;

	ContentPanel() {
		setLayout(null);
		bgimage = Toolkit.getDefaultToolkit().getImage(
				"/home/kala/git/Varios/Images/frame.jpg");
		boton1.setBounds(30, 160, 160, 30);
		boton1.addActionListener(this);
		add(boton1);
		MediaTracker mt = new MediaTracker(this);
		mt.addImage(bgimage, 0);

		try {
			mt.waitForAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

/* Escucha acciones de botones
 * 	
 */
	public void actionPerformed(ActionEvent e){
		
		if(e.equals(boton1)){
			
		}
		
		
	}
	
	
	
	
	
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.drawImage(bgimage, 1, 1, null);

	}

}