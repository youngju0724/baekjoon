package example2839;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int a = n / 5;
		int b = n - a * 5;

		while (a >= 0) {
			b = n - a * 5;

			if ((b) % 3 == 0) {
				System.out.println(a + (b) / 3);
				System.exit(0);
			} else {
				a--;
			}
		}
		System.out.println(-1);
	}
}