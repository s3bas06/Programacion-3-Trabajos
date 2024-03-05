package main_ejemplo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.Icon;

import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;

public class ventanaLayouts {

	private JFrame frmRegistroDeUsuarios;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaLayouts window = new ventanaLayouts();
					window.frmRegistroDeUsuarios.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ventanaLayouts() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistroDeUsuarios = new JFrame();
		frmRegistroDeUsuarios.setTitle("Registro de usuarios");
		frmRegistroDeUsuarios.setBounds(100, 100, 711, 499);
		frmRegistroDeUsuarios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistroDeUsuarios.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(172, 255, 98));
		panel.setBounds(0, 0, 695, 460);
		frmRegistroDeUsuarios.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(172, 255, 98));
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(null);
		panel_1.setPreferredSize(new Dimension(695, 40));
		
		JLabel lblNewLabel = new JLabel("Registro de Usuarios");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(34, 11, 171, 18);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(172, 255, 98));
		panel.add(panel_2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(128, 255, 255));
		panel_2.add(panel_3);
		panel_3.setPreferredSize(new Dimension(430, 260));
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(128, 255, 255));
		panel_3.add(panel_7, BorderLayout.NORTH);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("    Datos generales");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBackground(new Color(128, 255, 255));
		panel_7.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(128, 255, 255));
		panel_3.add(panel_11, BorderLayout.CENTER);
		panel_11.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(87, 27, 63, 14);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Apellido paterno:");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(45, 61, 105, 14);
		panel_11.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Apellido materno:");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(45, 97, 105, 14);
		panel_11.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Fecha de Nacimiento:");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1.setBounds(24, 134, 126, 14);
		panel_11.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Sexo:");
		lblNewLabel_2_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1.setBounds(24, 170, 126, 14);
		panel_11.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("Nacionalidad:");
		lblNewLabel_2_1_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_2.setBounds(24, 219, 126, 14);
		panel_11.add(lblNewLabel_2_1_1_1_2);
		
		textField = new JTextField();
		textField.setBounds(193, 25, 138, 20);
		panel_11.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(193, 59, 138, 20);
		panel_11.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(193, 95, 138, 20);
		panel_11.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(193, 132, 86, 20);
		panel_11.add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(193, 216, 138, 22);
		panel_11.add(comboBox);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(225, 159, 106, 23);
		panel_11.add(rdbtnMasculino);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setBounds(225, 186, 106, 23);
		panel_11.add(rdbtnFemenino);
		
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(rdbtnFemenino);
		grupo1.add(rdbtnMasculino);
		
		JButton btnNewButton = new JButton("Verify");
		btnNewButton.setBounds(285, 131, 46, 23);
		panel_11.add(btnNewButton);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 128, 128));
		panel_2.add(panel_4);
		panel_4.setPreferredSize(new Dimension(240, 260));
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 128, 128));
		panel_4.add(panel_8, BorderLayout.NORTH);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_1 = new JLabel("    Perfil de Usuario");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1.setBackground(new Color(128, 255, 255));
		panel_8.add(lblNewLabel_1_1);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(255, 128, 128));
		panel_4.add(panel_12, BorderLayout.CENTER);
		panel_12.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Sebas\\Documents\\Eclipse workspace\\main_ejemplo\\src\\main_ejemplo\\th.jpg"));
		lblNewLabel_3.setBounds(24, 11, 193, 159);
		panel_12.add(lblNewLabel_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar foto de perfil");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBackground(new Color(255, 128, 128));
		chckbxNewCheckBox.setBounds(52, 182, 144, 23);
		panel_12.add(chckbxNewCheckBox);
		
		JCheckBox chckbxMostrarFechaDe = new JCheckBox("Mostrar fecha de Nacimiento");
		chckbxMostrarFechaDe.setSelected(true);
		chckbxMostrarFechaDe.setBackground(new Color(255, 128, 128));
		chckbxMostrarFechaDe.setBounds(52, 214, 182, 23);
		panel_12.add(chckbxMostrarFechaDe);
		
		
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 51, 51));
		panel_2.add(panel_5);
		panel_5.setPreferredSize(new Dimension(430, 140));
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 51, 51));
		panel_5.add(panel_9, BorderLayout.NORTH);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_2 = new JLabel("    Datos opcionales");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2.setBackground(new Color(255, 51, 51));
		panel_9.add(lblNewLabel_1_2);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(255, 51, 51));
		panel_5.add(panel_13, BorderLayout.CENTER);
		panel_13.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(54, 27, 127, 86);
		panel_13.add(scrollPane);
		
		JTextArea txtrHolaAmigosDe = new JTextArea();
		txtrHolaAmigosDe.setFont(new Font("Monospaced", Font.PLAIN, 16));
		scrollPane.setViewportView(txtrHolaAmigosDe);
		txtrHolaAmigosDe.setLineWrap(true);
		txtrHolaAmigosDe.setText("Hola amigos de youtube gracias por compartir mis videos");
		
		JLabel lblNewLabel_4 = new JLabel("Descripción");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(26, 2, 90, 24);
		panel_13.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Preferencias");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4_1.setBounds(236, 2, 90, 24);
		panel_13.add(lblNewLabel_4_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(288, 76, 73, -50);
		panel_13.add(scrollPane_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(236, 27, 125, 86);
		panel_13.add(scrollPane_2);
		
		JTextArea txtrCantar = new JTextArea();
		txtrCantar.setLineWrap(true);
		txtrCantar.setText("Cantar\r\nEscuchar musica\r\nLeer\r\nDeportes\r\nOtros\r\n");
		scrollPane_2.setViewportView(txtrCantar);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(128, 255, 255));
		panel_2.add(panel_6);
		panel_6.setPreferredSize(new Dimension(240,140));
		panel_6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_1 = new JButton("Nuevo");
		btnNewButton_1.setPreferredSize(new Dimension(150,30));
		panel_6.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Guardar");
		btnNewButton_1_1.setPreferredSize(new Dimension(150,30));
		panel_6.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Salir");
		btnNewButton_1_2.setPreferredSize(new Dimension(150,30));
		panel_6.add(btnNewButton_1_2);
		
	}
}
