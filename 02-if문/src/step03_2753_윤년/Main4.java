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

*/
//데이터 검증(validation) - 선검증후실행
//BufferedReader , ternary operator

//여기서 삼항연산자를 중첩하여 사용하는데
//step02에서는 ? : ? : .. 이런 순서로 ()없이 논리 흐름대로 작성
//여기서는 ? ? 로 조건이 연이어 나오게 되기 때문에 ()필요 -> 첫조건에서 false일 경우 실행 결과를 따로 또 넣어야 하기 때문.

public class Main4 {
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
			System.out.println((year % 4 == 0) ? ((year % 100 != 0) ? 1 : 
												  (year % 400 == 0) ? 1 : 0) : 0);
		}

	}

}
