package main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Insets;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;

public class MiniCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField tfValor1;
	private JTextField tfResultado;
	private JTextField tfValor2;
	private JButton btnSalir;
	private JLabel lblValor1;
	private JLabel lblValor2;
	private JLabel lblResultado;
	private JButton btnSuma;
	private JButton btnResta;
	private JButton btnMultiplicacion;
	private JButton btnDivision;
	private double operacion = 0;

	public MiniCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 100, 207, 224);
		getContentPane().setLayout(null);

		lblValor1 = new JLabel("Valor 1");
		lblValor1.setBounds(20, 29, 89, 14);
		lblValor1.setFocusable(true); 
		getContentPane().add(lblValor1);

		lblValor2 = new JLabel("Valor 2");
		lblValor2.setBounds(20, 54, 89, 14);
		lblValor2.setFocusable(true); 
		getContentPane().add(lblValor2);

		lblResultado = new JLabel("RESULTADO");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblResultado.setBounds(56, 120, 74, 14);
		getContentPane().add(lblResultado);

		tfValor1 = new JTextField();
		tfValor1.setBounds(69, 23, 102, 20);
		getContentPane().add(tfValor1);
		tfValor1.setColumns(10);

		tfResultado = new JTextField();
		tfResultado.setColumns(10);
		tfResultado.setBounds(20, 141, 151, 20);
		getContentPane().add(tfResultado);

		tfValor2 = new JTextField();
		tfValor2.setColumns(10);
		tfValor2.setBounds(69, 51, 102, 20);
		getContentPane().add(tfValor2);

		btnSuma = new JButton("+");
		btnSuma.addActionListener(operador);

		btnSuma.setMinimumSize(new Dimension(0, 0));
		btnSuma.setMaximumSize(new Dimension(0, 0));
		btnSuma.setMargin(new Insets(0, 0, 0, 0));
		btnSuma.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSuma.setBounds(20, 79, 30, 30);
		getContentPane().add(btnSuma);

		btnResta = new JButton("-");
		btnResta.addActionListener(operador);

		btnResta.setMinimumSize(new Dimension(0, 0));
		btnResta.setMaximumSize(new Dimension(0, 0));
		btnResta.setMargin(new Insets(0, 0, 0, 0));
		btnResta.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnResta.setBounds(60, 79, 30, 30);
		getContentPane().add(btnResta);

		btnMultiplicacion = new JButton("*");
		btnMultiplicacion.addActionListener(operador);

		btnMultiplicacion.setVerticalAlignment(SwingConstants.BOTTOM);
		btnMultiplicacion.setMinimumSize(new Dimension(0, 0));
		btnMultiplicacion.setMaximumSize(new Dimension(0, 0));
		btnMultiplicacion.setMargin(new Insets(0, 0, 0, 0));
		btnMultiplicacion.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMultiplicacion.setBounds(100, 79, 30, 30);
		getContentPane().add(btnMultiplicacion);

		btnDivision = new JButton("/");
		btnDivision.addActionListener(operador);

		btnDivision.setMinimumSize(new Dimension(0, 0));
		btnDivision.setMaximumSize(new Dimension(0, 0));
		btnDivision.setMargin(new Insets(0, 0, 0, 0));
		btnDivision.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivision.setBounds(141, 79, 30, 30);
		getContentPane().add(btnDivision);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setVisible(true);
	}

	//Eventos de los botones de los operadores
	ActionListener operador = new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			//Convertimos a double los valores que recojemos de los TextField
			double operador1 = Double.parseDouble(tfValor1.getText());
			double operador2 = Double.parseDouble(tfValor2.getText());
			

			//Realilza las operaciones segun que boton se haya pulsado
			if (e.getSource().equals(btnSuma)) {
				operacion = operador1 + operador2;
			} else if (e.getSource().equals(btnResta)) {
				operacion = operador1 - operador2;
			} else if (e.getSource().equals(btnMultiplicacion)) {
				operacion = operador1 * operador2;
			} else if (e.getSource().equals(btnDivision)) {
				//Try-catch por si la division es entre 0
				try {
					operacion = operador1 / operador2;
				} catch (ArithmeticException e1) {
					e1.getMessage();
					JOptionPane.showMessageDialog(null, "No se puede dividir entre 0", "Error", 0);
				}
			}

			//Vaciamos los TextField
			tfValor1.setText("");
			tfValor2.setText("");

			tfResultado.setText("" + operacion);
		}
	};
}