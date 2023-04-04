package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import proyectoDivisas.Divisas;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.UIManager;

public class FrmDivisas extends JFrame {

	private JPanel contentPane;
	private JTextField txtcantidad;
	private JTextField txtresultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmDivisas frame = new FrmDivisas();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmDivisas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmDivisas.class.getResource("/imagenes/icons8-value-64.png")));
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 581);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				FrmInicio verFormulario=new FrmInicio();
				
				
				verFormulario.setVisible(true);

				verFormulario.setLocationRelativeTo(null);
                    
				dispose();
			}
		});
		btnNewButton_6.setIcon(new ImageIcon(FrmDivisas.class.getResource("/imagenes/regreso.png")));
		btnNewButton_6.setBounds(0, 0, 48, 48);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    dispose();
				var continuar=JOptionPane.showConfirmDialog(null, "Desea continuar?");
				
				if(continuar==0) {
					JOptionPane.showMessageDialog(null, "Sigamos Convirtiendo monedas :D!!");
                     FrmDivisas verFormulario=new FrmDivisas();
					
					
					verFormulario.setVisible(true);
					verFormulario.setLocationRelativeTo(null);
					
				}if(continuar==1) {
					JOptionPane.showMessageDialog(null, "Nos vemos pronto!!");
					System.exit(0);
					
				}if(continuar==2) {
					FrmDivisas verFormulario=new FrmDivisas();
					
					
					verFormulario.setVisible(true);
					verFormulario.setLocationRelativeTo(null);
					 
					
					
					
				}
			}
		});
		btnNewButton_5.setIcon(new ImageIcon(FrmDivisas.class.getResource("/imagenes/cerrar-sesion.png")));
		btnNewButton_5.setBounds(492, 0, 48, 48);
		contentPane.add(btnNewButton_5);
		JComboBox comboBoxMoneda = new JComboBox();
		comboBoxMoneda.setBackground(new Color(224, 255, 255));
		comboBoxMoneda.setBounds(86, 207, 230, 40);
		contentPane.add(comboBoxMoneda);
		
		
		
		comboBoxMoneda.addItem("DOLAR - $");
		comboBoxMoneda.addItem("EUROS - EUR");
		comboBoxMoneda.addItem("LIBRAS ESTERLINAS - GPB");
		comboBoxMoneda.addItem("BOLIVIANOS - BOB");
		comboBoxMoneda.addItem("YEN JAPONES - JPY");
		comboBoxMoneda.addItem("WON SUR-COREANO - KRW");
		
		
		txtcantidad = new JTextField();
		txtcantidad.setBounds(86, 129, 311, 40);
		contentPane.add(txtcantidad);
		txtcantidad.setColumns(10);
		
		txtresultado = new JTextField();
		txtresultado.setEditable(false);
		txtresultado.setBounds(86, 292, 311, 40);
		contentPane.add(txtresultado);
		txtresultado.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CONVERTIDOR DE DIVISAS");
		lblNewLabel.setBackground(new Color(255, 255, 0));
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lblNewLabel.setBounds(86, 11, 311, 27);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon(FrmDivisas.class.getResource("/imagenes/icons8-usa-48.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double esdouble= Double.parseDouble(txtcantidad.getText());
				
					if(txtcantidad.getText()!="") {
						if(esdouble <=0) {
							JOptionPane.showMessageDialog(null, "el valor : "+ txtcantidad.getText()+ "  no es valido por que es menor o igual  a 0","ERROR",JOptionPane.ERROR_MESSAGE );
								
						}else {
							String valorMedida="";
							 if(comboBoxMoneda.getSelectedItem()=="DOLAR - $") {
						    	 valorMedida= "USD";
						     }else if (comboBoxMoneda.getSelectedItem()=="EUROS - EUR") {
						    	 valorMedida= "EUR";
						     }else if(comboBoxMoneda.getSelectedItem()=="LIBRAS ESTERLINAS - GPB") {
						    	 valorMedida="GBP";
						     }else if(comboBoxMoneda.getSelectedItem()=="BOLIVIANOS - BOB") {
						    	 valorMedida="BOB";
						     }else if(comboBoxMoneda.getSelectedItem()=="YEN JAPONES - JPY") {
						    	 valorMedida= "JPY";
						     }else if(comboBoxMoneda.getSelectedItem()=="WON SUR-COREANO - KRW") {
						    	 valorMedida= "KRW";
						     }else {
						    	 valorMedida= "N/A";
						     }
							
							
							Divisas moneda1= new Divisas(Double.parseDouble(txtcantidad.getText()),valorMedida); 	

							Divisas moneda2= new Divisas(1,"USD");
							
							
							txtresultado.setText(String.valueOf(moneda1.conversionDeMedida(moneda1, moneda2)));  
						}
						
					}else {
						JOptionPane.showMessageDialog(null, "Aun no ingreso ninguna cantidad","ERROR",JOptionPane.ERROR_MESSAGE );
						
					}
					
					
					
						
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "No se puede convertir solo se aceptan numeros","ERROR",JOptionPane.ERROR_MESSAGE );
						
				}

			
			
			
			}
		});
		btnNewButton.setBounds(42, 408, 50, 48);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setIcon(new ImageIcon(FrmDivisas.class.getResource("/imagenes/icons8-european-union-circular-flag-48.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double esdouble= Double.parseDouble(txtcantidad.getText());
				
					if(txtcantidad.getText()!="") {
						if(esdouble <=0) {
							JOptionPane.showMessageDialog(null, "el valor : "+ txtcantidad.getText()+ "  no es valido por que es menor o igual  a 0","ERROR",JOptionPane.ERROR_MESSAGE );
								
						}else {
							String valorMedida="";
							 if(comboBoxMoneda.getSelectedItem()=="DOLAR - $") {
						    	 valorMedida= "USD";
						     }else if (comboBoxMoneda.getSelectedItem()=="EUROS - EUR") {
						    	 valorMedida= "EUR";
						     }else if(comboBoxMoneda.getSelectedItem()=="LIBRAS ESTERLINAS - GPB") {
						    	 valorMedida="GBP";
						     }else if(comboBoxMoneda.getSelectedItem()=="BOLIVIANOS - BOB") {
						    	 valorMedida="BOB";
						     }else if(comboBoxMoneda.getSelectedItem()=="YEN JAPONES - JPY") {
						    	 valorMedida= "JPY";
						     }else if(comboBoxMoneda.getSelectedItem()=="WON SUR-COREANO - KRW") {
						    	 valorMedida= "KRW";
						     }else {
						    	 valorMedida= "N/A";
						     }
							
							
							Divisas moneda1= new Divisas(Double.parseDouble(txtcantidad.getText()),valorMedida); 	

							Divisas moneda2= new Divisas(1,"EUR");
							
							
							txtresultado.setText(String.valueOf(moneda1.conversionDeMedida(moneda1, moneda2)));  
						}
						
					}else {
						JOptionPane.showMessageDialog(null, "Aun no ingreso ninguna cantidad","ERROR",JOptionPane.ERROR_MESSAGE );
						
					}
					
					
					
						
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "No se puede convertir solo se aceptan numeros","ERROR",JOptionPane.ERROR_MESSAGE );
						
				}

			}
		});
		btnNewButton_1.setBounds(121, 408, 50, 48);
		contentPane.add(btnNewButton_1);
		////////////////////comienzo 
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setIcon(new ImageIcon(FrmDivisas.class.getResource("/imagenes/icons8-great-britain-48.png")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double esdouble= Double.parseDouble(txtcantidad.getText());
				
					if(txtcantidad.getText()!="") {
						if(esdouble <=0) {
							JOptionPane.showMessageDialog(null, "el valor : "+ txtcantidad.getText()+ "  no es valido por que es menor o igual  a 0","ERROR",JOptionPane.ERROR_MESSAGE );
								
						}else {
							String valorMedida="";
							 if(comboBoxMoneda.getSelectedItem()=="DOLAR - $") {
						    	 valorMedida= "USD";
						     }else if (comboBoxMoneda.getSelectedItem()=="EUROS - EUR") {
						    	 valorMedida= "EUR";
						     }else if(comboBoxMoneda.getSelectedItem()=="LIBRAS ESTERLINAS - GPB") {
						    	 valorMedida="GBP";
						     }else if(comboBoxMoneda.getSelectedItem()=="BOLIVIANOS - BOB") {
						    	 valorMedida="BOB";
						     }else if(comboBoxMoneda.getSelectedItem()=="YEN JAPONES - JPY") {
						    	 valorMedida= "JPY";
						     }else if(comboBoxMoneda.getSelectedItem()=="WON SUR-COREANO - KRW") {
						    	 valorMedida= "KRW";
						     }else {
						    	 valorMedida= "N/A";
						     }
							
							
							Divisas moneda1= new Divisas(Double.parseDouble(txtcantidad.getText()),valorMedida); 	

							Divisas moneda2= new Divisas(1,"GBP");
							
							
							txtresultado.setText(String.valueOf(moneda1.conversionDeMedida(moneda1, moneda2)));  
						}
						
					}else {
						JOptionPane.showMessageDialog(null, "Aun no ingreso ninguna cantidad","ERROR",JOptionPane.ERROR_MESSAGE );
						
					}
					
					
					
						
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "No se puede convertir solo se aceptan numeros","ERROR",JOptionPane.ERROR_MESSAGE );
						
				}
			}
		});
		btnNewButton_2.setBounds(197, 408, 50, 48);
		contentPane.add(btnNewButton_2);
		/////////////////////////////////fin
		
		
		
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.setIcon(new ImageIcon(FrmDivisas.class.getResource("/imagenes/icons8-south-korea-48.png")));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double esdouble= Double.parseDouble(txtcantidad.getText());
				
					if(txtcantidad.getText()!="") {
						if(esdouble <=0) {
							JOptionPane.showMessageDialog(null, "el valor : "+ txtcantidad.getText()+ "  no es valido por que es menor o igual  a 0","ERROR",JOptionPane.ERROR_MESSAGE );
								
						}else {
							String valorMedida="";
							 if(comboBoxMoneda.getSelectedItem()=="DOLAR - $") {
						    	 valorMedida= "USD";
						     }else if (comboBoxMoneda.getSelectedItem()=="EUROS - EUR") {
						    	 valorMedida= "EUR";
						     }else if(comboBoxMoneda.getSelectedItem()=="LIBRAS ESTERLINAS - GPB") {
						    	 valorMedida="GBP";
						     }else if(comboBoxMoneda.getSelectedItem()=="BOLIVIANOS - BOB") {
						    	 valorMedida="BOB";
						     }else if(comboBoxMoneda.getSelectedItem()=="YEN JAPONES - JPY") {
						    	 valorMedida= "JPY";
						     }else if(comboBoxMoneda.getSelectedItem()=="WON SUR-COREANO - KRW") {
						    	 valorMedida= "KRW";
						     }else {
						    	 valorMedida= "N/A";
						     }
							
							
							Divisas moneda1= new Divisas(Double.parseDouble(txtcantidad.getText()),valorMedida); 	

							Divisas moneda2= new Divisas(1,"KRW");
							
							
							txtresultado.setText(String.valueOf(moneda1.conversionDeMedida(moneda1, moneda2)));  
						}
						
					}else {
						JOptionPane.showMessageDialog(null, "Aun no ingreso ninguna cantidad","ERROR",JOptionPane.ERROR_MESSAGE );
						
					}
					
					
					
						
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "No se puede convertir solo se aceptan numeros","ERROR",JOptionPane.ERROR_MESSAGE );
						
				}

			}
		});
		btnNewButton_4.setBounds(347, 408, 50, 48);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("");
		btnNewButton_4_1.setBackground(Color.WHITE);
		btnNewButton_4_1.setBorderPainted(false);
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double esdouble= Double.parseDouble(txtcantidad.getText());
				
					if(txtcantidad.getText()!="") {
						if(esdouble <=0) {
							JOptionPane.showMessageDialog(null, "el valor : "+ txtcantidad.getText()+ "  no es valido por que es menor o igual  a 0","ERROR",JOptionPane.ERROR_MESSAGE );
								
						}else {
							String valorMedida="";
							 if(comboBoxMoneda.getSelectedItem()=="DOLAR - $") {
						    	 valorMedida= "USD";
						     }else if (comboBoxMoneda.getSelectedItem()=="EUROS - EUR") {
						    	 valorMedida= "EUR";
						     }else if(comboBoxMoneda.getSelectedItem()=="LIBRAS ESTERLINAS - GPB") {
						    	 valorMedida="GBP";
						     }else if(comboBoxMoneda.getSelectedItem()=="BOLIVIANOS - BOB") {
						    	 valorMedida="BOB";
						     }else if(comboBoxMoneda.getSelectedItem()=="YEN JAPONES - JPY") {
						    	 valorMedida= "JPY";
						     }else if(comboBoxMoneda.getSelectedItem()=="WON SUR-COREANO - KRW") {
						    	 valorMedida= "KRW";
						     }else {
						    	 valorMedida= "N/A";
						     }
							
							
							Divisas moneda1= new Divisas(Double.parseDouble(txtcantidad.getText()),valorMedida); 	

							Divisas moneda2= new Divisas(1,"BOB");
							
							
							txtresultado.setText(String.valueOf(moneda1.conversionDeMedida(moneda1, moneda2)));  
						}
						
					}else {
						JOptionPane.showMessageDialog(null, "Aun no ingreso ninguna cantidad","ERROR",JOptionPane.ERROR_MESSAGE );
						
					}
					
					
					
						
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "No se puede convertir solo se aceptan numeros","ERROR",JOptionPane.ERROR_MESSAGE );
						
				}

			}
		});
		btnNewButton_4_1.setIcon(new ImageIcon(FrmDivisas.class.getResource("/imagenes/icons8-bolivia-48.png")));
		btnNewButton_4_1.setBounds(422, 406, 50, 48);
		contentPane.add(btnNewButton_4_1);
		
		JLabel lblNewLabel_1 = new JLabel("DIGITE LA CANTIDAD A CONVERTIR :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblNewLabel_1.setBounds(86, 102, 288, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("SELECCIONE SU MONEDA:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblNewLabel_1_1.setBounds(86, 180, 288, 27);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("RESULTADO DE LA CONVERSION:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblNewLabel_1_2.setBounds(86, 266, 288, 27);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("SELECCIONE LA MONEDA A LA QUE CONVERTIRA:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblNewLabel_1_1_1.setBounds(86, 356, 288, 27);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(FrmDivisas.class.getResource("/imagenes/basura.png")));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtcantidad.setText("");
				txtresultado.setText("");
				
				txtcantidad.requestFocus();
				
			
			}
		});
		btnNewButton_3.setBounds(397, 292, 48, 40);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4_2 = new JButton("");
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double esdouble= Double.parseDouble(txtcantidad.getText());
				
					if(txtcantidad.getText()!="") {
						if(esdouble <=0) {
							JOptionPane.showMessageDialog(null, "el valor : "+ txtcantidad.getText()+ "  no es valido por que es menor o igual  a 0","ERROR",JOptionPane.ERROR_MESSAGE );
								
						}else {
							String valorMedida="";
							 if(comboBoxMoneda.getSelectedItem()=="DOLAR - $") {
						    	 valorMedida= "USD";
						     }else if (comboBoxMoneda.getSelectedItem()=="EUROS - EUR") {
						    	 valorMedida= "EUR";
						     }else if(comboBoxMoneda.getSelectedItem()=="LIBRAS ESTERLINAS - GPB") {
						    	 valorMedida="GBP";
						     }else if(comboBoxMoneda.getSelectedItem()=="BOLIVIANOS - BOB") {
						    	 valorMedida="BOB";
						     }else if(comboBoxMoneda.getSelectedItem()=="YEN JAPONES - JPY") {
						    	 valorMedida= "JPY";
						     }else if(comboBoxMoneda.getSelectedItem()=="WON SUR-COREANO - KRW") {
						    	 valorMedida= "KRW";
						     }else {
						    	 valorMedida= "N/A";
						     }
							
							
							Divisas moneda1= new Divisas(Double.parseDouble(txtcantidad.getText()),valorMedida); 	

							Divisas moneda2= new Divisas(1,"JPY");
							
							
							txtresultado.setText(String.valueOf(moneda1.conversionDeMedida(moneda1, moneda2)));  
						}
						
					}else {
						JOptionPane.showMessageDialog(null, "Aun no ingreso ninguna cantidad","ERROR",JOptionPane.ERROR_MESSAGE );
						
					}
					
					
					
						
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "No se puede convertir solo se aceptan numeros","ERROR",JOptionPane.ERROR_MESSAGE );
						
				}

			}
		});
		btnNewButton_4_2.setBackground(Color.WHITE);
		btnNewButton_4_2.setBorderPainted(false);
		btnNewButton_4_2.setIcon(new ImageIcon(FrmDivisas.class.getResource("/imagenes/icons8-japan-48.png")));
		btnNewButton_4_2.setBounds(270, 408, 50, 48);
		contentPane.add(btnNewButton_4_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(FrmDivisas.class.getResource("/imagenes/6379114.jpg")));
		lblNewLabel_3.setBounds(42, 0, 483, 48);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Dolar");
		lblNewLabel_4.setBounds(52, 467, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Euro");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(121, 467, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Libra Esterlina");
		lblNewLabel_6.setBounds(177, 467, 93, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Yen");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(280, 467, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Won");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(351, 467, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Bolivianos");
		lblNewLabel_9.setBounds(422, 467, 83, 14);
		contentPane.add(lblNewLabel_9);
	}
}
