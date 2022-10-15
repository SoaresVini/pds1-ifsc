package l2Ex7;

import javax.swing.JOptionPane;

public class ex7 {

	public static void main(String[] args) {

		String n1 = JOptionPane.showInputDialog("Escreva a primeira nota:");

		String n2 = JOptionPane.showInputDialog("Escreva a segunda  nota:");

		String n3 = JOptionPane.showInputDialog("Escreva a terceira nota:");

		if (!n1.isEmpty() && !n1.isEmpty() && !n1.isEmpty()) {
			Double nota1 = Double.valueOf(n1);
			Double nota2 = Double.valueOf(n2);
			Double nota3 = Double.valueOf(n3);
			Double media = calcMedia(nota1, nota2, nota3);

			if (media >= 6) {
				JOptionPane.showMessageDialog(null, "Sua media �: " + Math.round(media) + "\nvoc� foi aprovado");
			}
			if (media >= 4 && media < 6) {
				JOptionPane.showMessageDialog(null, "Sua media �: " + Math.round(media) + "\nvoc� ficou Recuperas�o");
			}
			if (media < 4) {
				JOptionPane.showMessageDialog(null, "Sua media �: " + Math.round(media) + "\nvoc� foi Reprovado");
			}

		} else {
			JOptionPane.showMessageDialog(null, "TEM PARADA ERRADA AII");
		}
	}

	private static Double calcMedia(Double nota1, Double nota2, Double nota3) {
		return (nota1 + nota2 + nota3) / 3;
	}

}
