package step01_11654_아스키_코드;

import java.util.Scanner;
/*

* 아스키 코드 : 
 	
 	미국에서 표준화가 추진된 정보교환용 7bit 부호.
 	1962년 안시(ANSI)가 정의한 미국 표준 정보교환 코드이며 
 	1963년 미국표준협회(ASA)에 의해 결정되어 미국의 표준부호가 되었다.
	7비트의 이진수 조합으로 만들어져 총 128개의 부호를 표현.
	아스키코드의 처음 32개(0~31)는 프린터나 전송 제어용으로 사용되고 
	나머지는 숫자와 로마글자 및 도량형 기호와 문장기호를 나타냄.


*/
public class Ex01_ASCII {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//문자 -> 숫자
		char ch= s.next().charAt(0);
		int ich = (int)ch;
		
		System.out.println(ich);
		
		//숫자 -> 문자
		int ic = s.nextInt();
		char c = (char)ic;
		System.out.println(c);
		
		
		s.close();
	}
}
