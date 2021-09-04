package step01_1330_두수_비교하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//BufferdReader 연습
//숫자 맞추기 게임

public class BufferedReader_ex {

	public static void main(String[] args) {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a,b=6;
		System.out.print("아이디 입력 >> ");
		try {
			String id = br.readLine();
			System.out.println("********숫자 맞추기 게임 시작*********");
			System.out.print("0~9 사이의 숫자를 입력하세요! >> ");
			String userNumber = br.readLine();
			a = Integer.parseInt(userNumber);
			do {
				if(a > b)
					System.out.println("더 작은 수예요!");
				else if(a < b)
					System.out.println("더 큰 수예요!");
				userNumber = br.readLine();
				a = Integer.parseInt(userNumber);
			}while(a != b);
			System.out.println(a + "!! 정답입니다! " + id + "님 축하드립니다!! ^^** ");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
