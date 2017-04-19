package example2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int size = Integer.parseInt(br.readLine());
			int[] array = new int[size];

			for (int i = 0; i < size; i++) {
				array[i] = Integer.parseInt(br.readLine());
				array = sort(array, i);
			}

			for (int i = 0; i < size; i++) 
				System.out.println(array[i]);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int[] sort(int[] array, int size) {
		int length = size;
		int[] result = array;

		for (int i = length; i > 0; i--) {
			if (result[i] < result[i - 1]) {
				int temp = result[i - 1];
				result[i - 1] = result[i];
				result[i] = temp;
			}
		}
		return result;
	}
}
