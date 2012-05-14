package recursion;
// En esta clase se puede apreciar el beneficio de clases anidadas 
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class PopUp extends JFrame {
	
	PopUp(){
		setSize(404,171);
		setUndecorated(true);
		add(new Entrada());
		setLocationRelativeTo(null);
		setVisible(true);		
	}
	
	
	
	
	class Entrada extends JPanel implements ActionListener {
		int[] temp = new int[15];
		private byte count = 0;

		JButton aceptar = new JButton("Aceptar");
		JTextField input1 = new JTextField();
		Image popup = null;
			
			
			Entrada(){
			setLayout(null);
		add(aceptar);
		aceptar.setBounds(300,130, 100, 30);
		aceptar.addActionListener(this);
		input1.setBounds(120, 90, 180, 30);
		add(input1);
			popup = Toolkit.getDefaultToolkit().getImage("/home/kala/git/Varios/Images/popup.jpg");
			MediaTracker mt = new MediaTracker(this);
			mt.addImage(popup, 0);
			try{
				mt.waitForAll();
			}catch(InterruptedException e){
				e.printStackTrace();
			}	
		}
			
			
			public void actionPerformed(ActionEvent e){

				if(e.getSource() == aceptar){
					if(count < temp.length){
					fill();
				}
				
				if(count == 15){
				dispose();
				}
				
				}
				
			}
			/**
			 * fill() recolecta los numeros enteros a ordenar , almacena en temporal
			 * @return Devuelve el array de enteros a procesar por la clase Proceso
			 */
			private void fill (){
			
				if(count < temp.length){
					boolean exception = true;
				
					if(!(input1.getText().equals(""))){
					String s1 = input1.getText();
					try{
					temp[count] = Integer.parseInt(s1);	
					}catch(NumberFormatException e){
				
					JOptionPane.showMessageDialog(null, "Solo numeros !");
			exception = false;
					}
					if(exception){
					System.out.println("valor [" + count +"] :" + temp[count]);
					count++;
					input1.setText("");
					}
					else{
						exception = false;
					}
					}
			}
			}
			
			
			
			protected void paintComponent(Graphics g){

				super.paintComponent(g);
				g.drawImage(popup,1,1,null);		
				
			}
			
			
			
			
		}
	
	
	
}

