package example2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int A = Integer.parseInt(br.readLine().trim());
			int B = Integer.parseInt(br.readLine().trim());
			int C = Integer.parseInt(br.readLine().trim());
			int num = A * B * C;

			int[] count_num = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

			while (num > 0) {
				count_num[num % 10]++;
				num /= 10;
			}

			for (int a : count_num)
				System.out.println(a);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
