package example1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = br.readLine();
			String[] token = line.split(" ");
			int count = 0;
			
			for(String s : token) {
				if(!s.equals(""))
					count++;
			}
			System.out.println(count);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
