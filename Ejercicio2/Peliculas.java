package Ejercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Peliculas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel etiqueta;
	private JLabel etiqueta1;
	private JButton boton;
	private JComboBox combo;
	
	public Peliculas() {
		setTitle("Películas");
		setBounds(100, 100, 550, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		etiqueta = new JLabel("Escribe el titulo de una pelicula");
		etiqueta.setBounds(76, 39, 184, 20);
		contentPane.add(etiqueta);
		
		etiqueta1 = new JLabel("Peliculas");
		etiqueta1.setBounds(380, 39, 61, 20);
		contentPane.add(etiqueta1);
		
		textField = new JTextField();
		textField.setBounds(60, 67, 200, 20);
		contentPane.add(textField);
		
		combo = new JComboBox<>();
		combo.setBounds(358,70,113,20);
		contentPane.add(combo);
		combo.addItem("Avatar");
		
		boton = new JButton("Añadir");
		boton.setBounds(76,116,80,20);
		contentPane.add(boton);
		boton.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				combo.addItem(textField.getText());
			}
		});
	}

}
