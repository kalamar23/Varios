import javax.swing.*;
import java.net.*;
import java.io.*;
public class Orden extends JFrame{

// componentes de panel	
	JPanel panel = new JPanel();
	JButton boton1 = new JButton("Ir a pagina !");
	JLabel etiqueta1 = new JLabel("Ir a Chrome");
	private String image1 = "/images/fondo.jpg";

	ImageIcon ico = new ImageIcon(image1);
	
	public Orden(){
panel.add(etiqueta1);
setContentPane(panel);
setSize(400,400);
setVisible(true);
close();
	}


public void close(){
	
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
