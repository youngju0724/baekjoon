package example11721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		for (int i = 0; i < line.length(); i++) {
			if (i % 10 == 0 && i / 10 != 0) {
				System.out.println();
			}
			System.out.print(line.charAt(i));
		}
	}
}
