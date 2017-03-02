package example4344;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());

		for (int i = 0; i < N; i++) {

			StringTokenizer tn = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(tn.nextToken());
			int a[] = new int[M];

			int sum = 0;
			for (int j = 0; j < a.length; j++) {
				a[j] = Integer.valueOf(tn.nextToken());
				sum += a[j];
			}

			float avg = sum / M;
			int count = 0;
			for (int k = 0; k < M; k++) {
				if(a[k] > avg)
					count++;
			}
			
			System.out.printf("%.3f", (float) count / M * 100);
			System.out.println("%");
		}
	}
}
