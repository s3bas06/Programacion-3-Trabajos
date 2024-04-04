package main_ejemplo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

public class numbersGame {

	private JFrame frmNumbers;
	private JPanel panelMain;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn10;
	private JButton btn11;
	private JButton btn12;
	private JButton btn13;
	private JButton btn14;
	private JButton btn15;
	private JButton btn16;
	private JButton btnReiniciar;
	private JButton btnReanudar;
	private JButton btnPausar;
	
	private int seconds = 0;
	private int minutes = 0;
	private boolean isPaused = false;
	private Timer timer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					numbersGame window = new numbersGame();
					window.frmNumbers.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public numbersGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNumbers = new JFrame();
		frmNumbers.setTitle("Puzzle Numbers");
		frmNumbers.setBounds(100, 100, 754, 672);
		frmNumbers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panelMain = new JPanel();
		panelMain.setBackground(new Color(255, 255, 128));
		frmNumbers.getContentPane().add(panelMain, BorderLayout.CENTER);
		panelMain.setLayout(new GridLayout(4, 4));
		
		btn1 = new JButton("New button");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moverNumero(e);
				verifyWinner();
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelMain.add(btn1);
		
		btn2 = new JButton("New button");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moverNumero(e);
				verifyWinner();
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelMain.add(btn2);
		
		btn3 = new JButton("New button");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moverNumero(e);
				verifyWinner();
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelMain.add(btn3);
		
		btn4 = new JButton("New button");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moverNumero(e);
				verifyWinner();
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelMain.add(btn4);
		
		btn5 = new JButton("New button");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moverNumero(e);
				verifyWinner();
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelMain.add(btn5);
		
		btn6 = new JButton("New button");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moverNumero(e);
				verifyWinner();
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelMain.add(btn6);
		
		btn7 = new JButton("New button");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moverNumero(e);
				verifyWinner();
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelMain.add(btn7);
		
		btn8 = new JButton("New button");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moverNumero(e);
				verifyWinner();
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelMain.add(btn8);
		
		btn9 = new JButton("New button");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moverNumero(e);
				verifyWinner();
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelMain.add(btn9);
		
