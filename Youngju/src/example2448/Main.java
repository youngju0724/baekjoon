package example2448;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static char[][] charArr;

	public static void recursive(int cnt, int X, int Y) {
		if (cnt == 3) {
			charArr[X][Y] = '*';
			charArr[X + 1][Y + 1] = '*';
			charArr[X + 1][Y - 1] = '*';
			charArr[X + 2][Y] = '*';
			charArr[X + 2][Y + 1] = '*';
			charArr[X + 2][Y + 2] = '*';
			charArr[X + 2][Y - 1] = '*';
			charArr[X + 2][Y - 2] = '*';
			return;
		}

		int mod = cnt / 2;
		recursive(mod, X, Y);
		recursive(mod, X + mod, Y + mod);
		recursive(mod, X + mod, Y - mod);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		charArr = new char[N][N * 2];

		for (int i = 0; i < charArr.length; i++) {
			Arrays.fill(charArr[i], ' ');
		}
		recursive(N, 0, N - 1);

		for (int i = 0; i < N; i++) {
			System.out.println(charArr[i]);
		}
		sc.close();
	}
}
