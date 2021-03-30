package FocusListener;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.*;
import javax.swing.border.MatteBorder;

public class Login extends JPanel {
	
	private JLabel usuario;
	private JLabel contraseña;
	private JTextField usuarioTexto;
	private JTextField constraseñaTexto;
	private Image icono,fondo;
	private JLabel mensaje;
	private JFrame frame;
	
	public Login(){
	
	frame= new JFrame("Login");	
	frame.setBounds(420,220, 450, 400);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.setResizable(false);
	try {
		frame.setIconImage(CrearIcono());
	} catch (MalformedURLException e) {
		
		e.printStackTrace();
	}
	setLayout(null);
	frame.setContentPane(this);
	CrearLabels();
	CrearTextfield();
	frame.setVisible(true);
	
	}
	private Image CrearFondo() throws MalformedURLException {
		
		fondo=new ImageIcon(new URL("https://ipaderos.com/wp-content/uploads/2015/04/20150404-ipaderos.jpg")).getImage();
		return fondo;
	}	
	private Image CrearIcono() throws MalformedURLException {
		
		icono=new ImageIcon(new URL("https://image.flaticon.com/icons/png/512/306/306473.png")).getImage();
		return icono;
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		try {
			g.drawImage(CrearFondo(),0, 0,this.getWidth(),this.getHeight(),this);
		} catch (MalformedURLException e) {
		
			e.printStackTrace();
		}
		
		
		
		
	}
	private void CrearLabels() {
		
		usuario=new JLabel("Usuario");
		usuario.setFont(new Font("Algerian", Font.BOLD, 25));
		usuario.setForeground(Color.black);
		usuario.setBounds(130,50,150,50);
		add(usuario);
		contraseña=new JLabel("Contraseña");
		contraseña.setFont(new Font("Algerian", Font.BOLD, 25));
		contraseña.setForeground(Color.black);
		contraseña.setBounds(130,135,180,50);
		add(contraseña);
		mensaje=new JLabel();
		mensaje.setFont(new Font("Bahnschrift", Font.BOLD,12));
		mensaje.setForeground(Color.RED);
		add(mensaje);
	
		
	}
	private void CrearTextfield() {
		
		focus eventofocus=new focus();
		usuarioTexto=new JTextField();
		usuarioTexto.setFont(new Font("Arial", Font.PLAIN, 16));
	    usuarioTexto.setForeground(Color.DARK_GRAY);
		usuarioTexto.setBounds(130,95,150,25);
		usuarioTexto.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		add(usuarioTexto);
		usuarioTexto.addFocusListener(eventofocus);
		usuarioTexto.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				super.keyTyped(e);
				
				//caracteres no validos
				char caracteresNOvalidos []= {'/','*','!','"','#','$','%','&','/','(',')','=','?','¡','¿','<','>',',','-','_',';','+'};
				for (int i = 0; i < caracteresNOvalidos.length; i++) {

					if(e.getKeyChar()==caracteresNOvalidos[i]) {
						final Runnable runnable =
							     (Runnable) Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.exclamation");
							if (runnable != null) runnable.run();
						e.consume();
					
					}
				}//fin de caracteres no validos	
				
				}
			
		});
	
		constraseñaTexto=new JTextField();
		constraseñaTexto.setFont(new Font("Arial", Font.PLAIN, 16));
		constraseñaTexto.setForeground(Color.DARK_GRAY);
		constraseñaTexto.setBounds(130,190,150,25);
		constraseñaTexto.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		add(constraseñaTexto);
		constraseñaTexto.addFocusListener(eventofocus);
		
	}
	
	private class focus implements FocusListener{
	
	@Override
	public void focusGained(FocusEvent e) {
		
		
		if(e.getSource()==usuarioTexto) {
			
			
			mensaje.setBounds(280, 85,100, 50);
			mensaje.setText("Digite su correo");
					
			}else if(e.getSource()==constraseñaTexto) {
				
				mensaje.setBounds(280, 180,125, 50);
				mensaje.setText("Digite su contraseña");
				
		
			}
		
		
	}
	@Override
	public void focusLost(FocusEvent e) {
		
		if(e.getSource()==usuarioTexto) {
			
			VerificarEmail(VerificarNombreUsuario());
		}
}
private void VerificarEmail(int arroba) {
	
	int email=13;
	
	if(arroba!=0) {
	
	for(int i=arroba+1;i<usuarioTexto.getText().length();i++) {email--;}
	if(email<0) JOptionPane.showMessageDialog(null,"EL domino comprende de 6 a 13 caracteres "+email,"Correo electronico no valido",
			JOptionPane.INFORMATION_MESSAGE);
	}
	
}
private int VerificarNombreUsuario() {
	
	int maximoUsuario=30;
	int minimoUsuario=6;
	int posicionDelArroba=0;
	if(usuarioTexto.getText().contains("@"))
	for (int i = 0; i < usuarioTexto.getText().length(); i++) {
		
		if(usuarioTexto.getText().charAt(i)!='@') {
			maximoUsuario--;minimoUsuario--;
			
	}else {
		
		posicionDelArroba=i;
		if(minimoUsuario>0)JOptionPane.showMessageDialog(null,"EL nombre de usuario debe ser entre 6 y 30 caracteres","ALERTA"
				,JOptionPane.INFORMATION_MESSAGE);
		else if(maximoUsuario<0)JOptionPane.showMessageDialog(null,"EL nombre de usuario debe ser entre 6 y 30 caracteres","ALERTA"
				,JOptionPane.INFORMATION_MESSAGE);
	}
	
}
	else JOptionPane.showMessageDialog(null,"Correo incorrecto","ALERTA"
			,JOptionPane.INFORMATION_MESSAGE);
	return posicionDelArroba;
}
	

}
	public static void main(String[] args) {new Login();}
	}
