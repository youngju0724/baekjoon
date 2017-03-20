package example10039;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int num = 0;
		try {
			for (int i = 0; i < 5; i++) {
				num = Integer.parseInt(br.readLine());

				if (num < 40) {
					sum += 40;
				} else {
					sum += num;
				}
			}
			System.out.println(sum / 5);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
