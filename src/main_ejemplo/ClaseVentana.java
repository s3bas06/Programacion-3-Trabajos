package main_ejemplo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClaseVentana extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public ClaseVentana() {
		
		
		this.setSize(1000,500);
		
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLocation(200,100);
				
		this.setResizable(true);
		
		this.setTitle("Mi ventana");
		
		this.setMinimumSize(new Dimension(250,250));
		
		this.setMaximumSize(new Dimension(1000,750));
		
		this.setLocationRelativeTo(null);
		
		IniciarComponentes();
		
		this.setLayout(null);

	}
	
	private void IniciarComponentes() {
		
		//Login
		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2,this.getHeight());
		login.setBackground(Color.BLUE);
		login.setLayout(null);
		
		JLabel login_tittle = new JLabel("ACCEDER",0); //El 0 es para centrar el texto dentro del JLabel.
		login_tittle.setSize(330,40);
		login_tittle.setFont(new Font("ARIAL", Font.BOLD, 40));
		login_tittle.setForeground(Color.white);
		login_tittle.setLocation(90,30); //SetBounds es una alternativa.
		login_tittle.setOpaque(true);
		login_tittle.setBackground(Color.RED);
		login.add(login_tittle);
		
		JLabel login_user = new JLabel("Nombre de usuario:");
		login_user.setBounds(40,40,200,200);
		login_user.setFont(new Font("ARIAL", Font.BOLD, 20));
		login.add(login_user);
		

		
		
		
		/*Register
		JPanel register = new JPanel();
		login.setSize(this.getWidth()/2,this.getHeight());
		register.setLocation(500,0);
		register.setBackground(Color.RED);
		register.setLayout(null);
		
		*/
		
		this.add(login);
		//this.add(register);
		
	}
}
