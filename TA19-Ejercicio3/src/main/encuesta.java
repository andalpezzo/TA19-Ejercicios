package main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class encuesta extends JFrame {

	private JPanel contentPane;
	private ButtonGroup bgSistemas;
	private JRadioButton rbWindows, rbLinux, rbMac;
	private JCheckBox chbProgramacion, chbDiseno, chbAdministracion;
	private JSlider sldHoras;
	private int horas;

	/**
	 * Creamos el frame principal
	 */
	public encuesta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSistema = new JLabel("Elije un sistema operativo");
		lblSistema.setFont(new Font("Verdana", Font.BOLD, 12));
		lblSistema.setBounds(10, 11, 216, 36);
		contentPane.add(lblSistema);

		//Radio buttons
		rbWindows = new JRadioButton("Windows", true);
		rbWindows.setBounds(10, 43, 109, 23);
		contentPane.add(rbWindows);

		rbLinux = new JRadioButton("Linux");
		rbLinux.setBounds(10, 69, 109, 23);
		contentPane.add(rbLinux);

		rbMac = new JRadioButton("Mac");
		rbMac.setBounds(10, 95, 109, 23);
		contentPane.add(rbMac);

		//Controlamos el JRadioButton que se ha pulsado
		bgSistemas = new ButtonGroup();

		bgSistemas.add(rbWindows);
		bgSistemas.add(rbLinux);
		bgSistemas.add(rbMac);
		
		JLabel lblHorasDedicadas = new JLabel("Horas dedicadas en el ordenador");
		lblHorasDedicadas.setFont(new Font("Verdana", Font.BOLD, 12));
		lblHorasDedicadas.setBounds(10, 125, 268, 36);
		contentPane.add(lblHorasDedicadas);

		//Slider
		sldHoras = new JSlider(0, 10, 0);
		sldHoras.setToolTipText("");
		sldHoras.setBounds(10, 159, 200, 45);
		sldHoras.setMajorTickSpacing(2); // Pinta los espacios mayores
		sldHoras.setMinorTickSpacing(1); // Pinta los espaciso menores
		sldHoras.setPaintTicks(true); // Mostramos los espacios
		sldHoras.setPaintLabels(true); // Motramos la numeración

		//Creamos una clase para controlar el slider
		sldHoras.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				horas = sldHoras.getValue();
			}
		});

		contentPane.add(sldHoras);
		
		JLabel lblEpecialidad = new JLabel("Elije tu especialidad");
		lblEpecialidad.setFont(new Font("Verdana", Font.BOLD, 12));
		lblEpecialidad.setBounds(10, 223, 216, 36);
		contentPane.add(lblEpecialidad);

		//Checkboxes
		chbProgramacion = new JCheckBox("Programación");
		chbProgramacion.setBounds(10, 258, 158, 23);
		contentPane.add(chbProgramacion);

		chbDiseno = new JCheckBox("Diseño gráfico");
		chbDiseno.setBounds(10, 284, 158, 23);
		contentPane.add(chbDiseno);

		chbAdministracion = new JCheckBox("Administración");
		chbAdministracion.setBounds(10, 310, 158, 23);
		contentPane.add(chbAdministracion);

		//Boton para mostrar los datos
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(b1);
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton.setBounds(90, 360, 89, 23);
		contentPane.add(btnNewButton);

		setVisible(true);
	}

	// Controlamos los eventos del botón al pulsarlo
	ActionListener b1 = new ActionListener() {
		@SuppressWarnings("unused")
		public void actionPerformed(ActionEvent e) {
			String rbSelec = "";
			String chbSelec = "";
			
			if (rbWindows.isSelected()) {
				rbSelec = "Windows";
			} else if (rbLinux.isSelected()) {
				rbSelec = "Linux";
			} else if (rbMac.isSelected()) {
				rbSelec = "Mac";
			}

			if (chbProgramacion.isSelected()) {
				chbSelec += "Programación ";
			} else if (chbDiseno.isSelected()) {
				chbSelec += "Diseño Gráfico ";
			} else if (chbAdministracion.isSelected()) {
				chbSelec += "Administración ";
			}

			//Creamos un nuevo JFrame al pulsar el botón y les pasamos por parametros los valores para mostrarlos
			mostrarDatos mr = new mostrarDatos(rbSelec, chbSelec, horas);
		}
	};
}