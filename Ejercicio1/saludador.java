package Ejercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class saludador extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel etiqueta;
	private JButton boton;
	
	public saludador() {
		setTitle("Saludador");
		setBounds(100, 100, 330, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		etiqueta = new JLabel("Pon tu nombre para que te salude");
		etiqueta.setBounds(60, 20, 300, 20);
		contentPane.add(etiqueta);
		
		textField = new JTextField();
		textField.setBounds(60, 67, 200, 20);
		contentPane.add(textField);
		
		boton = new JButton("Saludar");
		boton.setBounds(110,90,100,20);
		contentPane.add(boton);
		boton.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				JOptionPane.showMessageDialog(null, "¡Hola " + textField.getText() + "!");
			}
		});
	}

	
}
