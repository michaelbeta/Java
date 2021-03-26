package Dibujar_Imagenes;

import java.awt.Graphics;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ataque_a_los_titanes extends JPanel{
	
	private Image ataqueTitanes;
	private String nameAnime;
	protected JFrame frame;
	
	public Ataque_a_los_titanes(){
		
		Image imagen=null;
		try {
			 imagen=new ImageIcon(new URL("https://as02.epimg.net/meristation/imagenes/2021/01/25/noticias/1611576361_977797_1611576583_noticia_normal_recorte1.jpg")).getImage();
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		frame=new JFrame("Ataque a los titanes");
		frame.setIconImage(imagen);
		
		frame.setBounds(50,50,obtenerImagen().getWidth(this),obtenerImagen().getHeight(this));
		frame.setContentPane(this);
		frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
		
		
		
	}
	private Image obtenerImagen() {
		
		 try {
			ataqueTitanes =new ImageIcon(new URL("https://www.lacasadeel.net/wp-content/uploads/2015/06/ataque-a-los-titanes-gif.gif")).getImage();
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		
		 return ataqueTitanes;
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

			g.drawImage(obtenerImagen(), 0, 0,obtenerImagen().getWidth(this),obtenerImagen().getHeight(this),this);
		
		
	}

}

