package Mouse_event;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class Eventos_con_el_mouse extends JPanel{

	private JLabel UseMouse;
	private JFrame frame;
	private JLabel Accion;
	
	public Eventos_con_el_mouse() {
		
		frame=new JFrame("Eventos con raton");
		frame.setBounds(420,220,720,420);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setIconImage(CrearIcono());
		setLayout(null);
		setBackground(Color.LIGHT_GRAY);
		frame.add(this);
		Iniciarcomponentes();
		
		
	}
	private void Iniciarcomponentes() {
		
		UseMouse=new JLabel("Use su mouse en la ventana",new ImageIcon(CrearIcono()),JLabel.CENTER);
		UseMouse.setBounds(250, 20, 250, 50);
		UseMouse.setBorder(new LineBorder(Color.black));
		add(UseMouse);		
		Accion= new JLabel();
		Accion.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN,20));
		Accion.setBounds(225, 225, 400, 50);
		Accion.setBackground(Color.black);
		Accion.setForeground(Color.black);
		add(Accion);
		
		frame.addMouseListener(new MouseAdapter() {
			
			String tipoDeboton="";
			/*@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				
				
			Accion.setText("Haz clickeado en la ventana"+tipoDeboton);
			}*/
			@Override
			public void mouseExited(MouseEvent e) {
				super.mouseExited(e);
				Accion.setText("El mouse no esta en la ventana");
			}
			@Override
			public void mousePressed(MouseEvent e) {
				super.mouseMoved(e);
				
				tipoDeboton=" "+e.getMouseModifiersText(e.getModifiersEx());;
				Accion.setText("Haz presionado con el "+tipoDeboton);
			}

			});
		frame.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				
				Accion.setText("Estas moviendo el mouse");
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				
				Accion.setText("Estas arrastrando el mouse");
			}
		});
	}
	private Image CrearIcono() {
		
		
		

			Image icono=null;
			try {
				File archivo = new File("src/Mouse_event/raton.png");
				icono = ImageIO.read(archivo);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
		return icono;
	
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		try {
			g.drawImage(new ImageIcon(new URL("https://tiendasescom.com/wp-content/uploads/2020/11/cropped-banner_17.jpg")).getImage(),200, 80, 350, 150, this);
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {Eventos_con_el_mouse eveMouse = new Eventos_con_el_mouse(); eveMouse.frame.setVisible(true);}

}


	
	
