package Dibujar_Imagenes;

import java.awt.Graphics;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bleach extends JPanel{
	
	private Image Bleach;
	private String nameAnime;
	protected JFrame frame;
	
	public Bleach(){
		
		try {
			Bleach=new ImageIcon(new URL("https://p4.wallpaperbetter.com/wallpaper/512/783/648/bleach-kurosaki-ichigo-kuchiki-byakuya-ichimaru-gin-tarot-grimmjow-jaegerjaquez-ulquiorra-cifer-1-anime-bleach-hd-art-wallpaper-preview.jpg")).getImage();
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		frame=new JFrame("Bleach");
		frame.setIconImage(Bleach);
		
		frame.setBounds(50,50,Bleach.getWidth(this),Bleach.getHeight(this));
		frame.setContentPane(this);
		frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
		
		
		
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(Bleach, 0, 0,Bleach.getWidth(this),Bleach.getHeight(this),this);
		
	}

}



