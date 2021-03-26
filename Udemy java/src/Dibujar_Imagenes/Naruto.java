package Dibujar_Imagenes;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.*;

public class Naruto extends JPanel{
	
	private Image naruto;
	private String nameAnime;
	protected JFrame frame;
	
	public Naruto(){
		
		try {
			naruto=new ImageIcon(new URL("https://i1.wp.com/codigoespagueti.com/wp-content/uploads/2021/02/Naruto-Cual-es-la-edad-de-Naruto-y-el-resto-del-Equipo-7.jpg?resize=1280%2C720&quality=80&ssl=1")).getImage();
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		frame=new JFrame("Naruto");
		frame.setIconImage(naruto);
		/*Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int x=(int)screenSize.getWidth()/5;
		int y=(int) screenSize.getHeight();*/
		frame.setBounds(50,50,naruto.getWidth(this),naruto.getHeight(this));
		frame.setContentPane(this);
		frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
		//frame.setUndecorated(true);
		
		
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(naruto, 0, 0,naruto.getWidth(this),naruto.getHeight(this),this);
		
	}

}
