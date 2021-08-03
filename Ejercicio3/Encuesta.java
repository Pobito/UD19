package Ejercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Encuesta extends JFrame {

	private JPanel contentPane;
	private JLabel texto1;
	private JLabel texto2;
	private JLabel texto3;
	private JRadioButton opcion1;
	private JRadioButton opcion2;
	private JRadioButton opcion3;
	private ButtonGroup grupo;
	private JCheckBox box1;
	private JCheckBox box2;
	private JCheckBox box3;
	private JSpinner spinner;
	private JButton boton;
	
	public Encuesta() {
		setTitle("Encuesta");
		setBounds(100, 100, 550, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		texto1 = new JLabel("Elige 1 sistema operativo");
		texto1.setBounds(38, 32, 179, 20);
		contentPane.add(texto1);
		texto2 = new JLabel("Elige tu especialidad");
		texto2.setBounds(280, 32, 129, 20);
		contentPane.add(texto2);
		texto3 = new JLabel("Di las horas dedicas en el ordenador");
		texto3.setBounds(38, 164, 209, 20);
		contentPane.add(texto3);
		
		opcion1 = new JRadioButton("Windows", false);
		opcion1.setBounds(38,63,109,23);
		contentPane.add(opcion1);
		opcion2 = new JRadioButton("Mac", false);
		opcion2.setBounds(38,89,109,23);
		contentPane.add(opcion2);
		opcion3 = new JRadioButton("Linux", false);
		opcion3.setBounds(38,115,109,23);
		contentPane.add(opcion3);
		
		grupo = new ButtonGroup();
		grupo.add(opcion1);
		grupo.add(opcion2);
		grupo.add(opcion3);
		
		box1 = new JCheckBox("Programación", false);
		box1.setBounds(280,63,197,23);
		contentPane.add(box1);
		box2 = new JCheckBox("Diseño gráfico", false);
		box2.setBounds(280,89,197,23);
		contentPane.add(box2);
		box3 = new JCheckBox("Administración", false);
		box3.setBounds(280,115,197,23);
		contentPane.add(box3);
		
	    SpinnerModel modeloSpinner = new SpinnerNumberModel(5, 0, 10, 1);
		spinner = new JSpinner(modeloSpinner);
		spinner.setBounds(38,195,29,20);
		contentPane.add(spinner);
		
		boton = new JButton("Enviar");
		boton.setBounds(216,270,100,20);
		contentPane.add(boton);
		boton.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				String respuesta;
				if (opcion1.isSelected()) {
					respuesta = "Sistema operativo Windows";
				}
				else if (opcion2.isSelected()) {
					respuesta = "Sistema operativo Mac";
				}
				else {
					respuesta = "Sistema operativo Linux";
				}
				
				if (box1.isSelected()) {
					respuesta += "\nEspecialidad: Programación";
				}
				if (box2.isSelected()) {
					respuesta += "\nEspecialidad: Diseño gráfico";
				}
				if (box3.isSelected()) {
					respuesta += "\nEspecialidad: Administración";
				}
				
				respuesta += "\nHoras dedicadas: " + spinner.getValue();
				JOptionPane.showMessageDialog(null, respuesta);
			}
		});
	}

}
