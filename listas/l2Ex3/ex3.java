package l2Ex3;

import javax.swing.JOptionPane;

public class ex3 {

	public static void main(String[] args) {
		String precoLitro = JOptionPane.showInputDialog("Valor do litro da gasolina:");
		String quantidadeLitro = JOptionPane.showInputDialog("Quantidade de litro:");

		if (!precoLitro.isEmpty() && !quantidadeLitro.isEmpty()) {
			Double pL = Double.valueOf(precoLitro);
			Double qL = Double.valueOf(quantidadeLitro);

			JOptionPane.showInternalMessageDialog(null, "valor totar a pagar Ã© " + pL * qL);
		} else {
			JOptionPane.showMessageDialog(null, "TEM PARADA ERRADA AII");
		}

	}
}