package Login_Frm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.awt.event.ActionEvent;

public class Report extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField project1;
	private JTextField project2;
	private JTextField project3;
	private JTextField project4;
	private JTextField project5;
	private JTextField textField_10;
	private JLabel lblNewLabel_6;
	private JTextField lab1;
	private JTextField lab2;
	private JTextField lab3;
	private JTextField lab4;
	private JTextField lab5;
	private JLabel lblNewLabel_7;
	private JTextField quiz1;
	private JTextField quiz2;
	private JTextField quiz3;
	private JTextField quiz4;
	private JTextField quiz5;
	private JTextField grade1;
	private JTextField grade2;
	private JTextField grade3;
	private JTextField grade4;
	private JTextField grade5;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Report frame = new Report();
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
	public Report() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REPORTS");
		lblNewLabel.setBounds(190, 11, 189, 24);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("COURSE");
		lblNewLabel_1.setBounds(10, 104, 67, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("STUDENT NAME");
		lblNewLabel_2.setBounds(10, 55, 113, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PROJECT (50%)");
		lblNewLabel_3.setBounds(546, 106, 100, 14);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Data Science");
		lblNewLabel_5.setBounds(10, 129, 76, 23);
		lblNewLabel_5.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_1_1 = new JLabel("Automata Theory");
		lblNewLabel_1_1.setBounds(10, 152, 100, 28);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Object Oriented Programming");
		lblNewLabel_2_1.setBounds(10, 191, 189, 23);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Network Design & Management\r\n");
		lblNewLabel_3_1.setBounds(10, 225, 189, 23);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Operating Systems");
		lblNewLabel_4_1.setBounds(10, 259, 150, 23);
		contentPane.add(lblNewLabel_4_1);
		
		project1 = new JTextField();
		project1.setBounds(546, 131, 86, 20);
		contentPane.add(project1);
		project1.setColumns(10);
		
		project2 = new JTextField();
		project2.setBounds(546, 158, 86, 20);
		contentPane.add(project2);
		project2.setColumns(10);
		
		project3 = new JTextField();
		project3.setBounds(546, 194, 86, 20);
		contentPane.add(project3);
		project3.setColumns(10);
		
		project4 = new JTextField();
		project4.setBounds(545, 228, 86, 20);
		contentPane.add(project4);
		project4.setColumns(10);
		
		project5 = new JTextField();
		project5.setBounds(546, 262, 86, 20);
		contentPane.add(project5);
		project5.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(159, 53, 264, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		JButton Print = new JButton("PRINT");
		Print.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PrinterJob job = PrinterJob.getPrinterJob();
	            job.setJobName("Print Data");
	            
	            job.setPrintable(new Printable(){
	            public int print(Graphics pg,PageFormat pf, int pageNum){
	                    pf.setOrientation(PageFormat.LANDSCAPE);
	                 if(pageNum>0){
	                    return Printable.NO_SUCH_PAGE;
	                }
	                
	                Graphics2D g2 = (Graphics2D)pg;
	                g2.translate(pf.getImageableX(), pf.getImageableY());
	                g2.scale(0.24,0.24);
	                
	                contentPane.paint(g2);
//	          
	               
	                return Printable.PAGE_EXISTS;
	                         
	                
	            }
	    });
	         
	        boolean ok = job.printDialog();
	        if(ok){
	        try{
	            
	        job.print();
	        }
	        catch (PrinterException ex){}
	        }
			
			}
		});
		Print.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		Print.setBounds(382, 328, 89, 23);
		contentPane.add(Print);
		
		lblNewLabel_6 = new JLabel("LAB TEST(40%)");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(416, 106, 106, 14);
		contentPane.add(lblNewLabel_6);
		
		lab1 = new JTextField();
		lab1.setColumns(10);
		lab1.setBounds(416, 131, 86, 20);
		contentPane.add(lab1);
		
		lab2 = new JTextField();
		lab2.setColumns(10);
		lab2.setBounds(416, 158, 86, 20);
		contentPane.add(lab2);
		
		lab3 = new JTextField();
		lab3.setColumns(10);
		lab3.setBounds(416, 194, 86, 20);
		contentPane.add(lab3);
		
		lab4 = new JTextField();
		lab4.setColumns(10);
		lab4.setBounds(415, 228, 86, 20);
		contentPane.add(lab4);
		
		lab5 = new JTextField();
		lab5.setColumns(10);
		lab5.setBounds(416, 262, 86, 20);
		contentPane.add(lab5);
		
		lblNewLabel_7 = new JLabel("QUIZ(10%)");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setBounds(293, 106, 74, 14);
		contentPane.add(lblNewLabel_7);
		
		quiz1 = new JTextField();
		quiz1.setColumns(10);
		quiz1.setBounds(293, 131, 86, 20);
		contentPane.add(quiz1);
		
		quiz2 = new JTextField();
		quiz2.setColumns(10);
		quiz2.setBounds(293, 158, 86, 20);
		contentPane.add(quiz2);
		
		quiz3 = new JTextField();
		quiz3.setColumns(10);
		quiz3.setBounds(293, 194, 86, 20);
		contentPane.add(quiz3);
		
		quiz4 = new JTextField();
		quiz4.setColumns(10);
		quiz4.setBounds(292, 228, 86, 20);
		contentPane.add(quiz4);
		
		quiz5 = new JTextField();
		quiz5.setColumns(10);
		quiz5.setBounds(293, 262, 86, 20);
		contentPane.add(quiz5);
		
		grade1 = new JTextField();
		grade1.setColumns(10);
		grade1.setBounds(677, 131, 86, 20);
		contentPane.add(grade1);
		
		grade2 = new JTextField();
		grade2.setColumns(10);
		grade2.setBounds(677, 158, 86, 20);
		contentPane.add(grade2);
		
		grade3 = new JTextField();
		grade3.setColumns(10);
		grade3.setBounds(677, 194, 86, 20);
		contentPane.add(grade3);
		
		grade4 = new JTextField();
		grade4.setColumns(10);
		grade4.setBounds(676, 228, 86, 20);
		contentPane.add(grade4);
		
		grade5 = new JTextField();
		grade5.setColumns(10);
		grade5.setBounds(677, 262, 86, 20);
		contentPane.add(grade5);
		
		btnNewButton_1 = new JButton("GRADE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				String Quiz1 = quiz1.getText();
				String Lab1 = lab1.getText();
				String Project1 = project1.getText();
				
				
				String Grade1 = String.valueOf(Integer.parseInt(Quiz1) + Integer.parseInt(Lab1) + Integer.parseInt(Project1));
				
				
				grade1.setText(Grade1); 
				System.out.print(Grade1);
				//com1.setText("A");
				
				
				String Quiz2= quiz2.getText();
				String Lab2= lab2.getText();
				String Project2=project2.getText();
				
				String Grade2= String.valueOf(Integer.parseInt(Quiz2)+ Integer.parseInt(Lab2)+ Integer.parseInt(Project2));
				
				
				grade2.setText(Grade2);
				
				String Quiz3 = quiz3.getText();
				String Lab3 = lab3.getText();
				String Project3 = project3.getText();
				
				String Grade3= String.valueOf(Integer.parseInt(Quiz3)+ Integer.parseInt(Lab3)+ Integer.parseInt(Project3));
				
				
				grade3.setText(Grade3);
				
				String Quiz4 = quiz4.getText();
				String Lab4 = lab4.getText();
				String Project4 = project4.getText();
				
				String Grade4 = String.valueOf(Integer.parseInt(Quiz4)+ Integer.parseInt(Lab4)+ Integer.parseInt(Project4));
				
				
				grade4.setText(Grade4);
				
				String Quiz5 = quiz5.getText();
				String Lab5 = lab5.getText();
				String Project5 = project5.getText();
				
				String Grade5= String.valueOf(Integer.parseInt(Quiz5)+ Integer.parseInt(Lab5)+ Integer.parseInt(Project5));
				
				
				grade5.setText(Grade5);
			    
			}
			
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_1.setBounds(677, 101, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
