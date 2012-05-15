package recursion;

// En esta clase se puede apreciar el beneficio de clases anidadas 
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class PopUp extends JFrame {

	PopUp() {
		setSize(404, 171);
		setUndecorated(true);
		add(new Entrada());
		setLocationRelativeTo(null);
		setVisible(true);

	}

	class Entrada extends JPanel implements ActionListener {
		byte index = 1;
		int[] temp = new int[index];
		private byte count = 0;

		JButton aceptar = new JButton("Aceptar");
		JButton cerrar = new JButton();
		JTextField input1 = new JTextField();
		ImageIcon icerrar = new ImageIcon("/home/kala/git/Varios/Images/botonx.jpg");
		Image popup = null;

		Entrada() {
			setLayout(null);
			botones(aceptar,null,300, 130, 100, 30);
			botones(cerrar,icerrar,5,130,77,41);
			input1.setBounds(120, 90, 180, 30);
			add(input1);
			popup = Toolkit.getDefaultToolkit().getImage(
					"/home/kala/git/Varios/Images/popup.jpg");
			MediaTracker mt = new MediaTracker(this);
			mt.addImage(popup, 0);
			try {
				mt.waitForAll();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		
		/**
		 * Asigna propiedades a los botones
		 * @param boton
		 * @param image
		 * @param lw
		 * @param lh
		 * @param ancho
		 * @param alto
		 */
		public void botones(JButton boton,ImageIcon image,int lw,int lh, int ancho, int alto){
			boton.setIcon(image);
			boton.setBorderPainted(false);
			boton.setBounds(lw, lh, ancho, alto);
			add(boton);
			boton.addActionListener(this);
		}
		
		
		
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == aceptar) {
				if (count < temp.length) {
					fill();
				}
				if (count == 15) dispose();
			}

			if(e.getSource() == cerrar){
				dispose();
			}
			
			
		}

		/**
		 * fill() recolecta los numeros enteros a ordenar , almacena en temporal
		 * 
		 * @return Devuelve el array de enteros a procesar por la clase Proceso
		 */
		private void fill() {

			if (count < temp.length) {
				boolean exception = true;

				if (!(input1.getText().equals(""))) {
					String s1 = input1.getText();
					try {
						temp[count] = Integer.parseInt(s1);
					} catch (NumberFormatException e) {

						JOptionPane.showMessageDialog(null, "Solo numeros !");
						input1.setText("");
						exception = false;
					}
					if (exception) {
						System.out.println("valor [" + count + "] :"
								+ temp[count]);
						count++;
						input1.setText("");
					} 
				}
			}
		}

		protected void paintComponent(Graphics g) {

			super.paintComponent(g);
			g.drawImage(popup, 1, 1, null);

		}

	}

}
