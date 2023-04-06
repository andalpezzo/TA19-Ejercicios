package main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.border.Border;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class vistaForm extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;

	/**
	 * Create the frame.
	 */
	public vistaForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 373, 167);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escribe un nombre para saludar");
		lblNewLabel.setBounds(95, 28, 186, 14);
		contentPane.add(lblNewLabel);
		
		tf1 = new JTextField();
		tf1.setBounds(42, 53, 280, 20);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		JButton bt1 = new JButton("¡Saludar!");
		bt1.addActionListener(al);
		bt1.setBounds(127, 89, 89, 23);
		contentPane.add(bt1);
		
		setVisible(true);
	}
	
	ActionListener al = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			vistaInfo vi = new vistaInfo(tf1.getText());
			setVisible(false);
		}
	};
}
