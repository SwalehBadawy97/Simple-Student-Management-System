package Login_Frm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Color;

public class Login_F implements ActionListener{


	private JFrame frame;
	private JTextField txtName;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_F window = new Login_F();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_F() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 515, 316);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblName.setBounds(27, 69, 75, 17);
		frame.getContentPane().add(lblName);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(27, 130, 75, 23);
		frame.getContentPane().add(lblPassword);
		
		txtName = new JTextField();
		txtName.setBounds(148, 67, 174, 20);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(148, 131, 174, 20);
		frame.getContentPane().add(txtPassword);
		
		JLabel lblForm = new JLabel("REGISTRATION & LOG IN FORM");
		lblForm.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblForm.setBounds(124, 11, 268, 23);
		frame.getContentPane().add(lblForm);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(Color.WHITE);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userNameInput = txtName.getText();
			     @SuppressWarnings("deprecation")
				String passwordInput = txtPassword.getText();
			     
			     try {
			    	 FileReader reader = new FileReader("USERDATA.txt");
			            BufferedReader bufferedReader = new BufferedReader(reader);
			            Scanner in = new Scanner(new File("USERDATA.txt"));
			            
			            while (in.hasNextLine())
			            {
			              String s = in.nextLine();  
			              String[] sArray = s.split(",");
			              
			              System.out.println(sArray[0]); //Just to verify that file is being read
			              System.out.println(sArray[1]);

			              
			              if (userNameInput.equals(sArray[0]) && passwordInput.equals(sArray[1]))
			              {
			            	  
			                Welcome itemloader = new Welcome();
			                itemloader.setVisible(true);
			               
			                
			                System.out.println("Success"); // Just to make sure 
			              }
			              else
			              {
			                JOptionPane.showMessageDialog(null,
			                    "Invalid Username / Password Combo", "Error",
			                    JOptionPane.ERROR_MESSAGE
			               
			              
			                
			                
			              );}
			            }
			            in.close();
			            
			            
			        } catch (FileNotFoundException e1) {
			            JOptionPane.showMessageDialog(null,
			                    "User Database Not Found", "Error",
			                    JOptionPane.ERROR_MESSAGE);
			        };
				
			}
		});
		btnLogin.setBounds(27, 229, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(Color.ORANGE);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtName.setText(null);
				txtPassword.setText(null);
			}
		});
		btnReset.setBounds(210, 229, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(Color.RED);
		btnExit.addActionListener(new ActionListener() {
			private JFrame frmLoginForm;

			public void actionPerformed(ActionEvent e) {
				
				 frmLoginForm = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmLoginForm, "Do you really want to exit?", "Login Form",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(368, 229, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(27, 181, 449, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(27, 42, 449, 2);
		frame.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("REGISTER HERE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userNameInput = txtName.getText();
				String passwordInput = txtPassword.getText();
				
				try {
					FileWriter fw = new FileWriter("USERDATA.txt",true);
			        PrintWriter out = new PrintWriter(fw);
			        
			        out.println(String.join(",", userNameInput,passwordInput));
			        //out.println(passwordInput);
			        
			       
			       
					out.close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(188, 194, 134, 23);
		frame.getContentPane().add(btnNewButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
