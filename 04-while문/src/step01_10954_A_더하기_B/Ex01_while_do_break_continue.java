package step01_10954_A_더하기_B;
//while문에 대해 정리

//출처))
//https://sambalim.tistory.com/88
public class Ex01_while_do_break_continue {
	public static void main(String[] args) {

		// while문
		boolean flag = false;
		while (flag) {
			// 조건식(flag)이 true일 때 반복될 문장을 적는 곳.
		}
//------------------------------------------------------

		// for문
		for (int i = 0; i < 3; i++) { // 초기화, 조건식, 증감식
			System.out.print("for문" + i + " ");
		}
		System.out.println();

		// while문
		int i = 0; // 초기화
		while (i < 3) { // 조건식
			System.out.print("while문" + i + " ");
			i++; // 증감식
		}
		System.out.println();

//-------------------------------------------------------

		// do-while
		int a = 0;
		do {// 무조건 한번은 do 실행. 이후 while의 조건문이 true일때 계속 반복.
			System.out.print(a);
			a++;
		} while (a < 10);
		
		System.out.println();

//-------------------------------------------------------		

		// break문
		// while문에서 break는 자신이 포함된 가장 가까운 반복문을 벗어난다.
		// if문과 주로 같이 쓰이곤 한다.
		int b = 0;
		while (true) { // while(true) -> 무한 루프 -> 특정조건(if문) 만족 시 break 사용하여 탈출.
			if (b == 5) {
				// 만약 break가 된다면, 그 이후의 부분은 실행되지 않음.
				System.out.println("break문으로 무한루프 탈출");
				break;
			}
			b++;
		}

//-------------------------------------------------------

		// continue문
		// 반복문 내에서만 사용 가능.
		// 반복문이 진행 되다 continue를 만나면
		// 반복문의 끝으로 이동하여 다음 반복으로 넘어간다.
		for (int j = 0; j < 10; j++) {
			if (j % 2 == 0) {//continue를 이용하여 홀수만 출력해보자!
				continue;
			}
			System.out.print(j);
		} // 결과 : 13579
		System.out.println();

//-------------------------------------------------------	

		//이름이 붙은 반복문 
		//break문과 continue문에 이름을 지정하여 
		//하나 이상의 반복문을 벗어나거나 반복을 건너뛸 때 사용.
		//일반적으로 break문과 continue문은 자신이 포함된 최소의 반복문의 끝으로 이동함..
		//이름을 지정한다면 더 큰 반복문을 벗어날 수 있다!!
		Loop1: 
		for (int k = 0; k < 5; k++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) {
					break Loop1;
				}
				System.out.println(k + "행 " + j + "열");
			}
		}

	}//main()
}//class
