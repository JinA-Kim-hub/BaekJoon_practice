package step02_9498_시험_성적;
//Scanner 
//선검증후실행 - elseif구문 사용

import java.util.Scanner;


//문제출처))
//https://www.acmicpc.net/problem/9498
/*
 ....
 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.  =>데이터 검증(validation) 필요!
 ....
*/


//------------------------------------------------------------------------------------------------

/*

// 데이터 검증(validation) 
// 데이터 검증이란 사용자가 입력한 값이 올바른 값에 속하는지
// 체크하는 과정을 데이터 검증이라고 한다.
// 데이터 검증을 하는 방법은 다양하다..!!
 
// 다양한 데이터 검증 방법 중 2가지..
// 1) 정확한 범위를 통한 검증
// 2) 값이 올바른지 선 검증 후 결과 실행이라는 방법


*/
public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int jumsu = s.nextInt();
		
		if(jumsu >= 0 && jumsu <= 100) {//값이 올바른지 선 검증 후 결과 실행
			if(jumsu >= 90)
				System.out.println("A");
			else if(jumsu >= 80)
				System.out.println("B");
			else if(jumsu >= 70)
				System.out.println("C");
			else if(jumsu >= 60)
				System.out.println("D");
			else
				System.out.println("F");
		}//outer if문
		
		s.close();
		
	}
}
