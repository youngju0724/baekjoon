package example9498;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.valueOf(read.readLine());

		if (input < 60) {
			System.out.println("F");
		} else if (input < 70) {
			System.out.println("D");
		} else if (input < 80) {
			System.out.println("C");
		} else if (input < 90) {
			System.out.println("B");
		} else {
			System.out.println("A");
		}
	}
}
