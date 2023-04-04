package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmInicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmInicio frame = new FrmInicio();
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
	public FrmInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 467);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(FrmInicio.class.getResource("/imagenes/icons8-chatbot-94.png")));
		lblNewLabel_1.setBounds(129, 87, 134, 76);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("BIENVENIDO USUARIO");
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setBounds(91, 38, 210, 22);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel);
		
		JLabel lblquHaremosHoy = new JLabel("¿Qué haremos hoy?");
		lblquHaremosHoy.setHorizontalAlignment(SwingConstants.CENTER);
		lblquHaremosHoy.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblquHaremosHoy.setBounds(91, 188, 210, 22);
		contentPane.add(lblquHaremosHoy);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FrmDivisas verFormulario=new FrmDivisas();
				verFormulario.setVisible(true);

				verFormulario.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon(FrmInicio.class.getResource("/imagenes/icons8-cambio-de-divisas-64.png")));
		btnNewButton.setBounds(106, 257, 89, 76);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(FrmInicio.class.getResource("/imagenes/icons8-temperatura-64.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FrmTemperatura verFormulario=new FrmTemperatura();
				verFormulario.setVisible(true);

				verFormulario.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_1.setBounds(244, 257, 89, 76);
		contentPane.add(btnNewButton_1);
		
		JLabel lblCambioDeDivisas = new JLabel("Cambio de Divisas o Temperatura?");
		lblCambioDeDivisas.setForeground(new Color(30, 144, 255));
		lblCambioDeDivisas.setHorizontalAlignment(SwingConstants.CENTER);
		lblCambioDeDivisas.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCambioDeDivisas.setBounds(69, 221, 292, 22);
		contentPane.add(lblCambioDeDivisas);
		
		JLabel lblNewLabel_2 = new JLabel("Elaborado por Lesly Zarate");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_2.setForeground(new Color(102, 205, 170));
		lblNewLabel_2.setBounds(140, 403, 161, 14);
		contentPane.add(lblNewLabel_2);
	}

}
