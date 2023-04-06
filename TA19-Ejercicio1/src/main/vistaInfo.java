package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class vistaInfo extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public vistaInfo(String newValue) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 277, 122);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¡Hola " + newValue + "!");
		lblNewLabel.setBounds(63, 24, 133, 40);
		contentPane.add(lblNewLabel);
		
		setVisible(true);
	}

}
