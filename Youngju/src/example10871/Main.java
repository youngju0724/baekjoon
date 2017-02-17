package example10871;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] line = br.readLine().split(" ");

		int x = Integer.valueOf(line[1]);

		String[] num = br.readLine().split(" ");

		for (String s : num) {
			if (Integer.valueOf(s) < x)
				System.out.print(s + " ");
		}

	}
}
