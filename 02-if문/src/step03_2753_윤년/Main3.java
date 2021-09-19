package step03_2753_윤년;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//윤년

// 문제 출처))
// https://www.acmicpc.net/problem/2753

//윤년이란? 윤년 계산 방법
// https://ko.wikihow.com/%EC%9C%A4%EB%85%84%EC%9D%84-%EA%B3%84%EC%82%B0%ED%95%98%EB%8A%94-%EB%B0%A9%EB%B2%95

/*

윤년은..
0.우선 4로 나눠지되
1. 이 때 100으로 나눠지지 않거나
2. 400으로 나눠지면
윤년이다.

//즉, 애초에 4로 안나눠졌을 때 윤년이 아닌 것*******

*/

//데이터 검증(validation) - 선검증후실행
//BufferedReader, else if문

public class Main3 {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = 0;
		try {
			year = Integer.parseInt(br.readLine());
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (year >= 1 && year <= 4000) {
			if (year % 4 == 0) {
				if (year % 100 != 0)
					System.out.println(1);
				else if(year % 400 == 0)
					System.out.println(1);
				else
					System.out.println(0);
			} else {
				System.out.println(0);
			}
		}

	}

}
