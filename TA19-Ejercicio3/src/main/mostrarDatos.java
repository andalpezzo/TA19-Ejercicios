package main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;

@SuppressWarnings("serial")
public class mostrarDatos extends JFrame {

	private JPanel contentPane;

	/**
	 * Creamos el JFrame que muestra los resultados de la encuesta
	 */
	public mostrarDatos(String sistema, String especialidad, int horas) {
		//Con DISPOSE_ON_CLOSE hacemos que solo se cierre este JFrame
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 250, 168);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel titulo = new JLabel("Datos introducidos");
		titulo.setFont(new Font("Verdana", Font.BOLD, 12));
		titulo.setBounds(10, 11, 240, 26);
		contentPane.add(titulo);

		JLabel sistemaLbl = new JLabel("Sistema: " + sistema);
		sistemaLbl.setLocation(20, 39);
		sistemaLbl.setBounds(10, 87, 181, 26);
		contentPane.add(sistemaLbl);
		
		JLabel horasLbl = new JLabel("Horas: " + horas);
		horasLbl.setLocation(20, 39);
		horasLbl.setBounds(10, 37, 181, 26);
		contentPane.add(horasLbl);
		
		JLabel EspecialidadLbl = new JLabel("Especialidad: " + especialidad);
		EspecialidadLbl.setLocation(20, 39);
		EspecialidadLbl.setBounds(10, 61, 181, 26);
		contentPane.add(EspecialidadLbl);

		setVisible(true);

	}

}
