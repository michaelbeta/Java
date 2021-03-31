package Action;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class multiplesEventos extends JFrame{
	
	private JPanel miPanel;
	private JButton Algerian;
	private JButton Times_New_Roman;
	private JButton Bauhaus_93;
	private JTextArea editorTexto;
	private JScrollPane scroll;
	
	public multiplesEventos() {
		setBounds(420,120,480,320);
		setTitle("Multiples eventos");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		IniciarComponentes();
		add(miPanel);
		
		setVisible(true);
	}

	private void IniciarComponentes() {
		miPanel=new JPanel();
		miPanel.setLayout(null);
		miPanel.setBackground(Color.BLACK);
		Algerian = new JButton(new Eventos_de_los_Botones("Algerian",new Font("Algerian",Font.PLAIN,18)));
		Algerian.setBounds(50, 10,100,40);
		Algerian.setToolTipText("Tambien puede pulsar E");
		miPanel.add(Algerian);
		Times_New_Roman= new JButton(new Eventos_de_los_Botones("Times New Roman",new Font("Times New Roman",Font.PLAIN,18)));
		Times_New_Roman.setBounds(150, 10,150,40);
		Times_New_Roman.setToolTipText("Tambien puede pulsar Q");
		miPanel.add(Times_New_Roman);
		Bauhaus_93=new JButton(new Eventos_de_los_Botones("Bauhaus 93",new Font("Bauhaus 93",Font.PLAIN,18)));
		Bauhaus_93.setBounds(300, 10,130,40);
		Bauhaus_93.setToolTipText("Tambien puede pulsar W");
		miPanel.add(Bauhaus_93);
		editorTexto=new JTextArea("Arial es la fuente por defecto");
		editorTexto.setFont(new Font(null, Font.PLAIN,18));
		editorTexto.setBackground(Color.black);
		editorTexto.setForeground(Color.white);
		scroll = new JScrollPane(editorTexto);
		scroll.setBounds(30, 80,400,200);
		scroll.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		miPanel.add(scroll);
		
		eventoConTeclas();
		
		
	}
	private void eventoConTeclas() {
		InputMap MapaEntrada = miPanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);//1- Crear mapa de entrada
		MapaEntrada.put(KeyStroke.getKeyStroke('Q'),"Times New Roman");//2-Crear combinaciones de teclas
		MapaEntrada.put(KeyStroke.getKeyStroke('W'),"Bauhaus 93");
		MapaEntrada.put(KeyStroke.getKeyStroke("E"),"Algerian");
		ActionMap mapaAccion=miPanel.getActionMap();
		
		mapaAccion.put("Times New Roman", new Eventos_de_los_Botones("Times New Roman",new Font("Times New Roman",Font.PLAIN,18)) );//3-Asignar combinaciones de teclas a objeto-descripción
		mapaAccion.put("Bauhaus 93",new Eventos_de_los_Botones("Bauhaus 93",new Font("Bauhaus 93",Font.PLAIN,18)));
		mapaAccion.put("Algerian",new Eventos_de_los_Botones("Algerian",new Font("Algerian",Font.PLAIN,18)));
		
	}
	private class Eventos_de_los_Botones extends AbstractAction{

		public Eventos_de_los_Botones(String name,Font f) {
			
			putValue(Action.NAME, name);
			putValue("Fuentes", f);
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			
			Font f= (Font)getValue("Fuentes");
			editorTexto.setFont(f);
			
			
		}
		
		
		
	}

	public static void main(String[] args) {new multiplesEventos();}

}
