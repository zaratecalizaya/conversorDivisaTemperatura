package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import proyectoDivisas.Divisas;
import proyectoDivisas.Temperatura;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmTemperatura extends JFrame {

	private JPanel contentPane;
	private JTextField unidad;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTemperatura frame = new FrmTemperatura();
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
	public FrmTemperatura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 555);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    dispose();
							var continuar=JOptionPane.showConfirmDialog(null, "Desea continuar?");
							
							if(continuar==0) {
								JOptionPane.showMessageDialog(null, "Sigamos Convirtiendo las escalas de temperatura :D!!");
			                     FrmTemperatura verFormulario=new FrmTemperatura();
								
								
								verFormulario.setVisible(true);
								verFormulario.setLocationRelativeTo(null);
								
								
							}if(continuar==1) {
								JOptionPane.showMessageDialog(null, "Nos vemos pronto!!");
								System.exit(0);
								
							}if(continuar==2) {
								FrmTemperatura verFormulario=new FrmTemperatura();
								
								
								verFormulario.setVisible(true);
				                    
								verFormulario.setLocationRelativeTo(null);
								
								
								
							}
						
			}
		});
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setIcon(new ImageIcon(FrmTemperatura.class.getResource("/imagenes/cerrar-sesion.png")));
		btnNewButton_5.setBounds(464, 0, 48, 48);
		contentPane.add(btnNewButton_5);
		
		unidad = new JTextField();
		unidad.setBounds(87, 115, 311, 40);
		contentPane.add(unidad);
		unidad.setColumns(10);
		
		JComboBox comboEscala = new JComboBox();
		comboEscala.setBackground(Color.ORANGE);
		comboEscala.setBounds(87, 206, 230, 40);
		contentPane.add(comboEscala);
		comboEscala.addItem("CELSIUS O CENTÍGRADOS (ºC)");
		
		comboEscala.addItem("FAHRENHEIT (ºF)");
		comboEscala.addItem("KELVIN (K)");
		
		
		resultado = new JTextField();
		resultado.setColumns(10);
		resultado.setBounds(87, 294, 311, 40);
		contentPane.add(resultado);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unidad.setText("");
				resultado.setText("");
				
				unidad.requestFocus();
			
			}
		});
		
		
		btnNewButton.setIcon(new ImageIcon(FrmTemperatura.class.getResource("/imagenes/basura.png")));
		btnNewButton.setBounds(397, 294, 48, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double esdouble= Double.parseDouble(unidad.getText());
				
					if(unidad.getText()!="") {
						if(esdouble <0) {
							JOptionPane.showMessageDialog(null, "el valor : "+ unidad.getText()+ "  no es valido por que es menor a 0","ERROR",JOptionPane.ERROR_MESSAGE );
								
						}else {
							String valorMedida="";
							if(comboEscala.getSelectedItem()=="CELSIUS O CENTÍGRADOS (ºC)") {
						    	 valorMedida= "C";
						     }else if (comboEscala.getSelectedItem()=="FAHRENHEIT (ºF)") {
						    	 valorMedida= "F";
						     }else if(comboEscala.getSelectedItem()=="KELVIN (K)") {
						    	 valorMedida="K";
						     }else {
						    	 valorMedida= "N/A";
						     }
							
							Temperatura escala1= new Temperatura(Double.parseDouble(unidad.getText()),valorMedida); 	

							Temperatura escala2= new Temperatura(1,"C");
							
							
							resultado.setText(String.valueOf(escala1.conversionDeMedida(escala1, escala2)));  
						}
						
					}else {
						JOptionPane.showMessageDialog(null, "Aun no ingreso ninguna cantidad ","ERROR",JOptionPane.ERROR_MESSAGE );
						
					}
					
					
					
						
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "No se puede convertir solo se aceptan numeros","ERROR",JOptionPane.ERROR_MESSAGE );
						
				}

			}
		});
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setIcon(new ImageIcon(FrmTemperatura.class.getResource("/imagenes/c-temperature-folded-icon_30475.png")));
		btnNewButton_1.setBounds(110, 414, 49, 49);
		contentPane.add(btnNewButton_1);
		
		
		
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double esdouble= Double.parseDouble(unidad.getText());
				
					if(unidad.getText()!="") {
						if(esdouble <0) {
							JOptionPane.showMessageDialog(null, "el valor : "+ unidad.getText()+ "  no es valido por que es menor a 0","ERROR",JOptionPane.ERROR_MESSAGE );
								
						}else {
							String valorMedida="";
							 if(comboEscala.getSelectedItem()=="CELSIUS O CENTÍGRADOS (ºC)") {
						    	 valorMedida= "C";
						     }else if (comboEscala.getSelectedItem()=="FAHRENHEIT (ºF)") {
						    	 valorMedida= "F";
						     }else if(comboEscala.getSelectedItem()=="KELVIN (K)") {
						    	 valorMedida="K";
						     }else {
						    	 valorMedida= "N/A";
						     }
							 Temperatura escala1= new Temperatura(Double.parseDouble(unidad.getText()),valorMedida); 	

								Temperatura escala2= new Temperatura(1,"F");
								
								
								resultado.setText(String.valueOf(escala1.conversionDeMedida(escala1, escala2)));  
						}
						
					}else {
						JOptionPane.showMessageDialog(null, "Aun no ingreso ninguna cantidad ","ERROR",JOptionPane.ERROR_MESSAGE );
						
					}
					
					
					
						
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "No se puede convertir solo se aceptan numeros","ERROR",JOptionPane.ERROR_MESSAGE );
						
				}
			}
		});
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setIcon(new ImageIcon(FrmTemperatura.class.getResource("/imagenes/f-temperature-folded-icon_30472.png")));
		btnNewButton_2.setBounds(230, 414, 49, 49);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(FrmTemperatura.class.getResource("/imagenes/alpha_k_circle_outline_icon_140003.png")));
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double esdouble= Double.parseDouble(unidad.getText());
				
					if(unidad.getText()!="") {
						if(esdouble <0) {
							JOptionPane.showMessageDialog(null, "el valor : "+ unidad.getText()+ "  no es valido por que es menor a 0","ERROR",JOptionPane.ERROR_MESSAGE );
								
						}else {
							String valorMedida="";
							 if(comboEscala.getSelectedItem()=="CELSIUS O CENTÍGRADOS (ºC)") {
						    	 valorMedida= "C";
						    	 
						     }else if (comboEscala.getSelectedItem()=="FAHRENHEIT (ºF)") {
						    	 valorMedida= "F";
						     }else if(comboEscala.getSelectedItem()=="KELVIN (K)") {
						    	 valorMedida="K";
						     }else {
						    	 valorMedida= "N/A";
						     }
							
							 Temperatura escala1= new Temperatura(Double.parseDouble(unidad.getText()),valorMedida); 	

								Temperatura escala2= new Temperatura(1,"K");
								
								
								resultado.setText(String.valueOf(escala1.conversionDeMedida(escala1, escala2)));  
					}
						
					}else {
						JOptionPane.showMessageDialog(null, "Aun no ingreso ninguna cantidad ","ERROR",JOptionPane.ERROR_MESSAGE );
						
					}
					
					
					
						
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "No se puede convertir solo se aceptan numeros","ERROR",JOptionPane.ERROR_MESSAGE );
						
				}
			}
		});
		btnNewButton_3.setBounds(341, 414, 49, 49);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FrmInicio verFormulario=new FrmInicio();
				
				
				verFormulario.setVisible(true);

				verFormulario.setLocationRelativeTo(null);
                    
				dispose();
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(FrmTemperatura.class.getResource("/imagenes/regreso.png")));
		btnNewButton_4.setBounds(0, 0, 48, 48);
		contentPane.add(btnNewButton_4);
	
		
		JLabel lblNewLabel_1 = new JLabel("CONVERTIDOR DE TEMPERATURA");
		lblNewLabel_1.setForeground(Color.YELLOW);
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lblNewLabel_1.setBackground(Color.YELLOW);
		lblNewLabel_1.setBounds(87, 11, 398, 27);
		contentPane.add(lblNewLabel_1);
	
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FrmTemperatura.class.getResource("/imagenes/fondo clima.jpg")));
		lblNewLabel.setBounds(22, 0, 463, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("DIGITE LA CANTIDAD A CONVERTIR :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblNewLabel_1_1.setBounds(87, 90, 288, 27);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("SELECCIONE LA ESCALA DE TEMPERATURA:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblNewLabel_1_1_1.setBounds(87, 180, 288, 27);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("RESULTADO DE LA CONVERSION:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblNewLabel_1_2.setBounds(87, 266, 288, 27);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("SELECCIONE LA ESCALA  A LA QUE CONVERTIRA:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblNewLabel_1_1_1_1.setBounds(87, 358, 288, 27);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Celsius");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(110, 474, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fahrenheit");
		lblNewLabel_3.setBounds(230, 474, 64, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Kelvin");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(341, 474, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		comboEscala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboEscala.getSelectedItem()=="CELSIUS O CENTÍGRADOS (ºC)") {
					btnNewButton_1.setVisible(false);
					lblNewLabel_2.setVisible(false);	 
					btnNewButton_2.setVisible(true);
					lblNewLabel_3.setVisible(true);	 
					btnNewButton_3.setVisible(true);
					lblNewLabel_4.setVisible(true);
				}
				if(comboEscala.getSelectedItem()=="FAHRENHEIT (ºF)") {
					btnNewButton_2.setVisible(false);
					lblNewLabel_3.setVisible(false);	 
					btnNewButton_1.setVisible(true);
					lblNewLabel_2.setVisible(true);
					btnNewButton_3.setVisible(true);
					lblNewLabel_4.setVisible(true);
				}
				if(comboEscala.getSelectedItem()=="KELVIN (K)") {
					btnNewButton_3.setVisible(false);
					lblNewLabel_4.setVisible(false);	 
					btnNewButton_1.setVisible(true);
					lblNewLabel_2.setVisible(true);	 
					btnNewButton_2.setVisible(true);
					lblNewLabel_3.setVisible(true);	 
			     }
				
				
				
			}
		});
		
		
		
	}
}
