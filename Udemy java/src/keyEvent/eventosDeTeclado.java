package keyEvent;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;



public class eventosDeTeclado extends JPanel{

	private JLabel teclaPresionada;
	private JFrame frame;
	private JLabel teclaenAccion;
	
	public eventosDeTeclado() {
		
		frame=new JFrame("Eventos con teclado");
		frame.setBounds(420,220,420,220);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setIconImage(CrearIcono());
		setLayout(null);
		setBackground(Color.black);
		frame.add(this);
		Iniciarcomponentes();
		
		
	}
	private void Iniciarcomponentes() {
		
		teclaPresionada=new JLabel("Presione una tecla",new ImageIcon(CrearIcono()),JLabel.CENTER);
		teclaPresionada.setBounds(120, 10, 150, 50);
		teclaPresionada.setBorder(new LineBorder(Color.black));
		add(teclaPresionada);		
		teclaenAccion= new JLabel();
		teclaenAccion.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN,20));
		teclaenAccion.setBounds(0, 75, 400, 50);
		teclaenAccion.setBackground(Color.black);
		teclaenAccion.setForeground(Color.red);
		add(teclaenAccion);
		frame.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				super.keyPressed(e);
				
				teclaenAccion.setText("Haz presionado la tecla "+e.getKeyText(e.getKeyCode()));
				
			}
		});
		
	}
	private Image CrearIcono() {
		
		File archivo = new File("src/keyEvent/teclado.png");

			Image icono=null;
			try {
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
			g.drawImage(new ImageIcon(new URL("https://www.icon.co.cr/wp-content/uploads/2020/12/pw_Magic-Keyboard-espanol.jpg")).getImage(),120, 15, 150, 150, this);
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {eventosDeTeclado eveTeclado = new eventosDeTeclado(); eveTeclado.frame.setVisible(true);}

}
