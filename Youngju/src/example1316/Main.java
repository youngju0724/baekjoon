package example1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int n = Integer.parseInt(br.readLine());
			int count = n;

			for (int i = 0; i < n; i++) {
				String line = br.readLine();
				char[] charLine = line.toCharArray();
				int[] index = new int[26];
				boolean result = true;

				for (int k = 0; k < 26; k++)
					index[k] = -1;

				for (int j = 0; j < charLine.length; j++) {
					int num = index[(int) charLine[j] - 97];

					if (num < 0)
						index[(int) charLine[j] - 97] = j;
					else if (j - num == 1)
						index[(int) charLine[j] - 97] = j;
					else
						result = false;
				}
				
				if(result == false)
					count--;
			}
			System.out.println(count);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
