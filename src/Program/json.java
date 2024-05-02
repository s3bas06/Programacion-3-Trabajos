package Program;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class json {

	
	
	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					json window = new json();
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
	public json() {
		//initialize();
		login();
		//bienvenido();
	}

	private void bienvenido() {
		
		JLabel lblNewLabel_2 = new JLabel("BIENVENIDO AL PROGRAMA");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		frame.getContentPane().add(lblNewLabel_2);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 812, 615);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JSONParser parser = new JSONParser();
				JSONArray a = null;
				try {
					a = (JSONArray) parser.parse(new FileReader("src/jsontype.json"));
				} catch (IOException | ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				  for (Object o : a)
				  {
				    JSONObject person = (JSONObject) o;

				    String name = (String) person.get("name");
				    System.out.println(name);

				    String city = (String) person.get("city");
				    System.out.println(city);

				    String job = (String) person.get("job");
				    System.out.println(job);

				    JSONArray cars = (JSONArray) person.get("cars");

				    /*for (Object c : cars)
				    {
				      System.out.print(c+",");
				    }*/
				    
				    for (int i = 0; i < cars.size(); i++) {
				        Object c = cars.get(i);
				        System.out.print(c);
				        if (i < cars.size() - 1) {
				            System.out.print(", ");
				        } else {
				            System.out.print(".");
				        }
				    }
				    System.out.println();
				    System.out.println();
				  }
				  
			}
		});
		btnNewButton.setBounds(308, 205, 175, 107);
		frame.getContentPane().add(btnNewButton);
	}
	
	private void login() {
		frame = new JFrame();
		frame.setTitle("Programa");
		frame.setBounds(100, 100, 605, 719);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(83, 83, 83));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
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
				JSONParser parser = new JSONParser();
				JSONArray a = null;
				try {
					a = (JSONArray) parser.parse(new FileReader("src/jsontype.json"));
				} catch (IOException | ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				char[] passfield = passwordField.getPassword();
				String passwordUser = new String(passfield);
				Boolean flag = false;
				for (Object o : a){
					JSONObject person = (JSONObject) o;

				    String username = (String) person.get("user");
				    String password = (String) person.get("password");
				    if(username.equals(textField.getText()) && password.equals(passwordUser) ) {
				    	flag = true;
				    	break;
				    }
				}
				
				if(flag) {
					 
					 frame.getContentPane().removeAll();
					 bienvenido();
					 frame.repaint();
					 frame.revalidate();
				}else {
					 JOptionPane.showMessageDialog(null, "Error", "No se ha encontrado dicho usuario y contraseña, intente de nuevo.", JOptionPane.WARNING_MESSAGE);
				}
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
		
		JButton btnNewButton_1 = new JButton("¿Aun no tienes cuenta? Registrate aquí");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.setBounds(165, 434, 250, 23);
		panel.add(btnNewButton_1);
	}
}
