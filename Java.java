package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Java extends JFrame {

	private JPanel contentPane;
	private JTextField txtJavaInstaller;
	private JTextField txtWwwjavacom;
	private JTextField txtInfinity;
	private JTextField txtthNovember;
	private JLabel lblRealeaseinfo;
	private JScrollPane scrollPane;
	private JTextArea Releaseta;
	private JButton btnCheck;
	private JButton btnExit;
	private JButton btnAbout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Java frame = new Java();
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
	public Java() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Java.class.getResource("/rescource/infinity_128.png")));
		
		initComponents();
		createEvent();
		
	}
	
	private void initComponents() {
		setTitle("JAVA INSTALLER");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 544);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblProgram = new JLabel("PROGRAM:");
		lblProgram.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		txtJavaInstaller = new JTextField();
		txtJavaInstaller.setEditable(false);
		txtJavaInstaller.setText("JAVA INSTALLER JDK");
		txtJavaInstaller.setColumns(10);
		
		JLabel lblHompepage = new JLabel("HOMPE-PAGE:");
		lblHompepage.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		txtWwwjavacom = new JTextField();
		txtWwwjavacom.setEditable(false);
		txtWwwjavacom.setText("www.java.com");
		txtWwwjavacom.setColumns(10);
		
		JLabel lblCracker = new JLabel("CRACKER:");
		lblCracker.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		txtInfinity = new JTextField();
		txtInfinity.setEditable(false);
		txtInfinity.setText("INFINITY");
		txtInfinity.setColumns(10);
		
		JLabel lblReleased = new JLabel("RELEASED:");
		lblReleased.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		txtthNovember = new JTextField();
		txtthNovember.setEditable(false);
		txtthNovember.setText("4th November 2018");
		txtthNovember.setColumns(10);
		
		lblRealeaseinfo = new JLabel("Realease_Info:");
		lblRealeaseinfo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		scrollPane = new JScrollPane();
		
		btnAbout = new JButton("ABOUT");
		
		btnCheck = new JButton("CHECK");
		
		
		btnExit = new JButton("EXIT");
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
								.addGap(20)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(lblRealeaseinfo)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblReleased)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(txtthNovember, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblCracker)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(txtInfinity, GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblHompepage)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(txtWwwjavacom, GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblProgram)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(txtJavaInstaller, GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(129)
							.addComponent(btnAbout, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(btnCheck, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(btnExit, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
							.addGap(62)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE, false)
						.addComponent(lblProgram)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(2)
							.addComponent(txtJavaInstaller, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHompepage)
						.addComponent(txtWwwjavacom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCracker)
						.addComponent(txtInfinity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblReleased)
						.addComponent(txtthNovember, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addComponent(lblRealeaseinfo)
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAbout, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnCheck, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnExit)))
		);
		
		Releaseta = new JTextArea();
		Releaseta.setText("         ========================\r\n          Enjoy this new release\r\n         ========================");
		Releaseta.setBackground(new Color(0, 102, 0));
		Releaseta.setEditable(false);
		scrollPane.setViewportView(Releaseta);
		contentPane.setLayout(gl_contentPane);
		
	}

	private void createEvent() {
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About about= new About();
				about.setModal(true);
				about.setVisible(true);
			}
		});
		
		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice=JOptionPane.showConfirmDialog(null, "Are sure you want to exit");
				if(choice==JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String version =System .getProperty("java.version");
				String runtime =System.getProperty("java.runtime.version");
				String home=System.getProperty("java.home");
				String vendor=System.getProperty("java.vendor");
				String url=System.getProperty("java.vendor.url");
				String patch=System.getProperty("java.class.patch");
	 
				Releaseta.setText("\t==Checking java->->==\n" + "\nJava Version: "+version +" === done\n" + "\nJava Runtime Version: "+runtime+" === done\n" +"\nJava Home: "+home+" ===done\n"+"\nJava Vendor: "+vendor+" ===done\n"+"\nJava Vendor URL: "+url+" ===done\n"
						+"\nJava Class Patch: " + patch +" ===done\n"+ "\n"+"\t==Checking Done==\n");
				btnCheck.setEnabled(false);
					
			}
		});
		
	}
}
