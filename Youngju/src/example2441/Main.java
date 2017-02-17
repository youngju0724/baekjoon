package example2441;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < num; i++) {
			for (int k = i; k > 0; k--) {
				sb.append(" ");
			}
			for (int j = num - i; j > 0; j--) {
				sb.append("*");
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}
}
