package Login_Frm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Courses extends JFrame {

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
					Courses frame = new Courses();
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
	public Courses() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModules = new JLabel("LEARNING MODULES");
		lblModules.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblModules.setHorizontalAlignment(SwingConstants.CENTER);
		lblModules.setBounds(10, 12, 196, 14);
		contentPane.add(lblModules);
		
		JCheckBox chckbx1 = new JCheckBox("Data Science");
		chckbx1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbx1.isSelected()) {
					FileWriter fw = null;
					try {
						fw = new FileWriter("courses.txt",true);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			        PrintWriter out = new PrintWriter(fw);

			        out.println("Data Science");
			        out.close();
				}
			}
		});
		chckbx1.setBounds(22, 44, 100, 23);
		contentPane.add(chckbx1);
		
		JCheckBox chckbx2 = new JCheckBox("Automata Theory");
		chckbx2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbx2.isSelected()) {
					
					FileWriter fw = null;
					try {
						fw = new FileWriter("courses.txt",true);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			        PrintWriter out = new PrintWriter(fw);

			        out.println("Automata Theory");
			        out.close();
				}
							
			}});
		
		chckbx2.setBounds(22, 77, 149, 23);
		contentPane.add(chckbx2);
		
		JCheckBox chckbx3 = new JCheckBox("Object Oriented Programming");
		chckbx3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbx3.isSelected()) {
					FileWriter fw = null;
					try {
						fw = new FileWriter("courses.txt",true);
					} catch (IOException e1) {
						e1.printStackTrace();
						
					}
					PrintWriter out = new PrintWriter(fw);
					out.println("Object Oriented Programming");
					out.close();
					}
				
			}
		});
		chckbx3.setBounds(22, 117, 236, 23);
		contentPane.add(chckbx3);
		
		JCheckBox chckbx4 = new JCheckBox("Network Design & Management");
		chckbx4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbx4.isSelected()) {
					FileWriter fw = null;
					try {
						fw = new FileWriter("courses.txt",true);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			        PrintWriter out = new PrintWriter(fw);

			        out.println("Network Design & Management");
			        out.close();
				}
			}
		});
		chckbx4.setBounds(22, 157, 250, 23);
		contentPane.add(chckbx4);
		
		JCheckBox chckbx5 = new JCheckBox("Operating Systems");
		chckbx5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbx5.isSelected()) {
					FileWriter fw = null;
					try {
						fw = new FileWriter("courses.txt",true);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			        PrintWriter out = new PrintWriter(fw);

			        out.println("Operating Systems");
			        out.close();
				}
			}
		});
		chckbx5.setBounds(22, 199, 196, 23);
		contentPane.add(chckbx5);
		
		JLabel lblNewLabel_5 = new JLabel("COHORTS");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(319, 11, 89, 14);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton rdbtn1 = new JRadioButton("JAN INTAKE");
		rdbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtn1.isSelected()) {
					
					FileWriter fw = null;
					try {
						fw = new FileWriter("courses.txt",true);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			        PrintWriter out = new PrintWriter(fw);

			        out.println("JANUARY INTAKE");
			        out.close();
					
				}
			}
		});
		rdbtn1.setBounds(319, 59, 111, 23);
		contentPane.add(rdbtn1);
		
		JRadioButton rdbtn2 = new JRadioButton("MAY INTAKE");
		rdbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                        if(rdbtn2.isSelected()) {
					
					FileWriter fw = null;
					try {
						fw = new FileWriter("courses.txt",true);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			        PrintWriter out = new PrintWriter(fw);

			        out.println("MAY INTAKE");
			        out.close();
					
				}
			}
		});
		rdbtn2.setBounds(319, 117, 111, 23);
		contentPane.add(rdbtn2);
		
		JRadioButton rdbtn3 = new JRadioButton("SEP INTAKE");
		rdbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                        if(rdbtn3.isSelected()) {
					
					FileWriter fw = null;
					try {
						fw = new FileWriter("courses.txt",true);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			        PrintWriter out = new PrintWriter(fw);

			        out.println("SEPTEMBER INTAKE");
			        out.close();
					
				}
			}
		});
		rdbtn3.setBounds(319, 176, 111, 23);
		contentPane.add(rdbtn3);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Report itemloader = new Report();
                itemloader.setVisible(true);
			}
		});
		btnSubmit.setBounds(39, 259, 89, 23);
		contentPane.add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 chckbx1.setSelected(false); 
	             chckbx2.setSelected(false);
	             chckbx3.setSelected(false);
	             chckbx4.setSelected(false);
	             chckbx5.setSelected(false);
	             
	             rdbtn1.setSelected(false);
	             rdbtn2.setSelected(false);
	             rdbtn3.setSelected(false);
	             
			}
		});
		btnCancel.setBounds(202, 259, 89, 23);
		contentPane.add(btnCancel);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			
			private JFrame frmModules;
			
		
			public void actionPerformed(ActionEvent e) {
				
				frmModules = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmModules, "Do you really want to exit?", "Modules Form",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
					
			}
			
		}});
		btnExit.setBounds(364, 259, 89, 23);
		contentPane.add(btnExit);
	}

}
