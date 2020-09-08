package Login_Frm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Welcome extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Welcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO ZAVERY ACADEMY");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Kristen ITC", Font.ITALIC, 16));
		lblNewLabel.setBounds(62, 77, 323, 44);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("PROCEED");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Courses itemloader = new Courses();
                itemloader.setVisible(true);
                
			}

			
		});
		btnNewButton.setBounds(62, 203, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("EXIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			private JFrame frmWelcome;
			
		
			public void actionPerformed(ActionEvent e) {
				
				frmWelcome = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmWelcome, "Do you really want to exit?", "Welcome Form",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
			}
		}});
		btnNewButton_1.setBounds(257, 203, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
