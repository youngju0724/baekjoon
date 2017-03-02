package example1546;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int max = 0;
		int[] scores = new int[num];

		for (int i = 0; i < num; i++) {
			int score = scan.nextInt();
			scores[i] = score;

			if (max < score)
				max = score;
		}

		double result = 0;
		for (int n : scores) {
			result += (double) n / max * 100;
		}

		System.out.printf("%.2f", result / num);
	}
}



/*import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int N = Integer.valueOf(br.readLine());		
		float a[] = new float[N];		
		String s[] = br.readLine().split(" ");
		float result1 = 0;
		for(int i = 0 ; i < N; i++){
			a[i] = Integer.valueOf(s[i]);
			if(result1 < a[i]){
				result1 = a[i];
			}
		}		
		float result2 = 0;
		for(int i = 0 ; i < N; i++){
			a[i] = a[i]/result1 * 100;
			result2 += a[i];
		}		
		System.out.printf("%.2f", result2/N);
	}
}*/