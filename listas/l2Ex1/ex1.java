package l2Ex1;

import javax.swing.JOptionPane;

public class ex1 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Escreva seu nome: ");

		if (!name.isEmpty()) {
			JOptionPane.showMessageDialog(null, name);
		} else {
			JOptionPane.showMessageDialog(null, "TEM PARADA ERRADA AII");
		}
	}
}