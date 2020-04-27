package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField passwordInput;
	private JTextField userInput;

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Entrar");
		
		btnNewButton.setBounds(168, 168, 89, 23);
		panel.add(btnNewButton);
		
		passwordInput = new JTextField();
		passwordInput.setBounds(115, 124, 190, 20);
		panel.add(passwordInput);
		passwordInput.setColumns(10);
		
		userInput = new JTextField();
		userInput.setColumns(10);
		userInput.setBounds(115, 62, 190, 20);
		panel.add(userInput);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(115, 37, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(115, 99, 76, 14);
		panel.add(lblContrasea);
		
		JButton btnNewButton_1 = new JButton("Insertar");
		
		btnNewButton_1.setBounds(29, 168, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Eliminar");
		
		btnNewButton_2.setBounds(298, 168, 89, 23);
		panel.add(btnNewButton_2);
		
		// Acciones
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Llamar al controlador
				String user = userInput.getText();
				String password = passwordInput.getText();
				new controlador.Login().checkUser(user, password);
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = userInput.getText();
				String password = passwordInput.getText();
				new controlador.Login().insertUser(user, password);
			}
		});
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = userInput.getText();
				new controlador.Login().deleteUser(user);
			}
		});
	}
}
