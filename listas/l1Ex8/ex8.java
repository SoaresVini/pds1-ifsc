package l1Ex8;

import java.util.ArrayList;
import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		ArrayList<String> lista = new ArrayList<>();

		System.out.println("Elementos da lista ");

		for (int i = 0; i < 10; i++) {
			lista.add(s.nextLine());
		}

		for (String string : lista) {
			System.out.println(string);
		}

		System.out.println("tamanho da lista:" + lista.size());
		System.out.println("Ultimo elemento:" + lista.get(lista.size() - 1));

	}

}
