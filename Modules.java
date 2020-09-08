package Login_Frm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Modules {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modules window = new Modules();
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
	public Modules() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 552, 347);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblModules = new JLabel("LEARNING MODULES");
		lblModules.setBounds(0, 11, 196, 14);
		lblModules.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblModules);
		
		JLabel lblNewLabel = new JLabel("Data Science");
		lblNewLabel.setBounds(10, 35, 76, 23);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Automata Theory");
		lblNewLabel_1.setBounds(10, 60, 100, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		JCheckBox chckbx1 = new JCheckBox("");
		chckbx1.setBounds(221, 35, 21, 23);
		frame.getContentPane().add(chckbx1);
		
		JCheckBox chckbx2 = new JCheckBox("");
		chckbx2.setBounds(221, 65, 21, 23);
		frame.getContentPane().add(chckbx2);
		
		JLabel lblNewLabel_2 = new JLabel("Object Oriented Programming");
		lblNewLabel_2.setBounds(10, 99, 150, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		JCheckBox chckbx3 = new JCheckBox("");
		chckbx3.setBounds(221, 99, 21, 23);
		frame.getContentPane().add(chckbx3);
		
		JLabel lblNewLabel_3 = new JLabel("Network Design & Management\r\n");
		lblNewLabel_3.setBounds(10, 133, 166, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		JCheckBox chckbx4 = new JCheckBox("");
		chckbx4.setBounds(221, 133, 21, 23);
		frame.getContentPane().add(chckbx4);
		
		JCheckBox chckbx5 = new JCheckBox("\r\n");
		chckbx5.setBounds(221, 168, 21, 23);
		frame.getContentPane().add(chckbx5);
		
		JLabel lblNewLabel_4 = new JLabel("Operating Systems");
		lblNewLabel_4.setBounds(10, 168, 100, 23);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(39, 257, 89, 23);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Report itemloader = new Report();
                itemloader.setVisible(true);
			}
		});
		frame.getContentPane().add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(202, 257, 89, 23);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				            chckbx1.setSelected(false); 
				             chckbx2.setSelected(false);
				             chckbx3.setSelected(false);
				             chckbx4.setSelected(false);
				             chckbx5.setSelected(false);
				             
			}
		});
		frame.getContentPane().add(btnCancel);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(362, 257, 89, 23);
		btnExit.addActionListener(new ActionListener() {
			
			private JFrame frmModules;
			
			public void actionPerformed(ActionEvent e) {
				frmModules = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmModules, "Do you really want to exit?", "Modules Form",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				
			}
		}});
		frame.getContentPane().add(btnExit);
		
		JLabel lblNewLabel_5 = new JLabel("COHORTS");
		lblNewLabel_5.setBounds(319, 11, 89, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("JAN INTAKE");
		lblNewLabel_6.setBounds(277, 44, 89, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("MAY INTAKE");
		lblNewLabel_7.setBounds(277, 108, 68, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("SEP INTAKE");
		lblNewLabel_8.setBounds(277, 172, 76, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setBounds(387, 35, 21, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("");
		rdbtnNewRadioButton_1.setBounds(387, 99, 21, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("");
		rdbtnNewRadioButton_2.setBounds(387, 168, 21, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
