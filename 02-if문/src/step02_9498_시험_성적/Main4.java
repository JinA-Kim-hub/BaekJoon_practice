package step02_9498_시험_성적;
//문제출처))
//https://www.acmicpc.net/problem/9498
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Main3을 좀더 짧게 다듬어보자!
// 1.예외처리를 try-catch문을 사용하지 않고 throws 처리로 했다.
// 2. 삼항연산자에서 ()안으로 안으로 넣던것을 깔끔하게 정리하였다.

// 결과 정리) 
//			1. throws처리를 하면 코드는 짧아지지만 try-catch 처리했을 때보다 실행 시간이 조금 더 길어졌다.
//			2. 삼항연산자를 여러개 중첩해서 사용시에는 굳이 () 안으로 안으로 넣는 식으로 하기 보다 논리 흐름에 따라 작성하면 된다.			

//0920 
//삼항연산자 코드 정리 . 가독성을 위해.
//https://jong-hui.github.io/devlog/2020/08/12/(JavaScript)-nested-ternaries-operation/

public class Main4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int jumsu = Integer.parseInt(br.readLine());
		System.out.println((jumsu>=90)? "A" : 
						   (jumsu>=80)? "B" : 
						   (jumsu>=70)? "C" :
						   (jumsu>=60)? "D" : "F");
	}
}
