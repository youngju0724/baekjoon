package example1065;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//import java.util.Scanner;

public class Main {
	/*public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] a = new int[3];
		int count = 0;

		if (N < 100) {
			count = N;
		} else {
			count = 99;
		}

		for (int j = 100; j <= N; j++) {

			int k = 0;
			int i = j;

			if (i != 1000) {

				while (i > 0) {
					a[k] = i % 10;
					i = i / 10;
					k++;
				}
				if ((a[2] - a[1]) == (a[1] - a[0])) {
					count++;
				}

			}
		}
		System.out.println(count);
	}*/
	
	static int N;
	static int count = 0;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		boolean flag = false;
		int first, second, tmp, d;
		if(N < 100){
			System.out.println(N);
		}else{
			for(int i = 100; i <= N; i++){
				first = i%10;
				second = i/10%10;
				d = first-second;
				tmp = i/100;
				flag = true;
				while(tmp>0){
					first = second;
					second = tmp%10;
					tmp /=10;
					if(d != first-second){
						flag = false;
						break;
					}
				}
				if(flag){
					count++;
				}
			}
			System.out.println(count+99);
			
		}		
	}
}
