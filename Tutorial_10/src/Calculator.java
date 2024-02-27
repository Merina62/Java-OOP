import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Point;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Insets;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("Input no 1");
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl1.setBounds(132, 88, 95, 36);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("Input no 2");
		lbl2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl2.setBounds(132, 175, 95, 36);
		contentPane.add(lbl2);
		
		txt1 = new JTextField();
		txt1.setBounds(256, 88, 252, 41);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(256, 178, 252, 36);
		contentPane.add(txt2);
		
		JButton Addition = new JButton("Addition");
		Addition.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Addition.setAlignmentX(Component.RIGHT_ALIGNMENT);
		Addition.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		Addition.setBackground(new Color(119, 136, 153));
		Addition.setForeground(new Color(139, 69, 19));
		Addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a1= Integer.parseInt(txt1.getText());
				int a2= Integer.parseInt(txt2.getText());
				int a3= a1+ a2;
				result.setText(String.valueOf(a3));
			}
			
		});
		Addition.setBounds(168, 276, 124, 36);
		contentPane.add(Addition);
		
		JButton Subtrsction = new JButton("Subtraction");
		Subtrsction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a1= Integer.parseInt(txt1.getText());
				int a2= Integer.parseInt(txt2.getText());
				int a3= a1- a2;
				result.setText(String.valueOf(a3));
			}
		});
		Subtrsction.setBackground(new Color(119, 136, 153));
		Subtrsction.setForeground(new Color(128, 0, 0));
		Subtrsction.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		Subtrsction.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Subtrsction.setBounds(353, 279, 124, 31);
		contentPane.add(Subtrsction);
		
		JLabel Result = new JLabel("Result");
		Result.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Result.setBounds(153, 386, 73, 36);
		contentPane.add(Result);
		
		result = new JTextField();
		result.setBounds(239, 385, 162, 41);
		contentPane.add(result);
		result.setColumns(10);
	}
}
