package Dibujar_Imagenes;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.*;

public class paintcomponent extends JPanel {

	private JFrame contentPane;
	private Image imagen;
	private JLabel naruto;
	private JLabel supercampeones;
	private JLabel Bleach;
	
	
	public paintcomponent() {
		contentPane = new JFrame();
		contentPane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setResizable(false);
		contentPane.setExtendedState(contentPane.MAXIMIZED_BOTH);
		contentPane.setTitle("Imagenes de anime");
		try {
			contentPane.setIconImage(new ImageIcon(new URL("https://www.icon.co.cr/wp-content/uploads/2020/12/pw_Magic-Keyboard-espanol.jpg")).getImage());
		} catch (MalformedURLException e1) {
			JOptionPane.showMessageDialog(this, "No se pudo cargar el icono","ERROR",JOptionPane.ERROR_MESSAGE);
			e1.printStackTrace();
		}
		setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		setLayout(null);
		CrearComponentes();
		contentPane.setContentPane(this);
		
		
	}
	private void CrearComponentes() {
		
		Labelnaruto();
		LabelsuperCampeones();
		LabelBleach();
		
	}
	private void Labelnaruto() {
		
		naruto= new JLabel("Ver a Naruto");
		naruto.setBounds(10,20,100,30);
		naruto.setFont(new Font("Bell MT",Font.BOLD, 14));
		naruto.setBackground(Color.BLACK);
		naruto.setForeground(Color.white);
		naruto.setBorder(new BevelBorder(BevelBorder.RAISED));
		add(naruto);
		naruto.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				super.mousePressed(e);
				Naruto n = new Naruto();
				n.frame.setVisible(true);
				
			}
		});
	}
	private void LabelsuperCampeones() {
		
		supercampeones= new JLabel("Ver a SuperCampeones");
		supercampeones.setBounds(10,60,150,30);
		supercampeones.setFont(new Font("Bell MT",Font.BOLD, 14));
		supercampeones.setBackground(Color.BLACK);
		supercampeones.setForeground(Color.white);
		supercampeones.setBorder(new BevelBorder(BevelBorder.RAISED));
		add(supercampeones);
		supercampeones.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				super.mousePressed(e);
				supercampeones n = new supercampeones();
				n.frame.setVisible(true);
				
			}
		});
		
	}
	private void LabelBleach() {
		
		Bleach= new JLabel("Ver a Bleach");
		Bleach.setBounds(10,100,150,30);
		Bleach.setFont(new Font("Bell MT",Font.BOLD, 14));
		Bleach.setBackground(Color.BLACK);
		Bleach.setForeground(Color.white);
		Bleach.setBorder(new BevelBorder(BevelBorder.RAISED));
		add(Bleach);
		Bleach.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				super.mousePressed(e);
				Bleach n = new Bleach();
				n.frame.setVisible(true);
				
			}
		});
	}
	protected void paintComponent(Graphics g) {
       super.paintComponent(g);

           
        try {
			g.drawImage(new ImageIcon(new URL("https://elrecomendator.com/wp-content/uploads/2017/10/mejores-animes-de-la-historia-1200x682.jpg")).getImage(), 0, 0,getWidth() ,getHeight(),this);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Pinta la imagen
        	setOpaque(false);
        	
        

    }
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paintcomponent frame = new paintcomponent();
					frame.contentPane.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
