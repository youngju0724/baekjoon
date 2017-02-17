package example2439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= line - i; j++) {
				sb.append(" ");
			}
			for (int k = 1; k <= i; k++) {
				sb.append("*");
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}
}
