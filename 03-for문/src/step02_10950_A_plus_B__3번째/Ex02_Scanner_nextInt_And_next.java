package step02_10950_A_plus_B__3번째;

import java.util.Scanner;

//공백으로 맨처음 한방에 입력 완료하기!
//Scanner의..

//1.
//nextInt() <- [공백 전]까지의 정수 입력 받음.************************
//next() <- [공백 전]까지의 문자열 입력 받음.***********************
//문자열에서 공백을 포함하고 싶다면 nextLine()

//2.
//복습 개념))
//nextInt() 다음 반드시 s.nextLine()으로 개행문자 제거 후 nextLine() 입력을 받을 것!

public class Ex02_Scanner_nextInt_And_next {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		/*
		 * 
		 * a 를 입력 받는 시점에서 
		 * 1 2 3
		 * 이라고 입력을 한다면
		 * nextInt()는 공백 전까지의 정수를 읽어들이고 남은 숫자들은
		 * 다음 nextInt()로 넘기게 된다.
		 * 
		 * 즉, 첫번째 정수 a를 입력 받는 단계에서 띄어쓰기로 정수 3개를 입력하게 되면
		 * 첫번째 정주만 a에 할당되며 두번째는 b, 세번째는 c에 각각 다음다음 값들이 할당하게 된다! ***********************************
		 * 
		 */
		
		
	     System.out.println("******************************************************");
	     
	     String A = s.next();
	     int d = s.nextInt();
	     
	     System.out.println(A);
	     System.out.println(d);
	     
	     /*
	      * String A에서 
	      * 김동동 1
	      * 이라고 입력한다면
	      * next()는 공백 전까지의 문자열을 입력 받으므로 공백 뒤의 숫자는 바로 int d로 할당되게 된다.
	      */
		
		
		
		s.close();
	}
}
