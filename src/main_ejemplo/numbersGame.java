package main_ejemplo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

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
		panelMain.add(btn1);
		
		btn2 = new JButton("New button");
		panelMain.add(btn2);
		
		btn3 = new JButton("New button");
		panelMain.add(btn3);
		
		btn4 = new JButton("New button");
		panelMain.add(btn4);
		
		btn5 = new JButton("New button");
		panelMain.add(btn5);
		
		btn6 = new JButton("New button");
		panelMain.add(btn6);
		
		btn7 = new JButton("New button");
		panelMain.add(btn7);
		
		btn8 = new JButton("New button");
		panelMain.add(btn8);
		
		btn9 = new JButton("New button");
		panelMain.add(btn9);
		
		btn10 = new JButton("New button");
		panelMain.add(btn10);
		
		btn11 = new JButton("New button");
		panelMain.add(btn11);
		
		btn12 = new JButton("New button");
		panelMain.add(btn12);
		
		btn13 = new JButton("New button");
		panelMain.add(btn13);
		
		btn14 = new JButton("New button");
		panelMain.add(btn14);
		
		btn15 = new JButton("New button");
		panelMain.add(btn15);
		
		btn16 = new JButton("New button");
		panelMain.add(btn16);
		
		//Generar numeros al azar.
		//generarNumerosAzar();
		
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
		
		JButton btnReiniciar = new JButton("Reiniciar");
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
		panelEast.setPreferredSize(new Dimension(50,panelWest.getHeight()));
	}
	
	int listaNumeros[][] = null;
	
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
		Integer[] arregloNum = numerosAzar.toArray(new Integer[0]);
		Component[] elements = panelMain.getComponents();
		for(int i = 0; i<elements.length; i++) {
			if(elements[i].getClass().toString().equals("class javax.swing.JButton")) {
				if(j<16) {
					((JButton)elements[i]).setText(String.valueOf((int)arregloNum[j])); 
					j++;
					}
				}
			}

		
		}

	
	private void generarNoRepetidos(int noRepetidos[]) {
		
	}
	
	private void reiniciarNumeros() {
		generarNumerosAzar();
	}
}
