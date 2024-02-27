import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Cursor;
import javax.swing.DropMode;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.Rectangle;
import javax.swing.JPasswordField;
import java.awt.ComponentOrientation;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.BevelBorder;
import javax.swing.JEditorPane;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ItemEvent;

public class Form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Foremail;
	private JPasswordField passwordfield;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	String Roles;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form frame = new Form();
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
	public Form() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 557);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(228, 225, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Foremail = new JTextField();
		Foremail.setBorder(new LineBorder(new Color(0, 0, 0)));
		Foremail.setName("Email");
		Foremail.setSelectionColor(new Color(128, 64, 0));
		Foremail.setToolTipText("");
		Foremail.setDropMode(DropMode.INSERT);
		Foremail.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Foremail.setBounds(139, 113, 305, 31);
		contentPane.add(Foremail);
		Foremail.setColumns(10);
		
		
		
		JLabel Login = new JLabel("Login");
		Login.setAlignmentY(Component.TOP_ALIGNMENT);
		Login.setLabelFor(this);
		Login.setHorizontalAlignment(SwingConstants.RIGHT);
		Login.setForeground(new Color(64, 0, 64));
		Login.setFont(new Font("Serif", Font.BOLD, 35));
		Login.setBounds(179, 41, 109, 39);
		contentPane.add(Login);
		
		passwordfield = new JPasswordField();
		passwordfield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		passwordfield.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		passwordfield.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		passwordfield.setBounds(139, 175, 305, 31);
		contentPane.add(passwordfield);
		

		
		JButton btnNewButton = new JButton("login");
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name= Foremail.getText();
				String password=passwordfield.getText();
				try(Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/tutorial","root","");
		                Statement stmt=conn.createStatement();
		        ){
					PreparedStatement ps=conn.prepareStatement("Insert into Login (Email,Password,Roles) values( ?,?,?)");
		           ps.setString(1, Foremail.getText());
		           ps.setString(2, passwordfield.getText());
		           ps.setString(3, Roles);
		            int z=ps.executeUpdate();
		            if(z>0)
		            	JOptionPane.showMessageDialog(null, "Records Inserted Successfully");
		            else
		            	JOptionPane.showMessageDialog(null, "Error");
		        }catch(SQLException ex) {
		            ex.printStackTrace();
		        }
		        
			} 
		});
		

		
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(new Color(135, 191, 248));
		btnNewButton.setBounds(201, 384, 121, 39);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("Email");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(51, 110, 67, 31);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(39, 176, 90, 22);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				Roles= comboBox.getSelectedItem().toString();
			}
		});
		comboBox.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Choose Role", "Admin", "User"}));
		comboBox.setBounds(139, 246, 305, 31);
		contentPane.add(comboBox);
		
		JButton btnNewButton_1 = new JButton("Signup");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Signup sgn= new Signup();
				sgn.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1.setBounds(51, 384, 103, 39);
		contentPane.add(btnNewButton_1);
	}
}
