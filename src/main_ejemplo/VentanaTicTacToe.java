package main_ejemplo;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaTicTacToe {
	boolean flag = false;
	int[][] matriz = new int[3][3];
	int cont = 0;
	
	
	JButton btnNewButton;
	JButton btnNewButton_1;
	JButton btnNewButton_2;
	JButton btnNewButton_3;
	JButton btnNewButton_4;
	JButton btnNewButton_5;
	JButton btnNewButton_6;
	JButton btnNewButton_7;
	JButton btnNewButton_8;
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaTicTacToe window = new VentanaTicTacToe();
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
	public VentanaTicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 586, 656);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(3,3,0,0));
		
		btnNewButton = new JButton(""); 
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				verifyClick(btn);
				
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				verifyClick(btn);
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				verifyClick(btn);
			}
		});
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				verifyClick(btn);
			}
		});
		frame.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				verifyClick(btn);
			}
		});
		frame.getContentPane().add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				verifyClick(btn);
			}
		});
		frame.getContentPane().add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				verifyClick(btn);
			}
		});
		frame.getContentPane().add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				verifyClick(btn);
			}
		});
		frame.getContentPane().add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				verifyClick(btn);
			}
		});
		frame.getContentPane().add(btnNewButton_8);
	}
	
	public void verifyClick(JButton btn) {
		if(flag == false) {
			btn.setFont(new Font("Arial", Font.BOLD, 33));
			btn.setText("X");
			if(cont>2) {
				verifyWinner();
			}
			cont++;
			flag = true;
		}
		else {
			btn.setFont(new Font("Arial", Font.BOLD, 33));
			btn.setText("O");
			if(cont>2) {
				verifyWinner();
			}
			cont++;
			flag = false;
		}
	}
	
	public void verifyWinner() {
		//Para boton 0
		if(btnNewButton.getText().equals(btnNewButton_1.getText()) && btnNewButton.getText().equals(btnNewButton_2.getText()) && btnNewButton.getText().isEmpty() == false) {
			JOptionPane.showMessageDialog(null, "Haz ganado");
			borrarText();
		}
		if(btnNewButton.getText().equals(btnNewButton_3.getText()) && btnNewButton.getText().equals(btnNewButton_6.getText()) && btnNewButton.getText().isEmpty() == false) {
			JOptionPane.showMessageDialog(null, "Haz ganado");
			borrarText();
		}
		if(btnNewButton.getText().equals(btnNewButton_4.getText()) && btnNewButton.getText().equals(btnNewButton_8.getText()) && btnNewButton.getText().isEmpty() == false) {
			JOptionPane.showMessageDialog(null, "Haz ganado");
			borrarText();
		}
		//Para boton 1
		if(btnNewButton_1.getText().equals(btnNewButton_4.getText()) && btnNewButton_1.getText().equals(btnNewButton_7.getText()) && btnNewButton_1.getText().isEmpty() == false) {
			JOptionPane.showMessageDialog(null, "Haz ganado");
			borrarText();
		}
		//Para boton 2
		if(btnNewButton_2.getText().equals(btnNewButton_4.getText()) && btnNewButton_2.getText().equals(btnNewButton_6.getText()) && btnNewButton_2.getText().isEmpty() == false) {
			JOptionPane.showMessageDialog(null, "Haz ganado");
			borrarText();
		}
		if(btnNewButton_2.getText().equals(btnNewButton_5.getText()) && btnNewButton_2.getText().equals(btnNewButton_8.getText()) && btnNewButton_2.getText().isEmpty() == false) {
			JOptionPane.showMessageDialog(null, "Haz ganado");
			borrarText();
		}
		//Para boton 3
		if(btnNewButton_3.getText().equals(btnNewButton_4.getText()) && btnNewButton_3.getText().equals(btnNewButton_5.getText()) && btnNewButton_3.getText().isEmpty() == false) {
			JOptionPane.showMessageDialog(null, "Haz ganado");
			borrarText();
		}
		//Para boton 6
		if(btnNewButton_6.getText().equals(btnNewButton_7.getText()) && btnNewButton_6.getText().equals(btnNewButton_8.getText()) && btnNewButton_6.getText().isEmpty() == false) {
			JOptionPane.showMessageDialog(null, "Haz ganado");
			borrarText();
		}
	
	}
	
	public void borrarText() {
		btnNewButton.setText("");
		btnNewButton_1.setText("");
		btnNewButton_2.setText("");
		btnNewButton_3.setText("");
		btnNewButton_4.setText("");
		btnNewButton_5.setText("");
		btnNewButton_6.setText("");
		btnNewButton_7.setText("");
		btnNewButton_8.setText("");
	}
	
}
