package step02_9498_시험_성적;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//BufferedReader 사용 -> Scanner보다 좀더 빠름
//삼항연산자(ternary operator)



/*

 시험 점수를 입력받아 90 ~ 100점은 A, 
 80 ~ 89점은 B, 70 ~ 79점은 C,
 60 ~ 69점은 D, 
 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 
 첫째 줄에 시험 점수가 주어진다. 
 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.  =>데이터 검증(validation) 필요!

*/

public class Main3 {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int jumsu = 0;
		try {
			jumsu = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		if(jumsu >= 0 && jumsu <= 100) {
		System.out.println((jumsu>=90)? "A": ((jumsu>=80)? "B" : ((jumsu>=70)?"C":(jumsu>=60)?"D":"F")));
		}//if문 end
	}
}
