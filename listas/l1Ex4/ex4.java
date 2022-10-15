package l1Ex4;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			System.out.println("Digite um numero: ");

			String num = s.nextLine();
			Integer x = Integer.valueOf(num);

			System.out.println(x);
		}

	}
}