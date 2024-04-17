package Program;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TableroDibujo{


	private JFrame frame;
	public int x = 530,y=300;
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
		frame.setBounds(100, 100, 1140, 730);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tableroGraphics panel = new tableroGraphics();
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 128));
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setPreferredSize(new Dimension(140, 40));
		panel_1.add(btnNewButton);
		
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
					y -= 10;
					
				break;

				case 65: 
					x-=10;
				break;
				
				case 83: 
					y+=10;
				break;
				
				case 68: 
					x+=10;
				break;
				
				}
				frame.repaint();
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		frame.setFocusable(true);
        frame.requestFocusInWindow();
		
	}
	
	class tableroGraphics extends JPanel{
		protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.fillRect(x, y, 50, 50);
        }
	}

	
	
}
