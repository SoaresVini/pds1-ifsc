package l2Ex6;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ex6 {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<>();

		for (int i = 0; i < 5; i++) {

			lista.add(JOptionPane.showInputDialog("Escreva qualquer Elemento: "));
		}

		for (String string : lista) {
			JOptionPane.showMessageDialog(null, lista);
		}

	}
}
