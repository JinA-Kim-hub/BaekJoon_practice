package step01_1330_두수_비교하기;
import java.util.Scanner;
//삼항 연산자를 사용해보자!
/*
  삼항 연산자 :  
  변수 = (조건문) ? (true 시 연산) : (false 시 연산) ;
  
  //중첩해서 응용도 가능!!!
  변수 = (조건문) ? ((조건문) ? (true 시 연산) : (false 시 연산)) : (false 시 연산) ;
  변수 = (조건문) ? (true 시 연산) : ((조건문) ? (true 시 연산) : (false 시 연산)) ;
	
*/
/*
첫째 줄에 다음 세 가지 중 하나를 출력한다.
A가 B보다 큰 경우에는 '>'를 출력한다.
A가 B보다 작은 경우에는 '<'를 출력한다.
A와 B가 같은 경우에는 '=='를 출력한다.
*/

public class Main2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int A = s.nextInt();
		int B = s.nextInt();
		
		String C = (A>B) ? ">" : ((A==B)?"==":"<");
		System.out.println(C);
		
		s.close();
 
	}
 
}