package step01_1330_두수_비교하기;
import java.util.Scanner;
//삼항 연산자로 풀기1

//문제출처 ))
//https://www.acmicpc.net/problem/1330

/****************************
  삼항 연산자 :  조건이 간단할 때 가독성을 위해 사용 >> 조건식이 복잡할 때는 if-else 사용 ㄱ
  
  변수 = (조건문) ? (true 시 연산) : (false 시 연산) ;
  
  //중첩해서 응용도 가능!!!
  변수 = (조건문) ? ((조건문) ? (true 시 연산) : (false 시 연산)) : (false 시 연산) ;
  변수 = (조건문) ? (true 시 연산) : ((조건문) ? (true 시 연산) : (false 시 연산)) ;
	
*/




public class Main2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int A = s.nextInt();
		int B = s.nextInt();
		
		String C = (A>B) ? ">" : ((A==B) ? "==" : "<" );
		System.out.println(C);
		
		s.close();
 
	}
 
}