		btn10 = new JButton("New button");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moverNumero(e);
				verifyWinner();
			}
		});
		btn10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelMain.add(btn10);
		
		btn11 = new JButton("New button");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moverNumero(e);
				verifyWinner();
			}
		});
		btn11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelMain.add(btn11);
		
		btn12 = new JButton("New button");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moverNumero(e);
				verifyWinner();
			}
		});
		btn12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelMain.add(btn12);
		
		btn13 = new JButton("New button");
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moverNumero(e);
				verifyWinner();
			}
		});
		btn13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelMain.add(btn13);
		
		btn14 = new JButton("New button");
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moverNumero(e);
				verifyWinner();
			}
		});
		btn14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelMain.add(btn14);
		
		btn15 = new JButton("New button");
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moverNumero(e);
				verifyWinner();
			}
		});
		btn15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelMain.add(btn15);
		
		btn16 = new JButton("");
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moverNumero(e);
				verifyWinner();
			}
		});
		btn16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelMain.add(btn16);
		
		//Generar numeros al azar.
		generarNumerosAzar();
		
		JPanel panelTittle = new JPanel();
		panelTittle.setBackground(new Color(255, 255, 128));
		frmNumbers.getContentPane().add(panelTittle, BorderLayout.NORTH);
		panelTittle.setPreferredSize(new Dimension(panelTittle.getWidth(),50));
		
		JLabel lblNewLabel = new JLabel("Puzzle Numbers");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		panelTittle.add(lblNewLabel);
		
		JPanel panelReiniciar = new JPanel();
		panelReiniciar.setBackground(new Color(255, 255, 128));
		frmNumbers.getContentPane().add(panelReiniciar, BorderLayout.SOUTH);
		panelReiniciar.setPreferredSize(new Dimension(panelReiniciar.getWidth(),50));
		
		btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.setBounds(96, 5, 300, 40);
		btnReiniciar.setEnabled(false);
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reiniciarNumeros();
			}
		});
		panelReiniciar.setLayout(null);
		btnReiniciar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panelReiniciar.add(btnReiniciar);
		btnReiniciar.setPreferredSize(new Dimension(300, 40));
		
		JPanel panelWest = new JPanel();
		panelWest.setBackground(new Color(255, 255, 128));
		frmNumbers.getContentPane().add(panelWest, BorderLayout.WEST);
		panelWest.setPreferredSize(new Dimension(50,panelWest.getHeight()));
		
		JPanel panelEast = new JPanel();
		panelEast.setBackground(new Color(255, 255, 128));
		frmNumbers.getContentPane().add(panelEast, BorderLayout.EAST);
		panelEast.setPreferredSize(new Dimension(300,panelWest.getHeight()));
		panelEast.setLayout(null);
		
		JLabel lblTimer = new JLabel("0:0");
		lblTimer.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTimer.setHorizontalAlignment(SwingConstants.CENTER);
		lblTimer.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblTimer.setBounds(24, 170, 246, 43);
		panelEast.add(lblTimer);
		
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				if(!isPaused) {
					seconds++;
					if(seconds == 60) {
						seconds = 0;
						minutes++;
					}
				}
				if(minutes>=10) {
					if(seconds>=10) {
						lblTimer.setText(minutes + " : " + seconds);
					}
					else {
						lblTimer.setText(minutes + " : " + seconds);
					}
				}
				else {
					if(seconds>=10) {
						lblTimer.setText("0" + minutes + " : " + seconds);
					}
					else {
						lblTimer.setText("0" + minutes + " : " + "0" + seconds);
					}
				}
				
			}
		}, 0, 1000);
		
		btnReanudar = new JButton("Reanudar");
		btnReanudar.setEnabled(false);
		btnReanudar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isPaused = false;
				
				
				btnPausar.setEnabled(true);
				btnReanudar.setEnabled(false);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btn10.setEnabled(true);
				btn11.setEnabled(true);
				btn12.setEnabled(true);
				btn13.setEnabled(true);
				btn14.setEnabled(true);
				btn15.setEnabled(true);
				btn16.setEnabled(true);
				
			}
		});
		btnReanudar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnReanudar.setBounds(50, 259, 200, 40);
		panelEast.add(btnReanudar);
		
		btnPausar = new JButton("Pausar");
		btnPausar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isPaused = true;
				
				
				btnPausar.setEnabled(false);
				btnReanudar.setEnabled(true);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btn10.setEnabled(false);
				btn11.setEnabled(false);
				btn12.setEnabled(false);
				btn13.setEnabled(false);
				btn14.setEnabled(false);
				btn15.setEnabled(false);
				btn16.setEnabled(false);
				
				
			}
		});
		btnPausar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnPausar.setBounds(50, 310, 200, 40);
		panelEast.add(btnPausar);
		
		lblTituloTimer = new JLabel("Tiempo total:");
		lblTituloTimer.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTituloTimer.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloTimer.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblTituloTimer.setBounds(24, 75, 246, 43);
		panelEast.add(lblTituloTimer);
		

		
		
		
	}
	
	int listaNumeros[][] = null;
	private JLabel lblTituloTimer;
	
	private void generarNumerosAzar() {
		
		Set<Integer> numerosAzar = new HashSet<>();
		Random numRand = new Random();
		
		while(numerosAzar.size() < 15) {
			int numero = numRand.nextInt(15) + 1;
			if(!numerosAzar.contains(numero)) {
				numerosAzar.add(numero);
			}
		}
		int j = 0;
		List<Integer> listaNumeros = new ArrayList<>(numerosAzar);
		Collections.shuffle(listaNumeros);
		Component[] elements = panelMain.getComponents();
		for(int i = 0; i<elements.length - 1; i++) {
			if(elements[i].getClass().toString().equals("class javax.swing.JButton")) {
				if(j<16) {
					((JButton)elements[i]).setText(String.valueOf((int)listaNumeros.get(j))); 
					j++;
					}
				}
			}
		}
	
	private void moverNumero(ActionEvent e) {
		Component[] elements = panelMain.getComponents();
		JButton btn = (JButton)e.getSource();
		
		for(int i = 0; i<elements.length; i++) {
			if(elements[i].getClass().toString().equals("class javax.swing.JButton")) {
				//Para los 4 del centro
				if(i == 5 || i == 6 || i == 9 || i == 10) {
					if((JButton)elements[i] == (JButton)e.getSource()) {
						//Derecha
						if(((JButton) elements[i + 1]).getText().isEmpty()) {
							((JButton)elements[i + 1]).setText(btn.getText());
							btn.setText("");
						}
						//Izquierda
						if(((JButton) elements[i - 1]).getText().isEmpty()) {
							((JButton)elements[i - 1]).setText(btn.getText());
							btn.setText("");
						}
							//Arriba
						if(((JButton) elements[i - 4]).getText().isEmpty()) {
							((JButton)elements[i - 4]).setText(btn.getText());
							btn.setText("");
							
						}
						//Abajo
						if(((JButton) elements[i + 4]).getText().isEmpty()) {
							((JButton)elements[i + 4]).setText(btn.getText());
							btn.setText("");
						}
					}
				}
				//If para los de abajo en medio
				if(i == 14 || i == 13) {
					if((JButton)elements[i] == (JButton)e.getSource()) {
						//Derecha
						if(((JButton) elements[i + 1]).getText().isEmpty()) {
							((JButton)elements[i + 1]).setText(btn.getText());
							btn.setText("");
						}
						//Izquierda
						if(((JButton) elements[i - 1]).getText().isEmpty()) {
							((JButton)elements[i - 1]).setText(btn.getText());
							btn.setText("");
						}
						//Arriba
						if(((JButton) elements[i - 4]).getText().isEmpty()) {
							((JButton)elements[i - 4]).setText(btn.getText());
							btn.setText("");
							
						}
					}
				}
				
				if(i == 12) {
					if((JButton)elements[i] == (JButton)e.getSource()) {
						//Derecha
						if(((JButton) elements[i + 1]).getText().isEmpty()) {
							((JButton)elements[i + 1]).setText(btn.getText());
							btn.setText("");
						}
							//Arriba
						if(((JButton) elements[i - 4]).getText().isEmpty()) {
							((JButton)elements[i - 4]).setText(btn.getText());
							btn.setText("");
							
						}
					}
				}
				
				if(i == 15) {
					if((JButton)elements[i] == (JButton)e.getSource()) {
						//Izquierda
						if(((JButton) elements[i - 1]).getText().isEmpty()) {
							((JButton)elements[i - 1]).setText(btn.getText());
							btn.setText("");
						}
							//Arriba
						if(((JButton) elements[i - 4]).getText().isEmpty()) {
							((JButton)elements[i - 4]).setText(btn.getText());
							btn.setText("");
							
						}
					}
				}
				
				if(i == 0) {
					if((JButton)elements[i] == (JButton)e.getSource()) {
						//Derecha
						if(((JButton) elements[i + 1]).getText().isEmpty()) {
							((JButton)elements[i + 1]).setText(btn.getText());
							btn.setText("");
						}
						//Abajo
						if(((JButton) elements[i + 4]).getText().isEmpty()) {
							((JButton)elements[i + 4]).setText(btn.getText());
							btn.setText("");
						}
					}
				}
				
				if(i == 3) {
					if((JButton)elements[i] == (JButton)e.getSource()) {
						//Izquierda
						if(((JButton) elements[i - 1]).getText().isEmpty()) {
							((JButton)elements[i - 1]).setText(btn.getText());
							btn.setText("");
						}
						//Abajo
						if(((JButton) elements[i + 4]).getText().isEmpty()) {
							((JButton)elements[i + 4]).setText(btn.getText());
							btn.setText("");
						}
					}
				}
				if(i == 1 || i == 2) {
					if((JButton)elements[i] == (JButton)e.getSource()) {
						//Derecha
						if(((JButton) elements[i + 1]).getText().isEmpty()) {
							((JButton)elements[i + 1]).setText(btn.getText());
							btn.setText("");
						}
						//Izquierda
						if(((JButton) elements[i - 1]).getText().isEmpty()) {
							((JButton)elements[i - 1]).setText(btn.getText());
							btn.setText("");
						}
						//Abajo
						if(((JButton) elements[i + 4]).getText().isEmpty()) {
							((JButton)elements[i + 4]).setText(btn.getText());
							btn.setText("");
						}
					}
				}
				if(i == 4 || i == 8) {
					if((JButton)elements[i] == (JButton)e.getSource()) {
						//Derecha
						if(((JButton) elements[i + 1]).getText().isEmpty()) {
							((JButton)elements[i + 1]).setText(btn.getText());
							btn.setText("");
						}
							//Arriba
						if(((JButton) elements[i - 4]).getText().isEmpty()) {
							((JButton)elements[i - 4]).setText(btn.getText());
							btn.setText("");
							
						}
						//Abajo
						if(((JButton) elements[i + 4]).getText().isEmpty()) {
							((JButton)elements[i + 4]).setText(btn.getText());
							btn.setText("");
						}
					}
				}
				
				if(i == 7 || i == 11) {
					if((JButton)elements[i] == (JButton)e.getSource()) {
						//Izquierda
						if(((JButton) elements[i - 1]).getText().isEmpty()) {
							((JButton)elements[i - 1]).setText(btn.getText());
							btn.setText("");
						}
							//Arriba
						if(((JButton) elements[i - 4]).getText().isEmpty()) {
							((JButton)elements[i - 4]).setText(btn.getText());
							btn.setText("");
							
						}
						//Abajo
						if(((JButton) elements[i + 4]).getText().isEmpty()) {
							((JButton)elements[i + 4]).setText(btn.getText());
							btn.setText("");
						}
					}
				}
				
			}
		}		
	}
	
	private void verifyWinner() {
		Component[] elements = panelMain.getComponents();
		boolean flag = false;
		Integer[] arregloNum = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		for(int i = 0; i<elements.length -1; i++) {
			if(elements[i].getClass().toString().equals("class javax.swing.JButton")) {
				String str = ((JButton)elements[i]).getText();
				if(str.equals("")) {
					arregloNum[i] = Integer.parseInt("-1");
				}
				else {
					arregloNum[i] = Integer.parseInt(str);
				}				
				if(((JButton)elements[i]).getText().equals(String.valueOf(i + 1))) {
					
				}	
				else {
					flag = false;
				}
			}
		}
		
		flag = confirmarOrden(arregloNum);
		
		if(flag) {
			btnReiniciar.setEnabled(true);
			JOptionPane.showMessageDialog(null, "Se ha acompletado el puzzle.");
		}
	}
	
	private boolean confirmarOrden(Integer[] arregloNum) {
		for(int i = 0; i<arregloNum.length - 1; i++) {
			if(arregloNum[i] > arregloNum[i + 1]) {
				return false;
			}
		}
		return true;
		
	}
	
	private void reiniciarNumeros() {
		generarNumerosAzar();
		btn16.setText("");
	}
}
