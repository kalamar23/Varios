package recursion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import recursion.Proceso;
import java.util.Timer;
import java.util.TimerTask;


class ContentPanel extends JPanel implements ActionListener {
	JButton boton1 = new JButton();
	JButton boton2 = new JButton();
	JButton boton3 = new JButton();
	static JLabel display1 = new JLabel();
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
		botones(boton3, buimage1, 430, 170, 120, 30);
		ejecutar();
	//	display(display1,110,110,300, 40);

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
		
		if(e.getSource() == boton3){

		}
	}
	

TimerTask tarea = new TimerTask() {
	
	public void run(){
		display(display1,110,110,300, 40);
	}
	
	
};
	

Timer time = new Timer();

public void ejecutar(){
	time.schedule(tarea, 0, 1000);
}



	
	/* Este metodo se encarga de dar las propiedades y formato a los datos mostrados en pantalla
	 * 
	 */
	public void display(JLabel dis, int lw, int lh, int x, int y){
		
		Font fuente = new Font("ARIAL", Font.PLAIN,20);
		dis.setFont(fuente);
		dis.setText(Proceso.array.toString());
		dis.setBounds(lw, lh, x, y);
		add(dis);
		dis.repaint();
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