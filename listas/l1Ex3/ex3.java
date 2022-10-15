package l1Ex3;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		String num = s.nextLine();

		Integer x = Integer.valueOf(num);

		if (x % 2 == 0) {

			System.out.println("Numero é par");

		} else {

			System.out.println("Numero é impar");

		}

	}

}