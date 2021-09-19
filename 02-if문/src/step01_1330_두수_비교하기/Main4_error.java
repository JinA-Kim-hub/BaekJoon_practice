package step01_1330_두수_비교하기;
//BufferedReader 사용해서 풀어보기

//문제출처 ))
//https://www.acmicpc.net/problem/1330

/*

런타임 에러 numberformat _ 0905

java.lang.NumberFormatException은 문자열을 수로 변환할 때 발생하는 에러
원인 : readLine은 한 라인을 읽어오는데 "1 2" 같이 공백을 포함하여 읽어오는 경우
      정수로 형변환을 시킬 수 없다. 
해결 : split()를 이용하여 공백을 제거해보자!

출처)) https://www.acmicpc.net/help/rte/NumberFormat

*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Main4_error {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = null,B = null;
		int C,D = 0;
		
		
		//런타임 에러 numberformat _ 0905 >> java.lang.NumberFormatException
		/*
		try {
			A=br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			B=br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		C = Integer.parseInt(A);
		D = Integer.parseInt(B);
		
		System.out.println((C>D) ? ">" : ((C==D) ? "==" : "<"));
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
	}

}
