package CustomerBilling;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage extends JPanel {

	private JTextField userName;
	private JPasswordField password;

	// javax.swing.JPanel
	public LoginPage() {
		setLayout(null);

		// Secondary Title
		JLabel lblNewLabel = new JLabel("Login To Continue");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(683, 245, 253, 46);
		add(lblNewLabel);

		// Jlabel field for username
		JLabel lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 27));
		lblNewLabel_1.setBounds(643, 347, 149, 29);
		add(lblNewLabel_1);

		// JTextField for entering username
		userName = new JTextField();
		userName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		userName.setBounds(802, 347, 208, 24);
		add(userName);
		userName.setColumns(10);

		// Jlabel field for password
		JLabel lblNewLabel_1_1 = new JLabel("Password: ");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Sitka Text", Font.BOLD, 27));
		lblNewLabel_1_1.setBounds(643, 407, 160, 29);
		add(lblNewLabel_1_1);

		// JTextfield for entering password
		password = new JPasswordField();
		password.setFont(new Font("Tahoma", Font.PLAIN, 20));
		password.setBounds(802, 407, 208, 24);
		add(password);

		// Primary Title
		JLabel lblWelcomeToMarios = new JLabel("Welcome To Mario's Mart");
		lblWelcomeToMarios.setForeground(new Color(255, 255, 255));
		lblWelcomeToMarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToMarios.setFont(new Font("Sylfaen", Font.BOLD, 35));
		lblWelcomeToMarios.setBounds(607, 156, 426, 46);
		add(lblWelcomeToMarios);

		// Login Button
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String un = userName.getText();
				String pass = password.getText();

				if (un.equals("admin") && pass.equals("1234")) {
					CustomerBilling bill = new CustomerBilling();
					bill.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Login Failed");
				}
			}
		});
		btnNewButton.setBackground(new Color(0, 51, 102));
		btnNewButton.setFont(new Font("Segoe UI Symbol", Font.BOLD, 19));
		btnNewButton.setBounds(742, 470, 149, 37);
		add(btnNewButton);
	}

	// Method For Gradient-Color Background
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		int w = getWidth(), h = getHeight();
		Color color1 = Color.CYAN;
		Color color2 = Color.MAGENTA;
		GradientPaint gp = new GradientPaint(0, 0, color1, w, h, color2);
		g2d.setPaint(gp);
		g2d.fillRect(0, 0, w, h);
	}

	//Main Method
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame frame = new JFrame();
				LoginPage panel = new LoginPage();
				frame.getContentPane().add(panel);
				frame.setSize(1400, 800);
				frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				frame.setLocationRelativeTo(null);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}