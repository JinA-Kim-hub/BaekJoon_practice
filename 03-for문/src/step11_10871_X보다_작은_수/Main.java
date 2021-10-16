package step11_10871_X보다_작은_수;

import java.util.ArrayList;
import java.util.Scanner;



// 복습 개념))
// initialized :
// 반복 사이클 수행 이전에 효율적인 시작 절차를 결정하기 위하여 필요한 예비 단계.
// 지역변수 초기화를 안해줬을 경우 -> The local variable A may not have been initialized
// 출처)) https://en.dict.naver.com/#/entry/enko/3be7069751094111ae00e4365622f491

// List와 Set의 차이 : 
//	List -> 중복 허용 , 순서 O
//  Set  -> 중복 X , 순서 X 
// 참고)) https://codechacha.com/ko/java-difference-between-list-and-set/
public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		ArrayList<String> A = new ArrayList<String>(); //수열 A
		int N = s.nextInt(); //정수 N개
		int X = s.nextInt(); //정수 X
		
		for(int i = 0; i<N ; i++) {
			A.add(s.next());
			if(Integer.parseInt(A.get(i)) < X) {
				System.out.print(A.get(i) + " ");
			}
		}
		s.close();
	}
}
/*

10 5					1 4 2 3	
1 10 4 9 2 3 8 5 7 6
 
*/