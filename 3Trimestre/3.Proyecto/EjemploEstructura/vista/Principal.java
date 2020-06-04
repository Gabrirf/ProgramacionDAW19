package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Central;

import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField inputNombre;

	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton boton = new JButton("Bot�n");
		boton.setBounds(141, 145, 89, 20);
		panel.add(boton);
		
		inputNombre = new JTextField();
		inputNombre.setBounds(195, 80, 86, 20);
		panel.add(inputNombre);
		inputNombre.setColumns(10);
		
		JLabel labelNombre = new JLabel("Nombre:");
		labelNombre.setBounds(107, 83, 79, 14);
		panel.add(labelNombre);
		
		
		/* Acciones */
		
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = inputNombre.getText();
				new Central().saludar(nombre);
			}
		});
	}
}
