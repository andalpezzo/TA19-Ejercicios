package main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class vistaPeliculas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JComboBox<String> comboBox;

	/**
	 * Create the frame.
	 */
	public vistaPeliculas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 417, 174);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escribe el titulo de una pelicula");
		lblNewLabel.setBounds(26, 27, 199, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(26, 52, 168, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.addActionListener(al);
		
		btnNewButton.setBounds(26, 81, 168, 23);
		contentPane.add(btnNewButton);
		
		comboBox = new JComboBox<String>();
		comboBox.setMaximumRowCount(10);
		comboBox.setBounds(228, 51, 147, 22);
		contentPane.add(comboBox);
		
		lblNewLabel_1 = new JLabel("Peliculas");
		lblNewLabel_1.setBounds(281, 27, 60, 14);
		contentPane.add(lblNewLabel_1);
		
		setVisible(true);
	}
	
	ActionListener al = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		comboBox.addItem(textField.getText());
		}
	};
	private JLabel lblNewLabel_1;
}
