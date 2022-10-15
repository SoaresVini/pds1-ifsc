package pratica01;

/**
 * @author Vinicius Soares
 * @date 15/10/2022
 * 
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pratica01 extends JFrame {

	private JPanel contentPane;
	private JTextField txtnum1;
	private JTextField txtnum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pratica01 frame = new pratica01();
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
	public pratica01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 289, 175);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSoma = new JButton("soma");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String text1 = txtnum1.getText();
				String text2 = txtnum2.getText();
				
				if(!text1.isEmpty() && !text2.isEmpty()) {
					Double n1 = Double.valueOf(text1);
					Double n2 = Double.valueOf(text2);
					
					JOptionPane.showMessageDialog(null, n1+n2);
				}
			}
		});
		btnSoma.setBounds(10, 68, 225, 23);
		contentPane.add(btnSoma);
		
		txtnum2 = new JTextField();
		txtnum2.setBounds(124, 37, 86, 20);
		contentPane.add(txtnum2);
		txtnum2.setColumns(10);
		
		txtnum1 = new JTextField();
		txtnum1.setBounds(124, 11, 86, 20);
		contentPane.add(txtnum1);
		txtnum1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Numero 1:");
		lblNewLabel.setBounds(35, 14, 79, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNumero = new JLabel("Numero 2:");
		lblNumero.setBounds(35, 40, 79, 14);
		contentPane.add(lblNumero);
	}

}