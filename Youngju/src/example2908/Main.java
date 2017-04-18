package example2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String[] line = br.readLine().split(" ");
			int A = 0;
			int B = 0;
			A = check(line[0]);
			B = check(line[1]);

			if (A > B)
				System.out.println(A);
			else
				System.out.println(B);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int check(String num) {
		int result = 0;
		int number = Integer.parseInt(num);
		result += number / 100;
		result += (number % 100) / 10 * 10;
		result += (number % 10) * 100;
		return result;
	}
}
