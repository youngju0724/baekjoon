package example5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String line = br.readLine();
			char[] lines = line.toCharArray();
			int[] phone = new int[91];
			int time = 0;

			phone['A'] = phone['B'] = phone['C'] = 3;
			phone['D'] = phone['E'] = phone['F'] = 4;
			phone['G'] = phone['H'] = phone['I'] = 5;
			phone['J'] = phone['K'] = phone['L'] = 6;
			phone['M'] = phone['N'] = phone['O'] = 7;
			phone['P'] = phone['Q'] = phone['R'] = phone['S'] = 8;
			phone['T'] = phone['U'] = phone['V'] = 9;
			phone['W'] = phone['X'] = phone['Y'] = phone['Z'] = 10;

			for (int i = 0; i < lines.length; i++) {
				time += phone[lines[i]];
			}
			System.out.println(time);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
