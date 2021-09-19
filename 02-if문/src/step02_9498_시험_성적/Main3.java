package step02_9498_시험_성적;
//문제출처))
//https://www.acmicpc.net/problem/9498
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//BufferedReader 사용 -> Scanner보다 좀더 빠름
//삼항연산자(ternary operator)


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
