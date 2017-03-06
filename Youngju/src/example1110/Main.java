package example1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int num = Integer.parseInt(br.readLine());

			int cycle = 0;
			int numA = num;
			int numB = 100;
			
			while (numB != num) {
				int sum = numA/10 + numA%10;
				
				numB = (numA%10)*10 + sum%10;
				cycle++;
				numA = numB;
			}
			
			System.out.println(cycle);

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
