package Layouts;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.*;


public class Calculadora extends JFrame {

	private JPanel panelPrincipal;
	private JPanel Pantalla;
	protected JTextField display;
	protected JTextField historialNumeros;
	private PanelDeTeclas mipanel;

	public Calculadora() {

		setSize(325, 389);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationByPlatform(true);
		setTitle("Calculadora Basica");
		//setType(Type.UTILITY);
		setFocusable(false);
		iniciaerComponentes();
		setVisible(true);
	}

	private void iniciaerComponentes() {

		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(new Color(14, 20, 13));
		panelPrincipal.setLayout(new BorderLayout());
		panelPrincipal.setFocusable(false);
		Pantalla = new JPanel();
		Pantalla.setLayout(new BorderLayout());
		Pantalla.setFocusable(false);
		getContentPane().add(panelPrincipal);
		mipanel = new PanelDeTeclas();
		panelPrincipal.add(mipanel, BorderLayout.SOUTH);
		panelPrincipal.add(Pantalla, BorderLayout.NORTH);
		display = new JTextField("0", 16);
		display.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 45));
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setBackground(new Color(14, 20, 13));
		display.setForeground(Color.WHITE);
		display.setBorder(null);
		display.setEditable(false);
		display.requestFocus();
		display.addKeyListener(new ResponderAlTeclado());
		historialNumeros = new JTextField("", 16);
		historialNumeros.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		historialNumeros.setBackground(new Color(14, 20, 13));
		historialNumeros.setHorizontalAlignment(SwingConstants.RIGHT);
		historialNumeros.setForeground(Color.WHITE);
		historialNumeros.setBorder(null);
		historialNumeros.setEditable(false);
		historialNumeros.setFocusable(false);
		Pantalla.add(display, BorderLayout.SOUTH);
		Pantalla.add(historialNumeros, BorderLayout.NORTH);
	}

	private class ResponderAlTeclado extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			super.keyPressed(e);

			/*
			 * if(e.getKeyText(e.getKeyCode()).equalsIgnoreCase("Backspace"))display.gett
			 * else
			 */if (e.getKeyChar() == '7')
				display.setText(display.getText() + e.getKeyChar());

		}

	}

	private class PanelDeTeclas extends JPanel {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JButton CE, C, retroceso, dividir, siete, ocho, nueve, X, cuatro, cinco, seis, menos, uno, dos, tres,
				mas, posi_negat, cero, coma, igual;

		public PanelDeTeclas() {

			setLayout(new GridLayout(5, 4, 2, 2));
			setBackground(new Color(41, 26, 23));
			for (int j = 1; j <= 20; j++) {
				CrearBotones(j);
			}
		}

		private void CrearBotones(int Nboton) {

			if (Nboton == 1) {
				CE = new JButton(ImagenCE());
				add(CE);
				CE.setFocusable(false);
				CE.addActionListener(new AccionesDeBotones());
			} else if (Nboton == 2) {
				C = new JButton(ImagenC());
				add(C);
				C.setFocusable(false);
				C.addActionListener(new AccionesDeBotones());
			} else if (Nboton == 3) {
				retroceso = new JButton(ImagenRetroceso());
				add(retroceso);
				retroceso.setFocusable(false);
				retroceso.addActionListener(new AccionesDeBotones());
			} else if (Nboton == 4) {
				dividir = new JButton(ImagenDividir());
				add(dividir);
				dividir.setFocusable(false);
				dividir.addActionListener(new AccionesDeBotones());
			} else if (Nboton == 5) {
				siete = new JButton(ImagenSiete());
				add(siete);
				siete.setFocusable(false);
				siete.addActionListener(new AccionesDeBotones());

			} else if (Nboton == 6) {
				ocho = new JButton(ImagenOcho());
				add(ocho);
				ocho.setFocusable(false);
				ocho.addActionListener(new AccionesDeBotones());
			} else if (Nboton == 7) {
				nueve = new JButton(ImagenNueve());
				add(nueve);
				nueve.setFocusable(false);
				nueve.addActionListener(new AccionesDeBotones());
			} else if (Nboton == 8) {
				X = new JButton(ImagenX());
				add(X);
				X.setFocusable(false);
				X.addActionListener(new AccionesDeBotones());
			} else if (Nboton == 9) {
				cuatro = new JButton(Imagencuatro());
				add(cuatro);
				cuatro.setFocusable(false);
				cuatro.addActionListener(new AccionesDeBotones());
			} else if (Nboton == 10) {
				cinco = new JButton(ImagenCinco());
				add(cinco);
				cinco.setFocusable(false);
				cinco.addActionListener(new AccionesDeBotones());
			} else if (Nboton == 11) {
				seis = new JButton(ImagenSeis());
				add(seis);
				seis.setFocusable(false);
				seis.addActionListener(new AccionesDeBotones());
			} else if (Nboton == 12) {
				menos = new JButton(ImagenMenos());
				add(menos);
				menos.setFocusable(false);
				menos.addActionListener(new AccionesDeBotones());
			} else if (Nboton == 13) {
				uno = new JButton(ImagenUno());
				add(uno);
				uno.setFocusable(false);
				uno.addActionListener(new AccionesDeBotones());
			} else if (Nboton == 14) {
				dos = new JButton(ImagenDos());
				add(dos);
				dos.setFocusable(false);
				dos.addActionListener(new AccionesDeBotones());
			} else if (Nboton == 15) {
				tres = new JButton(ImagenTres());
				add(tres);
				tres.setFocusable(false);
				tres.addActionListener(new AccionesDeBotones());
			} else if (Nboton == 16) {
				mas = new JButton(ImagenMas());
				add(mas);
				mas.setFocusable(false);
				mas.addActionListener(new AccionesDeBotones());
			} else if (Nboton == 17) {
				posi_negat = new JButton(ImagenPosi_Nega());
				add(posi_negat);
				posi_negat.setFocusable(false);
				posi_negat.addActionListener(new AccionesDeBotones());
			} else if (Nboton == 18) {
				cero = new JButton(ImagenCero());
				add(cero);
				cero.setFocusable(false);
				cero.addActionListener(new AccionesDeBotones());
			} else if (Nboton == 19) {
				coma = new JButton(ImagenComa());
				add(coma);
				coma.setFocusable(false);
				coma.addActionListener(new AccionesDeBotones());
			} else if (Nboton == 20) {
				igual = new JButton(ImagenIgual());
				add(igual);
				igual.setFocusable(false);
				igual.addActionListener(new AccionesDeBotones());
			}

		}

		private class AccionesDeBotones extends AbstractAction {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private boolean completarAccion = false;
			private String resultado;
			private ArrayList<Double> operacionDeNuemros = new ArrayList<Double>();

			@Override
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == CE) {
					display.setText("0");
				
				}else if (e.getSource() == C) {
					display.setText("0");
					historialNumeros.setText("");
					 completarAccion = false;
					 operacionDeNuemros.clear();
				} else if (e.getSource() == retroceso) {

					display.setText(BorrarUltimoDigito(display.getText()));

				} else if (e.getSource() == dividir) {
					Dividir();
					
					
				} else if (e.getSource() == siete) {

						display.setText(display.getText() + "7");
						String quitarCero = BorrarPrimerDigito(display.getText());
						display.setText(quitarCero);
					
				}else if(e.getSource() == ocho) {
					display.setText(display.getText() + "8");
					String quitarCero = BorrarPrimerDigito(display.getText());
					display.setText(quitarCero);
					
				}else if(e.getSource() == nueve) {
					display.setText(display.getText() + "9");
					String quitarCero = BorrarPrimerDigito(display.getText());
					display.setText(quitarCero);
					
				}else if(e.getSource() == X) {
					
					Multiplicar();
				}else if(e.getSource() == cuatro) {
					display.setText(display.getText() + "4");
					String quitarCero = BorrarPrimerDigito(display.getText());
					display.setText(quitarCero);
					
				}else if(e.getSource() == cinco) {
					
					display.setText(display.getText() + "5");
					String quitarCero = BorrarPrimerDigito(display.getText());
					display.setText(quitarCero);
				}else if(e.getSource() == seis) {
					display.setText(display.getText() + "6");
					String quitarCero = BorrarPrimerDigito(display.getText());
					display.setText(quitarCero);
					
				}else if(e.getSource() == menos) {
						Restar();
					
				}else if(e.getSource() == uno) {
					display.setText(display.getText() + "1");
					String quitarCero = BorrarPrimerDigito(display.getText());
					display.setText(quitarCero);
					
				}else if(e.getSource() == dos) {
					display.setText(display.getText() + "2");
					String quitarCero = BorrarPrimerDigito(display.getText());
					display.setText(quitarCero);
					
				}else if(e.getSource() == tres) {
					display.setText(display.getText() + "3");
					String quitarCero = BorrarPrimerDigito(display.getText());
					display.setText(quitarCero);
					
				}else if(e.getSource() == mas) {
					Sumar();
					
				}else if(e.getSource() == posi_negat) {
					
					
				}else if(e.getSource() == cero) {
					display.setText(display.getText() + "0");
					String quitarCero = BorrarPrimerDigito(display.getText());
					display.setText(quitarCero);
					
				}else if(e.getSource() == coma) {
					
					
				}else if(e.getSource() == igual) {
					
					
				}
			}
			private void Dividir() {
				
				
				if (completarAccion) {
				if(resultado==null) {//Primera operacion sin un resultado almacenado
					
					historialNumeros.setText(historialNumeros.getText() + display.getText());
					
					if(ComprobarOperacion(historialNumeros.getText())) {
						
					operacionDeNuemros.add(Double.parseDouble(display.getText()));
					
					
					double divid=1;
					for (int i = operacionDeNuemros.size()-1; i >=0; i--) {
						
						 divid=operacionDeNuemros.get(i)/divid;
						
					}
					
					display.setText(verificarDecimal(divid));
					resultado=display.getText();
					historialNumeros.setText(historialNumeros.getText()+"÷");
					completarAccion = false;
					operacionDeNuemros.clear();
					
						}
					//Si existe un resultado se procede acontinuacion
				}else {	
					
					if(ComprobarOperacion(historialNumeros.getText())) {
						
					operacionDeNuemros.add(Double.parseDouble(resultado));
					
	
					double divid=operacionDeNuemros.get(1)/operacionDeNuemros.get(0);

					display.setText(verificarDecimal(divid));
					resultado=display.getText();
					historialNumeros.setText(historialNumeros.getText()+"÷");//signo despues del resultado despues del resultado
					completarAccion = false;
					
					operacionDeNuemros.clear();
					
					}
					}		
					
						
					}else if (!completarAccion) {
						System.out.println(completarAccion);
						if(historialNumeros.getText().length()<1) {
							
							operacionDeNuemros.add(Double.parseDouble(display.getText()));
							historialNumeros.setText(display.getText() + "÷");
							completarAccion = true;
							resultado=null;
							
						}else {
							if(historialNumeros.getText().charAt(historialNumeros.getText().length()-1)=='÷') {
								
								operacionDeNuemros.add(Double.parseDouble(display.getText()));
								historialNumeros.setText(historialNumeros.getText()+display.getText());
								completarAccion = true;
								
								Dividir();
						}
					}
					}
				
				
				
			}
			private void Multiplicar() {
				
				
				if (completarAccion) {
				if(resultado==null) {//Primera operacion sin un resultado almacenado
					
					historialNumeros.setText(historialNumeros.getText() + display.getText());
					
					if(ComprobarOperacion(historialNumeros.getText())) {
						
					operacionDeNuemros.add(Double.parseDouble(display.getText()));
					
					
					double divid=1;
					for (int i = operacionDeNuemros.size()-1; i >=0; i--) {
						
						 divid=operacionDeNuemros.get(i)*divid;
						
					}
					
					display.setText(verificarDecimal(divid));
					resultado=display.getText();
					historialNumeros.setText(historialNumeros.getText()+"x");
					completarAccion = false;
					operacionDeNuemros.clear();
					
						}
					//Si existe un resultado se procede acontinuacion
				}else {	
					
					if(ComprobarOperacion(historialNumeros.getText())) {
						
					operacionDeNuemros.add(Double.parseDouble(resultado));
					
	
					double divid=operacionDeNuemros.get(1)*operacionDeNuemros.get(0);

					display.setText(verificarDecimal(divid));
					resultado=display.getText();
					historialNumeros.setText(historialNumeros.getText()+"x");//signo despues del resultado despues del resultado
					completarAccion = false;
					
					operacionDeNuemros.clear();
					
					}
					}		
					
						
					}else if (!completarAccion) {
						System.out.println(completarAccion);
						if(historialNumeros.getText().length()<1) {
							
							operacionDeNuemros.add(Double.parseDouble(display.getText()));
							historialNumeros.setText(display.getText() + "x");
							completarAccion = true;
							resultado=null;
						
						}else {
							if(historialNumeros.getText().charAt(historialNumeros.getText().length()-1)=='x') {
								
								operacionDeNuemros.add(Double.parseDouble(display.getText()));
								historialNumeros.setText(historialNumeros.getText()+display.getText());
								completarAccion = true;
								
								Multiplicar();
						}
					}
					}
				
				
				
			}		
			private void Sumar() {
				
				
				if (completarAccion) {
				if(resultado==null) {//Primera operacion sin un resultado almacenado
					
					historialNumeros.setText(historialNumeros.getText() + display.getText());
					
					if(ComprobarOperacion(historialNumeros.getText())) {
						
					operacionDeNuemros.add(Double.parseDouble(display.getText()));
					
					
					double sumar=0;
					for (int i = operacionDeNuemros.size()-1; i >=0; i--) {
						
						 sumar=operacionDeNuemros.get(i)+sumar;
						
					}
					
					display.setText(verificarDecimal(sumar));
					resultado=display.getText();
					historialNumeros.setText(historialNumeros.getText()+"+");
					completarAccion = false;
					operacionDeNuemros.clear();
					
						}
					//Si existe un resultado se procede acontinuacion
				}else {	
					
					if(ComprobarOperacion(historialNumeros.getText())) {
						
					operacionDeNuemros.add(Double.parseDouble(resultado));
					
	
					double sumar=operacionDeNuemros.get(1)+operacionDeNuemros.get(0);

					display.setText(verificarDecimal(sumar));
					resultado=display.getText();
					historialNumeros.setText(historialNumeros.getText()+"+");//signo despues del resultado despues del resultado
					completarAccion = false;
					
					operacionDeNuemros.clear();
					
					}
					}		
					
						
					}else if (!completarAccion) {
						System.out.println(completarAccion);
						if(historialNumeros.getText().length()<1) {
							
							operacionDeNuemros.add(Double.parseDouble(display.getText()));
							historialNumeros.setText(display.getText() + "+");
							completarAccion = true;
							resultado=null;
						
						}else {
							if(historialNumeros.getText().charAt(historialNumeros.getText().length()-1)=='+') {
								
								operacionDeNuemros.add(Double.parseDouble(display.getText()));
								historialNumeros.setText(historialNumeros.getText()+display.getText());
								completarAccion = true;
								
								Sumar();
						}
					}
					}
				
				
				
			}
			private void Restar() {
				
				
				if (completarAccion) {
				if(resultado==null) {//Primera operacion sin un resultado almacenado
					
					historialNumeros.setText(historialNumeros.getText() + display.getText());
					
					if(ComprobarOperacion(historialNumeros.getText())) {
						
					operacionDeNuemros.add(Double.parseDouble(display.getText()));
					
					
					double sumar=0;
					for (int i = operacionDeNuemros.size()-1; i >=0; i--) {
						
						 sumar=operacionDeNuemros.get(i)-sumar;
						
					}
					
					display.setText(verificarDecimal(sumar));
					resultado=display.getText();
					historialNumeros.setText(historialNumeros.getText()+"-");
					completarAccion = false;
					operacionDeNuemros.clear();
					
						}
					//Si existe un resultado se procede acontinuacion
				}else {	
					
					if(ComprobarOperacion(historialNumeros.getText())) {
						
					operacionDeNuemros.add(Double.parseDouble(resultado));
					
	
					double sumar=operacionDeNuemros.get(1)-operacionDeNuemros.get(0);

					display.setText(verificarDecimal(sumar));
					resultado=display.getText();
					historialNumeros.setText(historialNumeros.getText()+"-");//signo despues del resultado despues del resultado
					completarAccion = false;
					
					operacionDeNuemros.clear();
					
					}
					}		
					
						
					}else if (!completarAccion) {
						System.out.println(completarAccion);
						if(historialNumeros.getText().length()<1) {
							
							operacionDeNuemros.add(Double.parseDouble(display.getText()));
							historialNumeros.setText(display.getText() + "-");
							completarAccion = true;
							resultado=null;
						
						}else {
							if(historialNumeros.getText().charAt(historialNumeros.getText().length()-1)=='-') {
								
								operacionDeNuemros.add(Double.parseDouble(display.getText()));
								historialNumeros.setText(historialNumeros.getText()+display.getText());
								completarAccion = true;
								
								Restar();
						}
					}
					}
				
				
				
			}					
			private String verificarDecimal(Double numero) {
				
				String SinDecimal=""+numero;
				
					if(SinDecimal.contains(".")&&SinDecimal.contains("0")) {
						
						int convertir=numero.intValue();
						SinDecimal=""+convertir;
					}
				
				return SinDecimal;
				
			}
			private boolean ComprobarOperacion(String historial) {
				System.out.println(historial);
				for (int i = 0; i < historial.length(); i++) {
				
					if (historial.charAt(i) == '÷' || historial.charAt(i) == '+' || historial.charAt(i) == '-'
							|| historial.charAt(i) == 'x'|| historial.charAt(i) == '*'|| historial.charAt(i) == '/') {
						
						try {
							if(historial.length()<i+1)
							if(!Character.isDigit(historial.charAt(i+1))) return false;
							else return true;
						} catch (IndexOutOfBoundsException e) {
							System.out.println("ERROR"+e);
							break;
							
						}
						
						
					}
				}

				return true;
			}

			private String BorrarUltimoDigito(String digito) {

				StringBuilder BorrarultimoDigito = new StringBuilder(digito);
				String ultimoDigito = "0";
				if (BorrarultimoDigito.length() != 1) {

					BorrarultimoDigito = BorrarultimoDigito.deleteCharAt(display.getText().length() - 1);
					ultimoDigito = BorrarultimoDigito.toString();

				}
				return ultimoDigito;
			}

			private String BorrarPrimerDigito(String digito) {

				StringBuilder BorrarPrimerDigito = new StringBuilder(digito);
				String primerDigito = display.getText();

				if (BorrarPrimerDigito.charAt(0) == '0') {

					BorrarPrimerDigito = BorrarPrimerDigito.deleteCharAt(0);
					primerDigito = BorrarPrimerDigito.toString();

				}
				return primerDigito;
			}

		}

		private ImageIcon ImagenCE() {

			ImageIcon icono = new ImageIcon("src/Layouts/imagenes/CE.png");
			Image imgEscalada = icono.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
			icono = new ImageIcon(imgEscalada);

			return icono;
		}

		private ImageIcon ImagenC() {

			ImageIcon icono = new ImageIcon("src/Layouts/imagenes/C.png");
			Image imgEscalada = icono.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
			icono = new ImageIcon(imgEscalada);

			return icono;
		}

		private ImageIcon ImagenRetroceso() {

			ImageIcon icono = new ImageIcon("src/Layouts/imagenes/retroceso.png");
			Image imgEscalada = icono.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
			icono = new ImageIcon(imgEscalada);

			return icono;
		}

		private ImageIcon ImagenDividir() {

			ImageIcon icono = new ImageIcon("src/Layouts/imagenes/div.png");
			Image imgEscalada = icono.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
			icono = new ImageIcon(imgEscalada);

			return icono;
		}

		private ImageIcon ImagenSiete() {

			ImageIcon icono = new ImageIcon("src/Layouts/imagenes/7.png");
			Image imgEscalada = icono.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
			icono = new ImageIcon(imgEscalada);

			return icono;
		}

		private ImageIcon ImagenOcho() {

			ImageIcon icono = new ImageIcon("src/Layouts/imagenes/8.png");
			Image imgEscalada = icono.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
			icono = new ImageIcon(imgEscalada);

			return icono;
		}

		private ImageIcon ImagenNueve() {

			ImageIcon icono = new ImageIcon("src/Layouts/imagenes/9.png");
			Image imgEscalada = icono.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
			icono = new ImageIcon(imgEscalada);

			return icono;
		}

		private ImageIcon ImagenX() {

			ImageIcon icono = new ImageIcon("src/Layouts/imagenes/x.png");
			Image imgEscalada = icono.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
			icono = new ImageIcon(imgEscalada);

			return icono;
		}

		private ImageIcon Imagencuatro() {

			ImageIcon icono = new ImageIcon("src/Layouts/imagenes/4.png");
			Image imgEscalada = icono.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
			icono = new ImageIcon(imgEscalada);

			return icono;
		}

		private ImageIcon ImagenCinco() {

			ImageIcon icono = new ImageIcon("src/Layouts/imagenes/5.png");
			Image imgEscalada = icono.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
			icono = new ImageIcon(imgEscalada);

			return icono;
		}

		private ImageIcon ImagenSeis() {

			ImageIcon icono = new ImageIcon("src/Layouts/imagenes/6.png");
			Image imgEscalada = icono.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
			icono = new ImageIcon(imgEscalada);

			return icono;
		}

		private ImageIcon ImagenMenos() {

			ImageIcon icono = new ImageIcon("src/Layouts/imagenes/-.png");
			Image imgEscalada = icono.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
			icono = new ImageIcon(imgEscalada);

			return icono;
		}

		private ImageIcon ImagenUno() {

			ImageIcon icono = new ImageIcon("src/Layouts/imagenes/1.png");
			Image imgEscalada = icono.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
			icono = new ImageIcon(imgEscalada);

			return icono;
		}

		private ImageIcon ImagenDos() {

			ImageIcon icono = new ImageIcon("src/Layouts/imagenes/2.png");
			Image imgEscalada = icono.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
			icono = new ImageIcon(imgEscalada);

			return icono;
		}

		private ImageIcon ImagenTres() {

			ImageIcon icono = new ImageIcon("src/Layouts/imagenes/3.png");
			Image imgEscalada = icono.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
			icono = new ImageIcon(imgEscalada);

			return icono;
		}

		private ImageIcon ImagenMas() {

			ImageIcon icono = new ImageIcon("src/Layouts/imagenes/+.png");
			Image imgEscalada = icono.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
			icono = new ImageIcon(imgEscalada);

			return icono;
		}

		private ImageIcon ImagenPosi_Nega() {

			ImageIcon icono = new ImageIcon("src/Layouts/imagenes/posi_nega.png");
			Image imgEscalada = icono.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
			icono = new ImageIcon(imgEscalada);

			return icono;
		}

		private ImageIcon ImagenCero() {

			ImageIcon icono = new ImageIcon("src/Layouts/imagenes/0.png");
			Image imgEscalada = icono.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
			icono = new ImageIcon(imgEscalada);

			return icono;
		}

		private ImageIcon ImagenComa() {

			ImageIcon icono = new ImageIcon("src/Layouts/imagenes/coma.png");
			Image imgEscalada = icono.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
			icono = new ImageIcon(imgEscalada);

			return icono;
		}

		private ImageIcon ImagenIgual() {

			ImageIcon icono = new ImageIcon("src/Layouts/imagenes/igual.png");
			Image imgEscalada = icono.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
			icono = new ImageIcon(imgEscalada);

			return icono;
		}

	}

	public static void main(String[] args) {
		new Calculadora();
	}

}
