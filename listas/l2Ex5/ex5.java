package l2Ex5;

import javax.swing.JOptionPane;

public class ex5 {

	public static void main(String[] args) {
		Integer vet[] = new Integer[10];
		Integer max = Integer.MIN_VALUE;
		Integer min = Integer.MAX_VALUE;

		for (int i = 0; i < 10; i++) {

			String n = JOptionPane.showInputDialog("Escreva um numero:");

			if (!n.isEmpty()) {
				Integer num = Integer.valueOf(n);
				vet[i] = num;

				if (vet[i] > max) {
					max = num;
				}
				if (vet[i] < min) {
					min = num;
				}
			} else {
				i = i - 1;
				JOptionPane.showMessageDialog(null, "valor invalido");
			}
		}
		JOptionPane.showMessageDialog(null, "o maior numero �: " + max);
		JOptionPane.showMessageDialog(null, "o menor numero �: " + min);

	}
}
