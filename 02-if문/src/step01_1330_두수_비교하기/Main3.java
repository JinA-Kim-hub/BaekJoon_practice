package step01_1330_두수_비교하기;
import java.util.Scanner;
//삼항 연산자로 풀기2

/*
첫째 줄에 A와 B가 주어진다. A와 B는 [공백 한 칸]으로 구분되어져 있다.
첫째 줄에 다음 세 가지 중 하나를 출력한다.
A가 B보다 큰 경우에는 '>'를 출력한다.
A가 B보다 작은 경우에는 '<'를 출력한다.
A와 B가 같은 경우에는 '=='를 출력한다.
*/


/**********
  삼항 연산자 :  조건이 간단할 때 가독성을 위해 사용 >> 조건식이 복잡할 때는 if-else 사용 ㄱ
  변수 = (조건문) ? (true 시 연산) : (false 시 연산) ;
  
  //중첩해서 응용도 가능!!!
  변수 = (조건문) ? ((조건문) ? (true 시 연산) : (false 시 연산)) : (false 시 연산) ;
  변수 = (조건문) ? (true 시 연산) : ((조건문) ? (true 시 연산) : (false 시 연산)) ;
	
*/
/**
 * 
 * Main2에서 나아가서...
 * String 변수 생성 없이 바로 println 에 넣는 식으로 
 * 코드 정리하기..
 *
 */


public class Main3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int A = s.nextInt();
		int B = s.nextInt();
		
		System.out.println((A>B) ? ">" : ((A==B) ? "==" : "<" ));
		
		s.close();
 
	}
 
}