package main_ejemplo;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JLabel;

public class VentanaTicTacToe {
	boolean flag = false;
	int[][] matriz = new int[3][3];
	int cont = 0;
	
	
	JButton btnNewButton_1;
	JButton btnNewButton_2;
	JButton btnNewButton_3;
	JButton btnNewButton_4;
	JButton btnNewButton_5;
	JButton btnNewButton_6;
	JButton btnNewButton_7;
	JButton btnNewButton;
	JButton btnNewButton_8;
	JButton btnNewButton_9;
	private JFrame frame;
	private JPanel reiniciar;
	int contX = 0;
	int contO = 0;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel espacio;
	private JLabel lblNewLabel_1;
	private JLabel lblContX;
	private JLabel lblContO;
	
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
		frame.setBounds(660, 220, 586, 656);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());
		
		
		JPanel grid = new JPanel();
		grid.setLayout(new GridLayout(3,3,0,0));
		frame.getContentPane().add(grid, BorderLayout.CENTER);
		
		
		btnNewButton_1 = new JButton(""); 
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				verifyClick(btn);
				
			}
		});
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				verifyClick(btn);
			}
		});
		grid.add(btnNewButton);
		grid.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				verifyClick(btn);
			}
		});
		grid.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				verifyClick(btn);
			}
		});
		grid.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				verifyClick(btn);
			}
		});
		grid.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				verifyClick(btn);
			}
		});
		grid.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				verifyClick(btn);
			}
		});
		grid.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				verifyClick(btn);
			}
		});
		grid.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				verifyClick(btn);
			}
		});
		grid.add(btnNewButton_8);
		
		reiniciar = new JPanel();
		frame.getContentPane().add(reiniciar, BorderLayout.SOUTH);
		reiniciar.setLayout(new BorderLayout(0, 0));
		
		btnNewButton_9 = new JButton("Reiniciar");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarText();
			}
		});
		btnNewButton_9.setEnabled(false);
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnNewButton_9.setPreferredSize(new Dimension(btnNewButton_9.getWidth(),40));
		reiniciar.add(btnNewButton_9);
		
		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNewLabel = new JLabel("X: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 39));
		panel.add(lblNewLabel);
		
		lblContX = new JLabel("0");
		lblContX.setFont(new Font("Tahoma", Font.PLAIN, 39));
		panel.add(lblContX);
		
		espacio = new JLabel("                   ");
		espacio.setFont(new Font("Tahoma", Font.PLAIN, 39));
		panel.add(espacio);
		
		lblNewLabel_1 = new JLabel("O: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 39));
		panel.add(lblNewLabel_1);
		
		lblContO = new JLabel("0");
		lblContO.setFont(new Font("Tahoma", Font.PLAIN, 39));
		panel.add(lblContO);
	}
	
	public void verifyClick(JButton btn) {
		if(flag == false) {
			btn.setFont(new Font("Arial", Font.BOLD, 33));
			btn.setText("X");
			if(cont>0) {
				verifyWinner(btn);
			}
			cont++;
			flag = true;
		}
		else {
			btn.setFont(new Font("Arial", Font.BOLD, 33));
			btn.setText("O");
			if(cont>2) {
				verifyWinner(btn);
			}
			cont++;
			flag = false;
		}
	}
	
	public void verifyWinner(JButton btn) {
		//Para boton 0
		if(btnNewButton.getText().equals(btnNewButton_1.getText()) && btnNewButton.getText().equals(btnNewButton_2.getText()) && btnNewButton.getText().isEmpty() == false) {
			hazGanado(btn);
			
		}
		if(btnNewButton_3.getText().equals(btnNewButton_4.getText()) && btnNewButton_3.getText().equals(btnNewButton_5.getText()) && btnNewButton_3.getText().isEmpty() == false) {
			hazGanado(btn);
			
		}
		if(btnNewButton_6.getText().equals(btnNewButton_7.getText()) && btnNewButton_6.getText().equals(btnNewButton_8.getText()) && btnNewButton_6.getText().isEmpty() == false) {
			hazGanado(btn);
			
		}
		
		if(btnNewButton.getText().equals(btnNewButton_3.getText()) && btnNewButton.getText().equals(btnNewButton_6.getText()) && btnNewButton.getText().isEmpty() == false) {
			hazGanado(btn);
			
		}
		
		if(btnNewButton_1.getText().equals(btnNewButton_4.getText()) && btnNewButton_1.getText().equals(btnNewButton_7.getText()) && btnNewButton_1.getText().isEmpty() == false) {
			hazGanado(btn);
			
		}
		if(btnNewButton_2.getText().equals(btnNewButton_5.getText()) && btnNewButton_2.getText().equals(btnNewButton_8.getText()) && btnNewButton_2.getText().isEmpty() == false) {
			hazGanado(btn);
			
		}
		
		if(btnNewButton.getText().equals(btnNewButton_4.getText()) && btnNewButton.getText().equals(btnNewButton_8.getText()) && btnNewButton.getText().isEmpty() == false) {
			hazGanado(btn);
			
		}
		
		if(btnNewButton_2.getText().equals(btnNewButton_4.getText()) && btnNewButton_2.getText().equals(btnNewButton_6.getText()) && btnNewButton_2.getText().isEmpty() == false) {
			hazGanado(btn);
			
		}
	
	}
	
	public void borrarText() {
		btnNewButton_1.setText("");
		btnNewButton_2.setText("");
		btnNewButton_3.setText("");
		btnNewButton_4.setText("");
		btnNewButton_5.setText("");
		btnNewButton_6.setText("");
		btnNewButton_7.setText("");
		btnNewButton.setText("");
		btnNewButton_8.setText("");
	}
	
	public void hazGanado(JButton btn) {
		JOptionPane.showMessageDialog(null, "Haz ganado");
		if(btn.getText() == "X") {
			contX++;
			lblContX.setText(String.valueOf(contX));
		}
		else {
			contO++;
			lblContO.setText(String.valueOf(contO));
		}
		
		btnNewButton_9.setEnabled(true);
	}
	
}
