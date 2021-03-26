package Dibujar_Imagenes;

import java.awt.Graphics;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class supercampeones extends JPanel{
	
	private Image superC;
	private String nameAnime;
	protected JFrame frame;
	
	public supercampeones(){
		
		try {
			superC=new ImageIcon(new URL("https://elnoti.com/wp-content/uploads/2016/04/Super-campeones-800x445-1-900x500_c.jpg")).getImage();
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		frame=new JFrame("Supercampeones");
		frame.setIconImage(superC);
		frame.setBounds(50,50,superC.getWidth(this),superC.getHeight(this));
		frame.setContentPane(this);
		frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
		//frame.setUndecorated(true);
		
		
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(superC, 0, 0,superC.getWidth(this),superC.getHeight(this),this);
		
	}

}


