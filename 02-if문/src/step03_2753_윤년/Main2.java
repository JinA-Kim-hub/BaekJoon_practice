package step03_2753_윤년;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//윤년

// 문제 출처))
// https://www.acmicpc.net/problem/2753

public class Main2 {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = 0;
		try {
			year = Integer.parseInt(br.readLine());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		if(year>=1 && year<=4000 && (year%4==0 && year%100 != 0) || (year%400 ==0))
			System.out.println(1);
		else
			System.out.println(0);
		
		
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
