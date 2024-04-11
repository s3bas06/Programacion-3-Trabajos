package Program;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frmPrograma;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textFieldRegister;
	private JTextField textFieldRegister_1;
	private JTextField textFieldRegister_2;
	private JPasswordField passwordFieldRegister;
	private JPasswordField passwordFieldRegister_1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmPrograma.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrograma = new JFrame();
		frmPrograma.setTitle("Programa");
		frmPrograma.setBounds(100, 100, 605, 719);
		frmPrograma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar barra = new JMenuBar();
		//Menu usuario
		JMenu menuCuenta = new JMenu("Cuenta");
		JMenuItem loginItem = new JMenuItem("Iniciar sesion");
		JMenuItem registerItem = new JMenuItem("Registrarse");
		JMenuItem recuperarItem = new JMenuItem("Recuperar cuenta");	
		
		menuCuenta.add(loginItem);
		menuCuenta.add(registerItem);
		menuCuenta.add(recuperarItem);
		//Menu cuenta
		JMenu menuUsuarios = new JMenu("Usuarios");
		JMenuItem altaItem = new JMenuItem("Alta");
		JMenuItem bajaItem = new JMenuItem("Baja");
		JMenuItem consultarItem = new JMenuItem("Consultar");
		
		menuUsuarios.add(altaItem);
		menuUsuarios.add(bajaItem);
		menuUsuarios.add(consultarItem);
		
		//Menu ayuda
		JMenu menuAyuda = new JMenu("Ayuda");
		JMenuItem crearItem = new JMenuItem("¿Cómo crear un usuario?");
		JMenuItem accederItem = new JMenuItem("¿Cómo acceder al sistema?");
		JMenuItem olvidarItem = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		
		menuAyuda.add(crearItem);
		menuAyuda.add(accederItem);
		menuAyuda.add(olvidarItem);
		
		barra.add(menuCuenta);
		barra.add(menuUsuarios);
		barra.add(menuAyuda);
		frmPrograma.setJMenuBar(barra);
		
		//this.register(frmPrograma);
		this.login(frmPrograma);
		//this.recuperarCuenta(frmPrograma);
		
		//this.cuentaAlta(frmPrograma);
		//this.cuentaBaja(frmPrograma);
		//this.cuentaConsultar(frmPrograma);
		
		//this.ayudaAcceder(frmPrograma);
		//this.ayudaCrear(frmPrograma);
		//this.ayudaRecuperar(frmPrograma);
		
		
		/* 
		 *
		 *AccionListener para los items del menuCuenta
		 * 
		 */
		
		loginItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrograma.getContentPane().removeAll();
				login(frmPrograma);
				frmPrograma.repaint();
				frmPrograma.revalidate();
				
				}
		});
		
		registerItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrograma.getContentPane().removeAll();
				register(frmPrograma);
				frmPrograma.repaint();
				frmPrograma.revalidate();
				}
		});
		
		recuperarItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrograma.getContentPane().removeAll();
				recuperarCuenta(frmPrograma);
				frmPrograma.repaint();
				frmPrograma.revalidate();
				}
		});
		
		/* 
		 *
		 *AccionListener para los items del menuUsuarios
		 * 
		 */
		altaItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrograma.getContentPane().removeAll();
				cuentaAlta(frmPrograma);
				frmPrograma.repaint();
				frmPrograma.revalidate();
				
				}
		});
		
		bajaItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrograma.getContentPane().removeAll();
				cuentaBaja(frmPrograma);
				frmPrograma.repaint();
				frmPrograma.revalidate();
				}
		});
		
		consultarItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrograma.getContentPane().removeAll();
				cuentaConsultar(frmPrograma);
				frmPrograma.repaint();
				frmPrograma.revalidate();
				}
		});
		
		/* 
		 *
		 *AccionListener para los items del menuAyuda
		 * 
		 */
		crearItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrograma.getContentPane().removeAll();
				ayudaCrear(frmPrograma);
				frmPrograma.repaint();
				frmPrograma.revalidate();
				
				}
		});
		
		accederItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrograma.getContentPane().removeAll();
				ayudaAcceder(frmPrograma);
				frmPrograma.repaint();
				frmPrograma.revalidate();
				}
		});
		
		olvidarItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrograma.getContentPane().removeAll();
				ayudaRecuperar(frmPrograma);
				frmPrograma.repaint();
				frmPrograma.revalidate();
				}
		});
		
		
		
	}
	
	private void login(JFrame frmPrograma) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(83, 83, 83));
		frmPrograma.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(190, 69, 202, 40);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(141, 162, 302, 40);
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(141, 133, 302, 30);
		panel.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresa nombre de usuario");
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.BLACK);
		panel_1_1.setBounds(141, 234, 302, 30);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ingrese su contraseña");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBackground(Color.BLACK);
		panel_1_1.add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordField.setBounds(141, 263, 302, 40);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Acceder");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Imposible acceder", "Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(141, 337, 302, 40);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1_2 = new JLabel("¿Olvidó su contraseña?");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBackground(Color.BLACK);
		lblNewLabel_1_2.setBounds(141, 395, 164, 17);
		panel.add(lblNewLabel_1_2);
		
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				frmPrograma.getContentPane().removeAll();
				recuperarCuenta(frmPrograma);
				frmPrograma.repaint();
				frmPrograma.revalidate();
			}
			
		});
		
		JButton btnNewButton_1 = new JButton("¿Aun no tienes cuenta? Registrate aquí");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrograma.remove(panel);
				register(frmPrograma);
				frmPrograma.repaint();
				frmPrograma.revalidate();
				
			}
		});
		btnNewButton_1.setBounds(165, 434, 250, 23);
		panel.add(btnNewButton_1);
	}
	
	private void register(JFrame frmPrograma) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		frmPrograma.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Crea tu cuenta");
		lblNewLabel.setBounds(170, 66, 252, 40);
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
		
		textFieldRegister = new JTextField();
		textFieldRegister.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldRegister.setColumns(10);
		textFieldRegister.setBounds(99, 177, 175, 40);
		panel.add(textFieldRegister);
		
		textFieldRegister_1 = new JTextField();
		textFieldRegister_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldRegister_1.setColumns(10);
		textFieldRegister_1.setBounds(305, 177, 175, 40);
		panel.add(textFieldRegister_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Correo electrónico");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2.setBackground(Color.BLACK);
		lblNewLabel_1_2.setBounds(134, 239, 140, 23);
		panel.add(lblNewLabel_1_2);
		
		textFieldRegister_2 = new JTextField();
		textFieldRegister_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldRegister_2.setColumns(10);
		textFieldRegister_2.setBounds(144, 260, 271, 40);
		panel.add(textFieldRegister_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Contraseña");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2_1.setBackground(Color.BLACK);
		lblNewLabel_1_2_1.setBounds(137, 311, 94, 23);
		panel.add(lblNewLabel_1_2_1);
		
		passwordFieldRegister = new JPasswordField();
		passwordFieldRegister.setBounds(144, 334, 271, 40);
		panel.add(passwordFieldRegister);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Confirmar contraseña");
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_2_1_1.setBounds(136, 383, 152, 23);
		panel.add(lblNewLabel_1_2_1_1);
		
		passwordFieldRegister_1 = new JPasswordField();
		passwordFieldRegister_1.setBounds(144, 408, 271, 40);
		panel.add(passwordFieldRegister_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto los términos y condiciones, vendo mi alma al diablo");
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBackground(new Color(64, 0, 128));
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxNewCheckBox.setBounds(87, 475, 385, 23);
		panel.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] password1 = passwordFieldRegister.getPassword();
				char[] password2 = passwordFieldRegister_1.getPassword();
				Boolean flag = true;
				Boolean flagNotEmpty = true;
				
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
					flagNotEmpty = false;
				}
				
				if(password2.length == 0) {
					flagNotEmpty = false;
				}
				
				if(flagNotEmpty) {
					if(flag) {
						JOptionPane.showMessageDialog(null, "Excelente, todo está correcto", "Success",JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Error",JOptionPane.ERROR_MESSAGE);
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "El espacio para la contraseña no tiene datos", "Error",JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(197, 515, 173, 30);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("¿Ya tienes cuenta? Inicia sesión aquí");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrograma.remove(panel);
				login(frmPrograma);
				frmPrograma.repaint();
				frmPrograma.revalidate();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.setBounds(156, 583, 250, 23);
		panel.add(btnNewButton_1);
	}
	
	private void recuperarCuenta(JFrame frmPrograma) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 255));
		frmPrograma.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Recuperar cuenta");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(141, 69, 302, 40);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(141, 162, 302, 40);
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 255));
		panel_1.setBounds(141, 133, 302, 30);
		panel.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresa el correo asociado a la cuenta");
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		
		JButton btnNewButton = new JButton("Recuperar cuenta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Ingrese un correo electrónico", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "Success", "Válido", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(141, 247, 302, 52);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1_2 = new JLabel("Utilizar otro método");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBackground(Color.BLACK);
		lblNewLabel_1_2.setBounds(205, 368, 164, 17);
		panel.add(lblNewLabel_1_2);
		
		JButton btnNewButton_1 = new JButton("Olvidalo, ya recordé mi contraseña");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrograma.remove(panel);
				login(frmPrograma);
				frmPrograma.repaint();
				frmPrograma.revalidate();
				
			}
		});
		btnNewButton_1.setBounds(197, 318, 195, 23);
		panel.add(btnNewButton_1);
	}
	
	private void cuentaAlta(JFrame frmPrograma) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 255));
		frmPrograma.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dar cuenta de alta");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(141, 69, 302, 40);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Regresar a inicio de sesión");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrograma.remove(panel);
				login(frmPrograma);
				frmPrograma.repaint();
				frmPrograma.revalidate();
				
			}
		});
		btnNewButton_1.setBounds(197, 318, 195, 23);
		panel.add(btnNewButton_1);
	}
	
	private void cuentaBaja(JFrame frmPrograma) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 255, 128));
		frmPrograma.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dar cuenta de baja");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(141, 69, 302, 40);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Regresar a inicio de sesión");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrograma.remove(panel);
				login(frmPrograma);
				frmPrograma.repaint();
				frmPrograma.revalidate();
				
			}
		});
		btnNewButton_1.setBounds(197, 318, 195, 23);
		panel.add(btnNewButton_1);
	}

	private void cuentaConsultar(JFrame frmPrograma) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 255));
		frmPrograma.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consultar cuenta");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(141, 69, 302, 40);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Regresar a inicio de sesión");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrograma.remove(panel);
				login(frmPrograma);
				frmPrograma.repaint();
				frmPrograma.revalidate();
				
			}
		});
		btnNewButton_1.setBounds(197, 318, 195, 23);
		panel.add(btnNewButton_1);
	}
	
	private void ayudaCrear(JFrame frmPrograma) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 192));
		frmPrograma.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¿Cómo crear un usuario?");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(105, 69, 386, 40);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Regresar a inicio de sesión");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrograma.remove(panel);
				login(frmPrograma);
				frmPrograma.repaint();
				frmPrograma.revalidate();
				
			}
		});
		btnNewButton_1.setBounds(197, 318, 195, 23);
		panel.add(btnNewButton_1);
	}
	
	private void ayudaAcceder(JFrame frmPrograma) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 0));
		frmPrograma.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¿Cómo acceder al sistema?");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(78, 69, 438, 40);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Regresar a inicio de sesión");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrograma.remove(panel);
				login(frmPrograma);
				frmPrograma.repaint();
				frmPrograma.revalidate();
				
			}
		});
		btnNewButton_1.setBounds(197, 318, 195, 23);
		panel.add(btnNewButton_1);
	}
	
	private void ayudaRecuperar(JFrame frmPrograma) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		frmPrograma.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¿Qué pasa si olvidé mi contraseña?");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 68, 569, 40);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Regresar a inicio de sesión");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrograma.remove(panel);
				login(frmPrograma);
				frmPrograma.repaint();
				frmPrograma.revalidate();
				
			}
		});
		btnNewButton_1.setBounds(197, 318, 195, 23);
		panel.add(btnNewButton_1);
	}
}



