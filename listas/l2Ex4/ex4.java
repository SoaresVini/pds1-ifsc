package l2Ex4;

import javax.swing.JOptionPane;

public class ex4 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			String n = JOptionPane.showInputDialog("Escreva um numero:");

			if (!n.isEmpty()) {
				Integer num = Integer.valueOf(n);
				JOptionPane.showMessageDialog(null, num);

			} else {
				i = i - 1;
				JOptionPane.showMessageDialog(null, "valor invalido");
			}

		}
	}
}
