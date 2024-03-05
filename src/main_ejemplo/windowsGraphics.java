package main_ejemplo;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class windowsGraphics {

	private JFrame frmPaginaGrficos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windowsGraphics window = new windowsGraphics();
					window.frmPaginaGrficos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public windowsGraphics() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPaginaGrficos = new JFrame();
		frmPaginaGrficos.setTitle("Pagina gráficos");
		frmPaginaGrficos.setBounds(100, 100, 1005, 555);
		frmPaginaGrficos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
