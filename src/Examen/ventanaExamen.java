package Examen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ventanaExamen {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTextField textField_3;
	private JTextField txtDatosDelCliente;
	private JTextField txtDatosDeLa;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaExamen window = new ventanaExamen();
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
	public ventanaExamen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 588, 631);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#0879C6"));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 70, 572, 511);
		panel_1.setLayout(null);
		panel.add(panel_1);
		
		txtDatosDeLa = new JTextField();
		txtDatosDeLa.setText("Datos de la factura");
		txtDatosDeLa.setEditable(false);
		txtDatosDeLa.setColumns(10);
		txtDatosDeLa.setBorder(null);
		txtDatosDeLa.setBackground(Color.WHITE);
		txtDatosDeLa.setBounds(58, 177, 105, 12);
		panel_1.add(txtDatosDeLa);
		
		txtDatosDelCliente = new JTextField();
		txtDatosDelCliente.setBackground(new Color(255, 255, 255));
		txtDatosDelCliente.setEditable(false);
		txtDatosDelCliente.setText("Datos del cliente");
		txtDatosDelCliente.setColumns(10);
		txtDatosDelCliente.setBounds(58, 9, 95, 26);
		panel_1.add(txtDatosDelCliente);
		
		Object data[][] = {
				{"Agua",2,500,1000.0},
				{"Cereal",5,1000,5000.0},
				{"Leche",2,300,600.0}
		};
		
		String columnNames[] = {"Producto","Cantidad","Valor","Sub Total"};
		
		JTable table = new JTable(data,columnNames);
		
		JScrollPane scroll = new JScrollPane(table);
		scroll.setBounds(36, 267, 504, 111);
		table.setBounds(36, 267, 504, 111);
		
		
		panel_1.add(scroll);
		
		JLabel lblNewLabel = new JLabel("SubTotal:");
		lblNewLabel.setBounds(58, 389, 65, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblDeDescuento = new JLabel("% Descuento:");
		lblDeDescuento.setBounds(58, 407, 79, 26);
		panel_1.add(lblDeDescuento);
		
		JLabel lblIva = new JLabel("IVA 19%:");
		lblIva.setBounds(58, 438, 79, 14);
		panel_1.add(lblIva);
		
		JLabel lblTotal = new JLabel("Total factura:");
		lblTotal.setBounds(58, 463, 79, 14);
		panel_1.add(lblTotal);
		
		JLabel lblValorDescontado = new JLabel("Valor descontado:");
		lblValorDescontado.setBounds(231, 413, 107, 14);
		panel_1.add(lblValorDescontado);
		
		JLabel lblNewLabel_1 = new JLabel("6600.0");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(143, 389, 57, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("1254.0");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1.setBounds(143, 438, 57, 14);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("7524.0");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_2.setBounds(143, 463, 57, 14);
		panel_1.add(lblNewLabel_1_1_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(255, 255, 255));
		textField_3.setColumns(10);
		textField_3.setBounds(143, 410, 45, 21);
		panel_1.add(textField_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBounds(204, 410, 21, 23);
		panel_1.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("330.0");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1_1.setBounds(348, 413, 57, 14);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JButton btnNewButton = new JButton("Finalizar factura");
		btnNewButton.setBounds(322, 477, 136, 23);
		panel_1.add(btnNewButton);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(461, 477, 79, 23);
		panel_1.add(btnLimpiar);
		txtDatosDelCliente.setBorder(null);
		
		JLabel lblNewLabel_2 = new JLabel("Documento:");
		lblNewLabel_2.setBounds(58, 60, 85, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Dirección:");
		lblNewLabel_2_1.setBounds(58, 125, 85, 14);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Nombres:");
		lblNewLabel_2_2.setBounds(298, 60, 85, 14);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Teléfono:");
		lblNewLabel_2_3.setBounds(298, 125, 85, 14);
		panel_1.add(lblNewLabel_2_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(133, 59, 140, 17);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(133, 123, 140, 17);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(367, 60, 140, 17);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(367, 123, 140, 17);
		panel_1.add(textField_7);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setEditable(false);
		textField.setEnabled(false);
		textField.setBounds(36, 40, 504, 132);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Nº Factura:");
		lblNewLabel_2_1_1.setBounds(58, 194, 85, 14);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Fecha:");
		lblNewLabel_2_1_2.setBounds(298, 194, 85, 14);
		panel_1.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("1");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(133, 196, 57, 14);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("2021/50/21");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(367, 194, 112, 14);
		panel_1.add(lblNewLabel_1_2);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(36, 183, 504, 37);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Sebas\\Documents\\Eclipse workspace\\EvaluacionUnidad2\\src\\Examen\\lista.png"));
		lblNewLabel_3.setBounds(58, 222, 46, 50);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon("C:\\Users\\Sebas\\Documents\\Eclipse workspace\\EvaluacionUnidad2\\src\\Examen\\plus-pequeno.png"));
		lblNewLabel_3_1.setBounds(353, 236, 46, 22);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setIcon(new ImageIcon("C:\\Users\\Sebas\\Documents\\Eclipse workspace\\EvaluacionUnidad2\\src\\Examen\\cruz-pequena.png"));
		lblNewLabel_3_2.setBounds(446, 236, 46, 22);
		panel_1.add(lblNewLabel_3_2);
		
		JLabel lblVerListadoDe = new JLabel("Ver listado de facturas:");
		lblVerListadoDe.setBounds(98, 239, 175, 14);
		panel_1.add(lblVerListadoDe);
		
		JLabel lblAadir = new JLabel("Añadir");
		lblAadir.setBounds(384, 240, 65, 14);
		panel_1.add(lblAadir);
		
		JLabel lblEliminar = new JLabel("Eliminar");
		lblEliminar.setBounds(481, 240, 65, 14);
		panel_1.add(lblEliminar);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(255, 255, 255));
		textField_2.setEnabled(false);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(36, 231, 504, 31);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_4 = new JLabel("Factura en Java - NetBeans - ArrayList y POO");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(40, 11, 456, 37);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("[Sin base de datos]");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(45, 42, 142, 17);
		panel.add(lblNewLabel_5);
		
		
		
	}
}
