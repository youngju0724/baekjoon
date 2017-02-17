package example1924;

import java.util.Scanner;

public class Main {
	
	final static String[] week = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };
	static int[] date = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		int day = scan.nextInt();

		for (int i = 1; i < month; i++) {
			day += date[i];
		}

		System.out.println(week[(day % 7) - 1]);
		/*switch(day % 7) {
		case 0:
			System.out.println("SUN");
			break;
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		}*/
	}
}

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		String[] dayStr = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] strArr = new String[2];
		strArr = br.readLine().split(" ");
		int month = Integer.parseInt(strArr[0]);
		int day = Integer.parseInt(strArr[1]);

		for ( int i = 1; i < month; i++ ) {
			
			if ( 2 == i ) {
				
				day = day + 28;
			} else if ( i == 4 || i == 6 || i == 9 || i == 11 ) {
				
				day = day + 30;
			} else {
				
				day = day + 31;
			}
		}
		
		System.out.println(dayStr[day%7]);
		
	}
}
*/
