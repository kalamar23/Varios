import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {


	
  Main() {
    add(new ContentPanel());
    setSize(new ContentPanel().ANCHO, new ContentPanel().ALTO);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    Main jrframe = new Main();
    jrframe.setVisible(true);
    jrframe.setLocationRelativeTo(null);
  }

}

class ContentPanel extends JPanel {
  Image bgimage = null;
	protected static int ANCHO = 0;
	protected static int ALTO = 0;
  
  
  ContentPanel() {
    MediaTracker mt = new MediaTracker(this);
    bgimage = Toolkit.getDefaultToolkit().getImage("/home/kala/git/Varios/Images/fondo.jpg");
    mt.addImage(bgimage, 0);
  
    ANCHO = bgimage.getWidth(null);
    ALTO = bgimage.getHeight(null);
    try {
      mt.waitForAll();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }


  
  protected void paintComponent(Graphics g) {
	  super.paintComponent(g);
    int imwidth = bgimage.getWidth(null);
    int imheight = bgimage.getHeight(null);
    g.drawImage(bgimage, 1, 1, null);
  }
}