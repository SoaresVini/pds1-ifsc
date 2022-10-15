package ex02;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class ex02 extends JFrame {

	private JPanel contentPane;
	private JTextField ladoA;
	private JTextField ladoB;
	private JTextField ladoC;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex02  frame = new ex02 ();
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
	public ex02 () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 233, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		ladoA = new JTextField();
		ladoA.setBounds(79, 29, 126, 20);
		contentPane.add(ladoA);
		ladoA.setColumns(10);

		ladoB = new JTextField();
		ladoB.setBounds(79, 60, 126, 20);
		contentPane.add(ladoB);
		ladoB.setColumns(10);

		ladoC = new JTextField();
		ladoC.setBounds(79, 91, 126, 20);
		contentPane.add(ladoC);
		ladoC.setColumns(10);

		JButton comparacao = new JButton("Compare");
		comparacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sLadoA = ladoA.getText();
				String sLadoB = ladoB.getText();
				String sLadoC = ladoC.getText();

				Integer nLadoA = Integer.valueOf(sLadoA);
				Integer nLadoB = Integer.valueOf(sLadoB);
				Integer nLadoC = Integer.valueOf(sLadoC);

				if (nLadoA == nLadoB && nLadoA == nLadoC && nLadoB == nLadoC) {
					JOptionPane.showMessageDialog(null, "triângulo equilátero");
				} else if (nLadoA == nLadoB || nLadoC == nLadoB || nLadoA == nLadoC) {
					JOptionPane.showMessageDialog(null, "isósceles");
				} else if (nLadoA != nLadoB && nLadoC != nLadoB && nLadoA != nLadoC) {
					JOptionPane.showMessageDialog(null, "escaleno");
				}
			}

		});
		comparacao.setBounds(89, 122, 107, 30);
		contentPane.add(comparacao);

		JLabel lblNewLabel = new JLabel("Lado A:");
		lblNewLabel.setBounds(10, 29, 65, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Lado B :");
		lblNewLabel_1.setBounds(10, 60, 98, 14);
		contentPane.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("Lado C:");
		lblNewLabel_2.setBounds(10, 91, 98, 14);
		contentPane.add(lblNewLabel_2);
	}
}