import javax.swing.*;
import java.net.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import java.io.*;
public class Orden extends JFrame{

// componentes de panel	
	JPanel panel = new JPanel();
	JButton boton1 = new JButton("Ir a pagina !");
	private String image1 = "/home/kala/git/Varios/Images/fondo.jpg";
	ImageIcon ico = new ImageIcon(image1);
	JLabel texto1 = new JLabel("Ir a Chrome");
	JLabel etiqueta = new JLabel();
	
	Font fuente = new Font("Helvetica", Font.ITALIC, 20);
	
public Orden(){
etiqueta.setIcon(ico);
texto1.setForeground(Color.WHITE);
texto1.setFont(fuente);
texto1.setSize(140, 20);
texto1.setLocation(140, 30);
etiqueta.add(texto1);
panel.add(etiqueta);
setContentPane(panel);
setSize(400,400);
setVisible(true);
close();
	}


public void close(){
	
addWindowListener(new WindowAdapter(){
	
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
	
});
}
	
	public static void abrir() throws URISyntaxException {
	try{
		java.awt.Desktop escri = java.awt.Desktop.getDesktop();
		
		escri.browse(new URI ("http://amigodelpc.cl"));
	}catch(IOException e){};
	
		
	}
	
	
	
	
	public static void main(String[] args) throws URISyntaxException {

		Orden or = new Orden();
		or.setLocationRelativeTo(null);
		
	}

}
