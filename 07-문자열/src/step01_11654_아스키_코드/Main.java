package step01_11654_아스키_코드;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		char ch = s.next().charAt(0);
		int ich = (int)ch;
		System.out.println(ich);
		
		
		
		s.close();
	}

}
