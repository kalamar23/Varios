package recursion;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;

class ContentPanel extends JPanel implements ActionListener {
	JButton boton1 = new JButton();
	JButton boton2 = new JButton();
	Image bgimage = null;
	ImageIcon buimage1 = new ImageIcon(
			"/home/kala/git/Varios/Images/boton1.png");
	ImageIcon buimage2 = new ImageIcon(
			"/home/kala/git/Varios/Images/boton2.png");
//constructor
	ContentPanel() {
		setLayout(null);
		bgimage = Toolkit.getDefaultToolkit().getImage(
				"/home/kala/git/Varios/Images/frame.jpg");
		botones(boton1, buimage1, 450, 535, 120, 30);
		botones(boton2, buimage2, 40, 170, 120, 30);

		MediaTracker mt = new MediaTracker(this);
		mt.addImage(bgimage, 0);

		try {
			mt.waitForAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	/*
	 * Escucha acciones de botones
	 */
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == boton1) {
			
			System.exit(0);
		}
		
		if(e.getSource() == boton2){
			new PopUp();
		}

	}

	// Asignar propiedades a botones
	private void botones(JButton boton, ImageIcon ico, int lw, int lh, int w,
			int h) {
		boton.setIcon(ico);
		boton.setBorderPainted(false);
		boton.setBounds(lw, lh, w, h);
		add(boton);
		boton.addActionListener(this);
	}

	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.drawImage(bgimage, 1, 1, null);

	}

}