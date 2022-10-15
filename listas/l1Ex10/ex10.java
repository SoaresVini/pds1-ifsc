package l1Ex10;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Integer n1, n2, n3;

		System.out.println("Escreva a primeira nota: ");
		n1 = Integer.valueOf(s.nextLine());

		System.out.println("Escreva a segunda nota: ");
		n2 = Integer.valueOf(s.nextLine());

		System.out.println("Escreva a terceira nota: ");
		n3 = Integer.valueOf(s.nextLine());

		float media = calMedia(n1, n2, n3);

		System.out.println("A media do aluno � " + media);

		if (media >= 6) {
			System.out.println("Aprovado");
		}
		if (media >= 4 && media < 6) {
			System.out.println("Recupera��o");
		}
		if (media < 4) {
			System.out.println("Reprovado");
		}

	}

	public static int calMedia(int n1, int n2, int n3) {

		float media = (n1 + n2 + n3) / 3;

		return (int) media;

	}

}
