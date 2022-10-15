package l2Ex2;

import javax.swing.JOptionPane;

public class ex2 {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("Escreva o seu nome: ");
		String id = JOptionPane.showInputDialog("Escreva a idade: ");

		if (!name.isEmpty() && !id.isEmpty()) {

			Integer idade = Integer.valueOf(id);

			JOptionPane.showMessageDialog(null, name + " tem " + idade + " anos");
		} else {
			JOptionPane.showMessageDialog(null, "TEM PARADA ERRADA AII");
		}

	}

}
