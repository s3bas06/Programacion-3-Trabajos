package Program;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Register {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 605, 719);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Iniciar sesión");
		lblNewLabel.setBounds(190, 69, 191, 40);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 33));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresa tu nombre");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setBounds(99, 156, 129, 23);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ingresa tu apellido");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_1.setBounds(351, 156, 129, 23);
		panel.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBounds(99, 177, 175, 40);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(305, 177, 175, 40);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Correo electrónico");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2.setBackground(Color.BLACK);
		lblNewLabel_1_2.setBounds(134, 239, 140, 23);
		panel.add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(144, 260, 271, 40);
		panel.add(textField_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Contraseña");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2_1.setBackground(Color.BLACK);
		lblNewLabel_1_2_1.setBounds(137, 311, 94, 23);
		panel.add(lblNewLabel_1_2_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(144, 334, 271, 40);
		panel.add(passwordField);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Confirmar contraseña");
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_2_1_1.setBounds(136, 383, 152, 23);
		panel.add(lblNewLabel_1_2_1_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(144, 408, 271, 40);
		panel.add(passwordField_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto los términos y condiciones, vendo mi alma al diablo");
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBackground(new Color(64, 0, 128));
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxNewCheckBox.setBounds(87, 475, 385, 23);
		panel.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] password1 = passwordField.getPassword();
				char[] password2 = passwordField_1.getPassword();
				Boolean flag = true;
				
				if(password1.length != password2.length) {
					flag = false;
				}
				else {
					for(int i = 0; i<password1.length; i++) {
						System.out.println(password1[i]);
						if(password1[i] != password2[i]) {
							flag = false;
							break;
						}
					}
				}
				
				if(password1.length == 0) {
					flag = false;
				}
				
				if(password2.length == 0) {
					flag = false;
				}
				
				if(flag) {
					JOptionPane.showMessageDialog(null, "Excelente, todo está correcto", "Success",JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Error",JOptionPane.ERROR_MESSAGE);
				}
				
				
				
				
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(197, 515, 173, 30);
		panel.add(btnNewButton);
	}
}
