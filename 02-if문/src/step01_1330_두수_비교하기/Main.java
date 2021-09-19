package step01_1330_두수_비교하기;
import java.util.Scanner;


/*
    첫째 줄에 A와 B가 주어진다. A와 B는 [공백 한 칸]으로 구분되어져 있다.
    첫째 줄에 다음 세 가지 중 하나를 출력한다.
	A가 B보다 큰 경우에는 '>'를 출력한다.
	A가 B보다 작은 경우에는 '<'를 출력한다.
	A와 B가 같은 경우에는 '=='를 출력한다.
 */


public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int A = s.nextInt();
		int B = s.nextInt();
		
		if(A>B) 
			System.out.println(">");
		else if(A==B)
			System.out.println("==");
		else 
			System.out.println("<");
		
		
		
		s.close();
	}
}
