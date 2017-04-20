package example8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int num = Integer.parseInt(br.readLine());

			for (int i = 0; i < num; i++) {
				char[] array = br.readLine().toCharArray();

				int score = 0;
				int count = 0;
				for (int j = 0; j < array.length; j++) {

					if (array[j] == 'O') {
						count++;
						score += count;
					} else {
						count = 0;
					}
				}
				System.out.println(score);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
