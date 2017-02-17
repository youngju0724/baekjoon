package example10817;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];

		for (int i = 0; i < 3; i++) {
			num[i] = scan.nextInt();
		}

		int min = 0;
		int max = 0;

		for (int i = 0; i < 3; i++) {
			if (num[min] > num[i])
				min = i;
			if (num[max] <= num[i])
				max = i;
		}

		for (int i = 0; i < 3; i++) {
			if (i != min && i != max)
				System.out.println(num[i]);
		}
	}
}
