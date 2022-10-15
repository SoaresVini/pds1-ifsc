package l1Ex2;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Escreva seu nome: ");
		String nome = s.nextLine();

		System.out.println("Escreva sua idade: ");
		String id = s.nextLine();

		Integer x = Integer.valueOf(id);
		System.out.println(nome + " tem " + x + " anos");

	}
}
