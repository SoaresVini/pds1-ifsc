package pratica1Anp;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

public class pratica1Anp extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	String texto = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pratica1Anp frame = new pratica1Anp();
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
	public pratica1Anp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 473, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox<String> cbPr = new JComboBox<>();
		cbPr.setBounds(90, 12, 89, 24);
		contentPane.add(cbPr);
		
		cbPr.addItem("");
		cbPr.addItem("Sr.");
		cbPr.addItem("Sra.");
		
		
		
		JLabel lblNewLabel = new JLabel("Pronome:");
		lblNewLabel.setBounds(12, 17, 70, 15);
		contentPane.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(77, 50, 227, 19);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(77, 81, 182, 19);
		contentPane.add(txtCpf);
		
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setBounds(22, 50, 70, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CPF:");
		lblNewLabel_1_1.setBounds(42, 81, 40, 15);
		contentPane.add(lblNewLabel_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 112, 411, 154);
		contentPane.add(scrollPane);
		
		JTextPane taAdd = new JTextPane();
		scrollPane.setViewportView(taAdd);
		
				
	
		
		JButton btDel = new JButton("Limpar");
		btDel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				taAdd.setText("");
				
			}
		});
		btDel.setBounds(321, 27, 117, 25);
		contentPane.add(btDel);
		
		JLabel lblErro = new JLabel("");
		lblErro.setBounds(42, 278, 411, 15);
		contentPane.add(lblErro);
		
		JLabel lblErro_1 = new JLabel("");
		lblErro_1.setBounds(42, 305, 411, 15);
		contentPane.add(lblErro_1);
		
		JButton btAdd = new JButton("Adicionar");
		btAdd.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
		
				String cpf = txtCpf.getText();
				String nome = txtNome.getText();
				String pronome = cbPr.getSelectedItem().toString();
				
				if(pronome.length() == 0 || cpf.length() == 0  || nome.length() == 0 ) {
					JOptionPane.showMessageDialog(null,"Alguns dados não foram informados");
					
				}
				
				else if(cpf.length() < 11 || cpf.length() > 11) {
					
					lblErro.setText("CPF Invalido");
					
					if (nome.length()<3) {
						
						lblErro.setText("CPF Invalido");
						lblErro_1.setText("Nome Invalido");
					}
					
				}
				
	
				else {
				texto = texto + cbPr.getSelectedItem().toString() +txtNome.getText()+" cujo o CPF é "+txtCpf.getText()+"\n";
				taAdd.setText(texto);
				txtNome.setText("");
				txtCpf.setText("");
				lblErro.setText("");
				lblErro_1.setText("");
				}
				
				
			}
		});

		btAdd.setBounds(321, 66, 117, 25);
		contentPane.add(btAdd);
		

	}
}
