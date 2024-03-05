package main_ejemplo;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ClaseVentana extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public ClaseVentana() {
		setTitle("Jpanel");

		setLocationRelativeTo(null);

		//this.setSize(1000,1000); //este es para lo que no son calculadoras
		
		//this.setSize(305,430); //este es para la calculadora.
		
		this.setSize(1280,720);; //este es para el segundo login.
		
		this.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setLocation(200,100);

		this.setResizable(true);

		this.setTitle("Mi ventana");

		this.setMinimumSize(new Dimension(250,250));

		this.setMaximumSize(new Dimension(1000,1000));

		this.setLocationRelativeTo(null);

		IniciarComponentes();


		setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.setLayout(null);

	}
	
	public void IniciarComponentes() {
		JPanel panel = new JPanel();
		//this.login(panel);
		//this.register(panel);
		//this.admin();
		//this.calculadora();	
		//this.login2();
		//this.gridCalculadora();
		//this.CalcularInteres();
		
		this.paint(getGraphics());
		
		this.repaint();
		this.revalidate();
	}
	
	public void register(JPanel panel) {
		JPanel register = new JPanel();
		register.setSize(500,1000);
		register.setLocation(500,0);
		register.setBackground(Color.BLUE);
		register.setLayout(null);
		
		JLabel login_tittle = new JLabel("REGISTRO",0); //El 0 es para centrar el texto dentro del JLabel.
		login_tittle.setSize(330,40);
		login_tittle.setFont(new Font("ARIAL", Font.BOLD, 40));
		login_tittle.setForeground(Color.BLACK);
		login_tittle.setLocation(590,30); //SetBounds es una alternativa.
		login_tittle.setOpaque(true);
		login_tittle.setBackground(Color.RED);
		register.add(login_tittle);
		
		JLabel user_tittle = new JLabel("Nombre de usuario:",0);
		user_tittle.setBounds(500,80,500,30);
		user_tittle.setFont(new Font("ARIAL", Font.BOLD, 25));
		user_tittle.setForeground(Color.black);
		user_tittle.setLayout(null);
		register.add(user_tittle);
		
		JTextField user = new JTextField(0);
		user.setSize(345,40);
		user.setLocation(570,120);
		register.add(user);
		
		JLabel bioLabel = new JLabel("Bio",0);
		bioLabel.setBounds(500,80,500,200);
		bioLabel.setFont(new Font("ARIAL", Font.BOLD, 25));
		bioLabel.setForeground(Color.black);
		bioLabel.setLayout(null);
		register.add(bioLabel);
		
		JTextArea biotext = new JTextArea();
		biotext.setBounds(570,200,345,100);
		biotext.setBackground(Color.WHITE);
		register.add(biotext);
		
		JLabel preference = new JLabel("Preferencias",0);
		preference.setBounds(500,310,500,20);
		preference.setFont(new Font("ARIAL", Font.BOLD, 25));
		preference.setForeground(Color.black);
		preference.setLayout(null);
		register.add(preference);
		
		JCheckBox dulces = new JCheckBox("Dulces");
		dulces.setBounds(550,350,80,20);
		dulces.setFont(new Font("ARIAL", Font.BOLD, 15));
		register.add(dulces);	
		
		JCheckBox cafe = new JCheckBox("Cafe");
		cafe.setBounds(650,350,80,20);
		cafe.setFont(new Font("ARIAL", Font.BOLD, 15));
		register.add(cafe);
		
		JCheckBox salado = new JCheckBox("Comida salada");
		salado.setBounds(750,350,130,20);
		salado.setFont(new Font("ARIAL", Font.BOLD, 15));
		register.add(salado);
		//Agregar un borde para un checkbox:
		
		salado.setBorderPainted(true);
		salado.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		
		/////////////////////////////////////
		
		JLabel termstag = new JLabel("Terminos",0);
		termstag.setBounds(500,380,500,20);
		termstag.setFont(new Font("ARIAL", Font.BOLD, 25));
		termstag.setForeground(Color.black);
		termstag.setLayout(null);
		register.add(termstag);
		
		JRadioButton rdbtn1 = new JRadioButton("Aceptar terminos");
		rdbtn1.setBounds(600,410,130,20);
		register.add(rdbtn1);
		
		JRadioButton rdbtn2 = new JRadioButton("Rechazar terminos");
		rdbtn2.setBounds(775,410,140,20);
		register.add(rdbtn2);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtn1);
		grupo.add(rdbtn2);
		
		String colonias[] = {"Centro","Camino Real","Santa Fe","Concha", "Villas del encanto"};
		JComboBox<?> location = new JComboBox<Object>(colonias); //AQUI CAMBIE ALGO POR EL COMPILADOR 
		location.setFont(new Font("ARIAL", Font.BOLD, 18));
		location.setBounds(600,450,320,25);
		register.add(location);
		
		JButton register_button = new JButton("Registro");
		register_button.setBounds(660,500,200,50);
		register_button.setFont(new Font("ARIAL", Font.BOLD, 25));
		register.add(register_button);
		
		this.add(register);
		
	}
	
	public void login(JPanel panel) {
		JPanel login = new JPanel();
		login.setSize(500,960);
		login.setBackground(Color.GRAY);
		login.setLayout(null);

		JLabel login_tittle = new JLabel("ACCEDER",0); //El 0 es para centrar el texto dentro del JLabel.
		login_tittle.setSize(330,40);
		login_tittle.setFont(new Font("ARIAL", Font.BOLD, 40));
		login_tittle.setForeground(Color.BLACK);
		login_tittle.setLocation(90,30); //SetBounds es una alternativa.
		login_tittle.setOpaque(true);
		login_tittle.setBackground(Color.RED);
		login.add(login_tittle);

		JLabel user_tittle = new JLabel("Nombre de usuario:");
		user_tittle.setBounds(20,80,500,30);
		user_tittle.setFont(new Font("ARIAL", Font.BOLD, 25));
		user_tittle.setForeground(Color.black);
		user_tittle.setLayout(null);
		login.add(user_tittle);


		JTextField user = new JTextField();
		user.setSize(300,40);
		user.setLocation(20,120);
		login.add(user);	

		JLabel password_tittle = new JLabel("Contraseña:");
		password_tittle.setBounds(20,170,500,30);
		password_tittle.setFont(new Font("ARIAL", Font.BOLD, 25));
		password_tittle.setForeground(Color.black);
		password_tittle.setLayout(null);
		login.add(password_tittle);

		this.getContentPane().add(panel);
		JPasswordField password = new JPasswordField();
		password.setSize(300,40);
		password.setLocation(20,210);
		login.add(password);

		JCheckBox recordarme = new JCheckBox();
		recordarme.setSize(120,15);
		recordarme.setText("Recordarme");
		recordarme.setFont(new Font("ARIAL",Font.BOLD,14));
		recordarme.setForeground(Color.black);
		recordarme.setBackground(Color.GRAY);
		recordarme.setLocation(20,260);
		login.add(recordarme);		

		JLabel olvidaste = new JLabel("¿Olvidó su contraseña?");
		olvidaste.setBounds(150,260,500,15);
		olvidaste.setFont(new Font("ARIAL", Font.BOLD, 14));
		olvidaste.setForeground(Color.black);
		olvidaste.setLayout(null);
		login.add(olvidaste);

		JButton acceder = new JButton();
		acceder.setBounds(60,300, 200, 50);
		acceder.setText("Acceder");
		acceder.setFont(new Font("ARIAL",Font.BOLD,25));
		login.add(acceder);
		
		JLabel logo = new JLabel();
		logo.setIcon(new ImageIcon(getClass().getResource("felicitaciones.png")));
		logo.setBounds(100,500,256,256);
		login.add(logo);
		
		this.add(login);
	}
	
	public void admin() {
		JPanel panel_admin = new JPanel();
		panel_admin.setBounds(0, 0, 1000, 1000);
		panel_admin.setBackground(Color.decode("#EAAA9D"));
		panel_admin.setLayout(null);
		
		JMenuBar barra = new JMenuBar();
		JMenu menu_file = new JMenu("Archivo");
		JMenuItem open_item = new JMenuItem("Abrir archivo...");
		JMenuItem create_item = new JMenuItem("Crear archivo");
		
		this.setJMenuBar(barra); //usar JMenuBar, ya que nuestra barra es una JMenuBar y no un MenuBar
		barra.add(menu_file);
		menu_file.add(open_item);
		menu_file.add(create_item);
		
		JLabel users_tittle = new JLabel("USUARIOS",0); //El 0 es para centrar el texto dentro del JLabel.
		users_tittle.setSize(330,40);
		users_tittle.setFont(new Font("ARIAL", Font.BOLD, 40));
		users_tittle.setForeground(Color.WHITE);
		users_tittle.setLocation(335,30); //SetBounds es una alternativa.
		users_tittle.setOpaque(true);
		users_tittle.setBackground(Color.BLACK);
		panel_admin.add(users_tittle);
		
		JLabel widget_tittle = new JLabel("Total de usuarios",0);
		widget_tittle.setBounds(40,120,300,30);
		widget_tittle.setOpaque(true);
		widget_tittle.setFont(new Font("ARIAL",Font.BOLD,17));
		widget_tittle.setForeground(Color.WHITE);
		widget_tittle.setBackground(Color.BLACK);
		panel_admin.add(widget_tittle);
		
		JLabel widget_content = new JLabel("100",0);
		widget_content.setBounds(40,155,300,30);
		widget_content.setFont(new Font("ARIAL",Font.BOLD,25));
		widget_content.setOpaque(true);
		widget_content.setForeground(Color.WHITE);
		widget_content.setBackground(Color.BLACK);
		panel_admin.add(widget_content);
		
		
		JLabel widget = new JLabel("");
		widget.setBounds(40,120,300,70);
		widget.setOpaque(true);
		widget.setForeground(Color.WHITE);
		widget.setBackground(Color.BLACK);
		panel_admin.add(widget);
			
		
		JButton download = new JButton("Exportar");
		download.setBounds(730,190,100,30);
		panel_admin.add(download);
		
		JButton add_user = new JButton("Añadir");
		add_user.setBounds(840,190,100,30);
		panel_admin.add(add_user);
		
		String titles[] = {"No. Control", "Nombre","Apellidos", "Semestre", "Promedio"};
		String table_data[][] = {{"No. Control", "Nombre","Apellidos", "Semestre", "Promedio"},
				{"No. Control", "Nombre","Apellidos", "Semestre", "Promedio"},
				{"No. Control", "Nombre","Apellidos", "Semestre", "Promedio"},
				{"No. Control", "Nombre","Apellidos", "Semestre", "Promedio"},
				{"No. Control", "Nombre","Apellidos", "Semestre", "Promedio"},
				{"No. Control", "Nombre","Apellidos", "Semestre", "Promedio"},
				{"No. Control", "Nombre","Apellidos", "Semestre", "Promedio"},
				{"No. Control", "Nombre","Apellidos", "Semestre", "Promedio"},
				{"No. Control", "Nombre","Apellidos", "Semestre", "Promedio"},
				{"No. Control", "Nombre","Apellidos", "Semestre", "Promedio"},
				{"No. Control", "Nombre","Apellidos", "Semestre", "Promedio"},
				{"No. Control", "Nombre","Apellidos", "Semestre", "Promedio"},
				{"No. Control", "Nombre","Apellidos", "Semestre", "Promedio"},
				{"No. Control", "Nombre","Apellidos", "Semestre", "Promedio"},
				};
		
		JTable table_user = new JTable(table_data,titles);
		//table_user.setBounds(40,225,900,100);
		JScrollPane scroll = new JScrollPane(table_user);
		scroll.setBounds(40,225,900,100);
		panel_admin.add(scroll);
		
		
		
		
		
		
		
		this.add(panel_admin);
	}
	
	public void calculadora() {
		
		JPanel calculadora = new JPanel();
		calculadora.setBounds(0,0,290,400);
		calculadora.setBackground(Color.BLACK);
		calculadora.setLayout(null);
		
		JTextField pantalla = new JTextField();
		pantalla.setBounds(0,0,285,25);
		calculadora.add(pantalla);
	
		JButton numero7 = new JButton("7");
		numero7.setBounds(0,105,60,60);
		calculadora.add(numero7);
		
		
		JButton numero8 = new JButton("8");
		numero8.setBounds(75,105,60,60);
		calculadora.add(numero8);

		JButton numero9 = new JButton("9");
		numero9.setBounds(150,105,60,60);
		calculadora.add(numero9);
		
		JButton numero4 = new JButton("4");
		numero4.setBounds(0,180,60,60);
		calculadora.add(numero4);
		
		JButton numero5 = new JButton("5");
		numero5.setBounds(75,180,60,60);
		calculadora.add(numero5);
		
		JButton numero6 = new JButton("6");
		numero6.setBounds(150,180,60,60);
		calculadora.add(numero6);
		
		JButton numero1 = new JButton("1");
		numero1.setBounds(0,255,60,60);
		calculadora.add(numero1);
		
		JButton numero2 = new JButton("2");
		numero2.setBounds(75,255,60,60);
		calculadora.add(numero2);
		
		JButton numero3 = new JButton("3");
		numero3.setBounds(150,255,60,60);
		calculadora.add(numero3);
		
		JButton numero0 = new JButton("0");
		numero0.setBounds(0,330,60,60);
		calculadora.add(numero0);
		
		JButton punto = new JButton(".");
		punto.setBounds(75,330,60,60);
		calculadora.add(punto);
		
		JButton igual  = new JButton("=");
		igual.setBounds(150,330,60,60);
		calculadora.add(igual);
		
		JButton division = new JButton("/");
		division.setBounds(225,105,60,60);
		calculadora.add(division);
		
		JButton multiplicacion = new JButton("*");
		multiplicacion.setBounds(225,180,60,60);
		calculadora.add(multiplicacion);
		
		JButton resta = new JButton("-");
		resta.setBounds(225,255,60,60);
		calculadora.add(resta);
		
		JButton suma = new JButton("+");
		suma.setBounds(225,330,60,60);
		calculadora.add(suma);
		
		JButton CE = new JButton("CE");
		CE.setBounds(0,30,60,60);
		calculadora.add(CE);
		
		JButton rel = new JButton("");
		rel.setBounds(75,30,210,60);
		calculadora.add(rel);
		
		
		
		this.add(calculadora);
	}

	public void login2() {
		
		
		JPanel login2 = new JPanel();
		login2.setBounds(0,0,1280,720);
		login2.setBackground(new Color(0,127,178));
		login2.setLayout(null);
		
		JPanel loginCenter = new JPanel();
		loginCenter.setBounds(213,120,854,480);
		loginCenter.setBackground(new Color(12,101,137));
		loginCenter.setLayout(null);
		login2.add(loginCenter);
		
		JLabel title = new JLabel("User Login");
		title.setBounds(545,20,300,45);
		title.setFont(new Font("Stencil Regular", Font.BOLD + Font.ITALIC, 35));
		title.setForeground(Color.WHITE);
		login2.add(title);
		
		JLabel titleCenter = new JLabel("My Account");
		titleCenter.setBounds(295,20,300,60);
		titleCenter.setFont(new Font("Stencil Regular", Font.BOLD + Font.ITALIC, 45));
		titleCenter.setForeground(new Color(236,219,45));
		loginCenter.add(titleCenter);
		
		JLabel UsernameEnter = new JLabel("Enter Your Username");
		UsernameEnter.setBounds(150,150,300,25);
		UsernameEnter.setFont(new Font("Stencil Regular", Font.BOLD,18));
		UsernameEnter.setForeground(Color.white);
		loginCenter.add(UsernameEnter);
		
		JLabel iconoUser = new JLabel();
		iconoUser.setIcon(new ImageIcon(getClass().getResource("usuario.png")));
		iconoUser.setBounds(95,190,32,32);
		loginCenter.add(iconoUser);
		
		JTextField user = new JTextField();
		user.setBounds(140,180,530,50);
		user.setFont(new Font("Stencil Regular",Font.BOLD,20));
		loginCenter.add(user);
		
		JLabel passwordEnter = new JLabel("Enter Your Password");
		passwordEnter.setBounds(150,260,300,25);
		passwordEnter.setFont(new Font("Stencil Regular", Font.BOLD,18));
		passwordEnter.setForeground(Color.white);
		loginCenter.add(passwordEnter);
		
		JLabel iconoPassword = new JLabel();
		iconoPassword.setIcon(new ImageIcon(getClass().getResource("cerrar.png")));
		iconoPassword.setBounds(95,310,32,32);
		loginCenter.add(iconoPassword);
		
		JPasswordField password = new JPasswordField();
		password.setBounds(140,300,530,50);
		password.setFont(new Font("Stencil Regular",Font.BOLD,20));
		loginCenter.add(password);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBounds(270,390,300,60);
		loginButton.setFont(new Font("Stencil Regular", Font.BOLD, 45));
		loginButton.setBackground(new Color(236,219,45));
		loginCenter.add(loginButton);
		
		JLabel account = new JLabel("Don't have an account?");
		account.setBounds(520,610,300,20);
		account.setFont(new Font("Stencil Regular", Font.BOLD,20));
		login2.add(account);
		
		JButton registerButton = new JButton("Sign up");
		registerButton.setBounds(530,650,200,60);
		registerButton.setFont(new Font("Stencil Regular", Font.BOLD, 30));
		registerButton.setBackground(new Color(236,219,45));
		login2.add(registerButton);
		
		this.add(login2);
		
	}
	
	public void gridCalculadora() {
		this.setSize(480,650);
		
		JPanel gridCalculadora = new JPanel();
		gridCalculadora.setBounds(0,0,this.getWidth(),this.getHeight());
		gridCalculadora.setBackground(new Color(246,251,195));
		gridCalculadora.setLayout(new BorderLayout());
		
		JLabel text = new JLabel("100.00",4);
		text.setOpaque(true);
		text.setBackground(Color.white);
		text.setFont(new Font("Stencil Regular", Font.BOLD + Font.ITALIC, 35));
		
		gridCalculadora.add(text, BorderLayout.NORTH);
		
		JPanel numerosCalc = new JPanel();
		numerosCalc.setBackground(Color.yellow);
		numerosCalc.setLayout(new GridLayout(4,3,10,10)); //EL 10 y 10 son el hGap y el vGap.
		gridCalculadora.add(numerosCalc, BorderLayout.CENTER);
		
		//Un for para agregar los botones de manera automatica.
		
		String btns[] = {"7","8","9","4","5","6","1","2","3","0",".","/"};
		for(int i=0; i<12; i++) {
			JButton botones = new JButton(btns[i]);
			numerosCalc.add(botones);
		}
		
		//Sector derecho, con FlowLayout
		
		JPanel eastButtons = new JPanel();
		eastButtons.setBackground(new Color(114,197,87));
		eastButtons.setLayout(new GridLayout(3,1,10,10));
		gridCalculadora.add(eastButtons, BorderLayout.EAST);
		
		String eastBtns[] = {"+","-","="};
		
		for(int i=0; i<3; i++) {
			JButton eastButton = new JButton(eastBtns[i]);
			eastButtons.add(eastButton);
		}
		
		JPanel westButtons = new JPanel();
		westButtons.setBackground(Color.DARK_GRAY);
		westButtons.setLayout(new BoxLayout(westButtons,BoxLayout.Y_AXIS));
		gridCalculadora.add(westButtons, BorderLayout.WEST); // LINE_START ES EQUIVALENTE A WEST

		String westBtns[] = {"MC","M+","*"};
		
		for(int i=0; i<3; i++) {
			JButton westButton = new JButton(westBtns[i]);
			westButtons.add(westButton);
		}
		
		
		this.add(gridCalculadora);
	}

	public void CalcularInteres() {
		this.setSize(480,500);
		
		JPanel main =  new JPanel();
		main.setBounds(0,0,this.getWidth(),this.getHeight());
		main.setBackground(new Color(253,247,202));
		main.setLayout(new BorderLayout());
		
		JLabel title = new JLabel("Interés");
		title.setBackground(Color.white);
		title.setFont(new Font("Stencil Regular", Font.BOLD + Font.ITALIC, 15));
		
		main.add(title, BorderLayout.NORTH);
		
		JPanel calc = new JPanel();
		calc.setBackground(new Color(174,248,161));
		calc.setLayout(new BorderLayout());
		
		main.add(calc, BorderLayout.CENTER);
		
		JPanel calcCenter = new JPanel();
		calcCenter.setBackground(new Color(174,248,161));
		calcCenter.setLayout(null);
		calcCenter.setOpaque(true);
		calc.add(calcCenter, BorderLayout.CENTER);
		
		JLabel intTitle = new JLabel("Calcular Interés: ");
		intTitle.setBounds(0,10,50,18);
		intTitle.setFont(new Font("Arial", Font.BOLD, 15));
		calc.add(intTitle, BorderLayout.NORTH);
		
		JLabel capText = new JLabel("Capital:");
		capText.setBounds(80,15,250,30);
		capText.setFont(new Font("Arial", Font.BOLD, 15));
		calcCenter.add(capText);
		
		JTextField capTF = new JTextField();
		capTF.setBounds(205,15,200,30);
		calcCenter.add(capTF);
		
		JLabel timeText = new JLabel("Tiempo:");
		timeText.setBounds(80,70,250,30);
		timeText.setFont(new Font("Arial", Font.BOLD, 15));
		calcCenter.add(timeText);
		
		JTextField timeTF = new JTextField();
		timeTF.setBounds(205,70,200,30);
		calcCenter.add(timeTF);
		
		JLabel tasaText = new JLabel("Tasa:");
		tasaText.setBounds(80,125,250,30);
		tasaText.setFont(new Font("Arial", Font.BOLD, 15));
		calcCenter.add(tasaText);
		
		JTextField tasaTF = new JTextField();
		tasaTF.setBounds(205,125,200,30);
		calcCenter.add(tasaTF);
		
		JButton calcular = new JButton("Calcular");
		calcular.setBounds(110,180,100,25);
		calcCenter.add(calcular);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.setBounds(260,180,100,25);
		calcCenter.add(cancelar);
		
		
		JPanel resultado = new JPanel();
		resultado.setSize(this.getWidth(), 100);
		resultado.setBackground(new Color(255,105,105));
		resultado.setLayout(new BorderLayout());
		resultado.setPreferredSize(new Dimension(this.getWidth(),130));
		main.add(resultado, BorderLayout.SOUTH);
		
		JLabel espacio = new JLabel("       ");
		espacio.setBounds(260,180,100,25);
		resultado.add(espacio, BorderLayout.NORTH);
		
		JPanel resCenter = new JPanel();
		resCenter.setLayout(new FlowLayout());
		resCenter.setBackground(new Color(255,105,105));
		resCenter.setBorder(new EmptyBorder(0,60,0,60));
		resultado.add(resCenter, BorderLayout.CENTER);
		
		JLabel interesFinal = new JLabel("Interés:         ");
		interesFinal.setFont(new Font("Arial", Font.BOLD, 15));
		resCenter.add(interesFinal);
		
		JTextField intFinalT = new JTextField();
		intFinalT.setPreferredSize(new Dimension(180,30));
		resCenter.add(intFinalT);
		
		
		JLabel monto = new JLabel("Monto:          ");
		monto.setFont(new Font("Arial", Font.BOLD, 15));
		resCenter.add(monto);
		
		JTextField montoTF = new JTextField();
		montoTF.setPreferredSize(new Dimension(180,30));
		resCenter.add(montoTF);
		
		
		
		
		
		
		this.add(main);
	}

	public void paint(Graphics g) {
		super.paint(g);
		
		//Linea
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(Color.blue); //Este setColor, la variable g representa el contexto donde podemos pintar. g2d, utiliza graficos en 2d como herramientas para pintar.
		//g2d.drawLine(30, 40,70, 100);
		g2d.fillRect(50,50,200,100); //Colocar un rectangulo lleno.
		g2d.clearRect(100,100,100,100); //Borra una zona rectangular
		g2d.drawArc(300,300,100,100,45,180);
		g2d.fillArc(400, 400, 100, 100, 45, 180);
		g2d.setColor(Color.black);
		g2d.drawLine(500,500,240,200);
		g2d.drawOval(600,80,80,100);
		g2d.fillOval(800,80,80,100);
		
		int xPoints[] = {100,250,300};
		int yPoints[] = {100,200,300};
		 
		g2d.setColor(Color.red);
		
		g2d.fillPolygon(xPoints, yPoints, 3);
		g2d.setFont(new Font("ARIAL", Font.BOLD, 30)); //Para poner una fuente y el tamano
		g2d.drawString("HOLA", 500, 600);
		
		g2d.setStroke(new BasicStroke(8));
		g2d.drawRoundRect(800,300,200,200,10,10);
		
		try {
			BufferedImage image = ImageIO.read(new File("src/main_ejemplo/usuario.png"));
			g2d.drawImage(image, 10,60,null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
