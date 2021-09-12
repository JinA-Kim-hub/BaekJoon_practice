package step01_1330_두수_비교하기;
//BufferedReader 사용해서 풀어보기  -> Scanner보다 실행 속도가 빠르다
//split() 사용!

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

/*
첫째 줄에 A와 B가 주어진다. A와 B는 [공백 한 칸]으로 구분되어져 있다.
첫째 줄에 다음 세 가지 중 하나를 출력한다.
A가 B보다 큰 경우에는 '>'를 출력한다.
A가 B보다 작은 경우에는 '<'를 출력한다.
A와 B가 같은 경우에는 '=='를 출력한다.

*/


public class Main4 {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str=null;//*******************************배열을 만들어서 담아준다!!!
		int A = 0,B=0;
		try {
			str = br.readLine().split(" ");
			A = Integer.parseInt(str[0]);
			B = Integer.parseInt(str[1]);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println((A>B) ? ">" : ((A==B) ? "==" : "<" ));
		
		
	}

}
