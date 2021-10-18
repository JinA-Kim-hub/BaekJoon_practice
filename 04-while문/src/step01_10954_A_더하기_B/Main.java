package step01_10954_A_더하기_B;

import java.util.ArrayList;
import java.util.Scanner;
//수정 필요!
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		String a=null, b=null;
		int sum = 0;
		
		while(a.equals("0") && b.equals("0")) {
			a = s.next();
			b = s.next();
			sum = Integer.parseInt(a) + Integer.parseInt(b);
			arr.add(String.valueOf(sum));
		}
		
		
		for(String str : arr) {
			System.out.println(str);
		}
		
		
		s.close();
	}
}
