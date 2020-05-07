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
		
		passwordInput = new JTextField();
		passwordInput.setBounds(115, 124, 190, 20);
		panel.add(passwordInput);
		passwordInput.setColumns(10);
		
		userInput = new JTextField();
		userInput.setColumns(10);
		userInput.setBounds(115, 62, 190, 20);
		panel.add(userInput);
		
		JLabel userLabel = new JLabel("Usuario");
		userLabel.setBounds(115, 37, 46, 14);
		panel.add(userLabel);
		
		JLabel passwordLabel = new JLabel("Contrase\u00F1a");
		passwordLabel.setBounds(115, 99, 76, 14);
		panel.add(passwordLabel);
		
		JButton insertButton = new JButton("Insertar");
		insertButton.setBounds(10, 168, 89, 23);
		panel.add(insertButton);
		
		JButton loginButton = new JButton("Entrar");
		loginButton.setBounds(115, 168, 89, 23);
		panel.add(loginButton);
		
		JButton updateButton = new JButton("Actualizar");
		updateButton.setBounds(214, 168, 101, 23);
		panel.add(updateButton);
		
		JButton deleteButton = new JButton("Eliminar");
		deleteButton.setBounds(325, 168, 89, 23);
		panel.add(deleteButton);
		
		// Acciones
		
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Llamar al controlador
				String user = userInput.getText();
				String password = passwordInput.getText();
				new controlador.Login().checkUser(user, password);
			}
		});
		
		insertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = userInput.getText();
				String password = passwordInput.getText();
				new controlador.Login().insertUser(user, password);
			}
		});
		
		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String user = userInput.getText();
					String password = passwordInput.getText();
					new controlador.Login().updateUser(user, password);
			}
		});
		
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = userInput.getText();
				new controlador.Login().deleteUser(user);
			}
		});
	}
}
