package Program;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.TimerTask;
import java.awt.FlowLayout;
import javax.swing.JLabel;

public class TableroDibujo{
	
	public int x = 0,y=20;
	public int dir=0;
	int seconds=0;
	int minutes=0;
	public Timer cronometro;
	public JLabel lblNewLabel_1;
	private player p1 = new player(x,y,20,20, "#EC3832");
	private int grosor = 15;
	private player obstaculos[] = {
			
			//Marcos
			new player(30,50,grosor,1000,"#000000"),
			new player(30,725,1220,grosor,"#000000"),
			new player(1235,0,grosor,695,"#000000"),
			new player(30,0,1220,grosor,"#000000"),
			
			//Interior
			//Primera parte del laberitno naranja
			new player(100,0,grosor,130,"#000000"),
			new player(100,175,92,grosor,"#000000"),
			new player(180,120,grosor,160,"#000000"),
			new player(30,265,110,grosor,"#000000"),
			new player(30,220,100,grosor,"#000000"),
			new player(180,120,230,grosor,"#000000"),
			//Segunda parte del laberinto (meta) azul
			new player(300,70,grosor,60,"#000000"),
			new player(180,70,120,grosor,"#000000"),
			new player(350,0, grosor,85,"#000000"),
			new player(400,50,grosor,160,"#000000"),
			new player(400,200,150,grosor,"#000000"),
			//Tercera parte del laberinto cafe
			new player(450,0,grosor,160,"#000000"),
			new player(550,200,grosor,60,"#000000"),
			new player(550,245,85,grosor,"#000000"),
			new player(620,200,grosor,45,"#000000"),
			new player(620,200,60,grosor,"#000000"),
			new player(665,100,grosor,215,"#000000"), //Modificar al rato
			new player(510,100,160,grosor,"#000000"),
			new player(510,100,grosor,60,"#000000"),
			new player(510,150,120,grosor,"#000000"),
			new player(550,50,grosor,60,"#000000"),
			//Cuarta parte del laberinto
			new player(600,50,130,grosor,"#000000"),
			new player(715,50,grosor,80,"#000000"),
			new player(715,180,grosor,90,"#000000"),
			new player(715,120,60,grosor,"#000000"),
			new player(775,120,grosor,50,"#000000"),
			new player(775,160,150,grosor,"#000000"),
			new player(715,220,70,grosor,"#000000"),
			new player(775,170,grosor,200,"#000000"),
			new player(720,370,70,grosor,"#000000"),
			new player(715,300,grosor,85,"#000000"),
			new player(675,300,50,grosor,"#000000"),
			new player(715,80,110,grosor,"#000000"),
			new player(820,80,grosor,50,"#000000"),
			new player(760,0,grosor,55,"#000000"),
			new player(760,40,110,grosor,"#000000"),
			new player(860,40,grosor,90,"#000000"),
			new player(910,60,grosor,250,"#000000"),
			//Quinta parte del laberinto.
			new player(955,0,grosor,180,"#000000"),
			new player(910,210,115,grosor,"#000000"),
			new player(1010,180,grosor,40,"#000000"),
			new player(1010,180,60,grosor,"#000000"),
			new player(1055,120,grosor,70,"#000000"),
			new player(955,125,60,grosor,"#000000"),
			new player(1005,60,grosor,80,"#000000"),
			new player(1005,60,110,grosor,"#000000"),
			new player(1105,60,grosor,80,"#000000"),
			new player(1105,125,80,grosor,"#000000"),
			new player(1070,170,70,grosor,"#000000"),
			new player(1170,0,grosor,85,"#000000"),
			new player(1070,220,170,grosor,"#000000"),
			new player(1070,220,grosor,50,"#000000"),
			new player(970,255,100,grosor,"#000000"),
			new player(1050,255,grosor,100,"#000000"),
			new player(910,300,90,grosor,"#000000"),
			new player(910,350,155,grosor,"#000000"),
			new player(910,350,grosor,50,"#000000"),
			new player(910,390,80,grosor,"#000000"),
			new player(910,350,grosor,50,"#000000"),
			new player(980,390,grosor,100,"#000000"),
			new player(980,480,70,grosor,"#000000"),
			new player(1040,480,grosor,120,"#000000"),
			new player(760,540,230,grosor,"#000000"),
			new player(845,210,grosor,290,"#000000"),
			new player(845,440,70,grosor,"#000000"),
			new player(910,440,grosor,110,"#000000"),
			new player(820,590,235,grosor,"#000000"),
			new player(760,540,grosor,100,"#000000"),
			new player(760,635,430,grosor,"#000000"),
			
			new player(1050,300,120,grosor,"#000000"),
			new player(1140,260,100,grosor,"#000000"),
			new player(1160,300,grosor,80,"#000000"),
			new player(1050,430,200,grosor,"#000000"),
			new player(1050,400,grosor,30,"#000000"),
			new player(1050,390,60,grosor,"#000000"),
			new player(1110,350,grosor,55,"#000000"),
			new player(1040,590,100,grosor,"#000000"),
			new player(1130,490,grosor,115,"#000000"),
			new player(1090,490,50,grosor,"#000000"),
			new player(1085,490,grosor,70,"#000000"),
			new player(1180,490,grosor,160,"#000000"),
			new player(1000,680,240,grosor,"#000000"),
			new player(1000,640,grosor,40,"#000000"),
			new player(940,680,grosor,60,"#000000"),
			new player(775,380,grosor,120,"#000000"),
			new player(715,485,75,grosor,"#000000"),
			new player(715,425,grosor,60,"#000000"),
			new player(655,425,60,grosor,"#000000"),
			new player(655,360,grosor,80,"#000000"),
			new player(605,360,50,grosor,"#000000"),
			new player(605,300,grosor,60,"#000000"),
			new player(550,300,55,grosor,"#000000"),
			new player(500,200,grosor,300,"#000000"),
			new player(550,350,grosor,300,"#000000"),
			new player(550,410,60,grosor,"#000000"),
			new player(600,410,grosor,80,"#000000"),
			new player(600,490,70,grosor,"#000000"),
			new player(600,540,70,grosor,"#000000"),
			new player(600,540,grosor,110,"#000000"),
			new player(660,540,grosor,60,"#000000"),
			new player(640,590,35,grosor,"#000000"),
			new player(550,635,210,grosor,"#000000"),
			new player(710,570,50,grosor,"#000000"),
			new player(460,450,40,grosor,"#000000"),
			new player(460,370,grosor,245,"#000000"),
			new player(500,530,grosor,200,"#000000"),
			new player(550,680,200,grosor,"#000000"),
			new player(590,640,grosor,40,"#000000"),
			new player(830,640,grosor,50,"#000000"),
			new player(870,680,70,grosor,"#000000"),
			new player(130,265,grosor,80,"#000000"),
			new player(80,335,100,grosor,"#000000"),
			new player(80,300,grosor,390,"#000000"),
			
			new player(130,385,grosor,80,"#000000"),
			new player(130,385,175,grosor,"#000000"),
			new player(240,170,grosor,170,"#000000"),
			new player(290,220,grosor,180,"#000000"),
			new player(240,170,160,grosor,"#000000"),
			new player(290,220,70,grosor,"#000000"),
			new player(345,220,grosor,200,"#000000"),
			new player(400,210,grosor,70,"#000000"),
			new player(345,420,70,grosor,"#000000"),
			new player(400,320,grosor,160,"#000000"),
			new player(400,480,70,grosor,"#000000"),
			new player(450,200,grosor,160,"#000000"),
			new player(130,465,100,grosor,"#000000"),
			new player(130,510,180,grosor,"#000000"),
			new player(130,510,grosor,500,"#000000"),
			new player(295,440,grosor,120,"#000000"),
			new player(250,600,220,grosor,"#000000"),
			new player(250,570,grosor,70,"#000000"),
			new player(230,435,grosor,45,"#000000"),
			new player(185,570,65,grosor,"#000000"),
			new player(185,570,grosor,120,"#000000"),
			new player(185,675,140,grosor,"#000000"),
			new player(345,500,grosor,100,"#000000"),
			new player(345,530,70,grosor,"#000000"),
			new player(400,530,grosor,40,"#000000"),
			new player(380,660,grosor,70,"#000000"),
			new player(430,600,grosor,80,"#000000"),
			new player(1250, 690, 30, 40,"#FF0800")
	};
	
	
	
	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableroDibujo window = new TableroDibujo();
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
	public TableroDibujo() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1295, 889);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tableroGraphics panel = new tableroGraphics();
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 128));
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seconds=0;
				minutes=0;
				lblNewLabel_1.setText("Tiempo: 00:00");
				p1.setX(0);
				p1.setY(20);
				dir=0;
				frame.requestFocus();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setPreferredSize(new Dimension(140, 40));
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 128));
		panel_2.setPreferredSize(new Dimension(frame.getWidth(),60));
		frame.getContentPane().add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("THE MAZE RUNNER");
		lblNewLabel.setBounds(451, 5, 393, 49);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel_2.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Tiempo: 00:00");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(992, 12, 242, 42);
		panel_2.add(lblNewLabel_1);
		
		frame.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				
				System.out.println(e.getKeyCode());
				
					switch(e.getKeyCode()) {
					case 87: 
						dir=1;
					break;

					case 65: 
						dir=2;
					break;
					
					case 83: 
						dir=3;
					break;
					
					case 68:
						dir=4;
					break;
					
					}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
		cronometro = new Timer(1000,new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				seconds++;
				
				if(seconds == 60) {
					seconds = 0;
					minutes++;
				}
				if(minutes>=10) {
					if(seconds>=10) {
						lblNewLabel_1.setText("Tiempo: " + minutes + ":" + seconds);
					}
					else {
						lblNewLabel_1.setText("Tiempo: " + minutes + ":" + seconds);
					}
				}
				else {
					if(seconds>=10) {
						lblNewLabel_1.setText("Tiempo: " + "0" + minutes + ":" + seconds);
					}
					else {
						lblNewLabel_1.setText("Tiempo: " + "0" + minutes + ":" + "0" + seconds);
					}
			}
			}
		});
		
		cronometro.start();
		
		Timer timer1 = new Timer(1, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(p1.getX() <= 1250) {
					actualizar();
					frame.repaint();
				}
				else {
					cronometro.stop();
					JOptionPane.showMessageDialog(null, "FELICIDADES, HAZ LOGRADO SALIR DEL LABERINTO. \n\n" + lblNewLabel_1.getText() , "GANADOR", JOptionPane.INFORMATION_MESSAGE);
					p1.setX(0);
					p1.setY(20);
					lblNewLabel_1.setText("Tiempo: 00:00");
					seconds=0;
					minutes=0;
					dir=0;
					cronometro.start();
				}
				
			}
			
		});
		timer1.start();

		
		
		frame.addMouseListener(new MouseListener() {

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("El valor de X es: " + e.getX());
				System.out.println("El valor de Y es: " + e.getY());
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		frame.setFocusable(true);
        frame.requestFocusInWindow();
		
	}
	
	class tableroGraphics extends JPanel{
		protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.decode("#5EAAA6"));
            g.fillRect(0,0,1600,900);
            
            g.setColor(Color.green);
            g.fillRect(0, 10, 30, 40);
           
            for(player objetos : obstaculos) {
            	g.setColor(Color.decode(objetos.getColor()));
            	g.fillRect(objetos.getX(), objetos.getY(), objetos.getWidth(), objetos.getHeight());
            }
            
            g.setColor(Color.decode(p1.getColor()));
            g.fillRect(p1.getX(),p1.getY(),p1.getWidth(), p1.getHeight());
        }
	}

	public void actualizar() {
		switch(dir) {
		case 1:
			p1.setY(p1.getY() - 3);
			if(p1.colision(obstaculos)) {
				p1.setY(p1.getY() + 3);
			}
			
		break;
		case 2:
			p1.setX(p1.getX() - 3);
			if(p1.colision(obstaculos)) {
				p1.setX(p1.getX() + 3);
			}
		break;
		case 3:
			p1.setY(p1.getY() + 3);
			if(p1.colision(obstaculos)) {
				p1.setY(p1.getY() - 3);
			}
		break;
		case 4:
			p1.setX(p1.getX() + 3);
			if(p1.colision(obstaculos)) {
				p1.setX(p1.getX() - 3);
			}
		break;
		}
	}
}
