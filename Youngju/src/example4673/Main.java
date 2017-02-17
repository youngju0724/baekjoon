package example4673;

public class Main {
	static int d[] = new int[10036];

	public static void main(String[] args) {
		for (int i = 0; i <= 10000; i++) {
			d[dn(i)] = 1;
			if (d[i] != 1)
				System.out.println(i);
		}
	}

	private static int dn(int i) {
		int total = 0;

		total += i;
		while (i > 0) {
			total = total + i % 10;
			i = i / 10;
		}

		return total;
	}
}
