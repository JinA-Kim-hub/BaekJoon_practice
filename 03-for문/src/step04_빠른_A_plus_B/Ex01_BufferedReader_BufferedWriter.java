package step04_빠른_A_plus_B;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//BufferedReader와 BufferedWriter

/*

BufferedReader
:Scanner와 유사하지만 좀더 빠름.

Bufferedwriter
:System.out.println();과 유사하지만 좀더 빠름.

-> 입력된 데이터가 바로 전달죄이 않고 버퍼를 거쳐 전달되어 데이터 효율성을 높인다.
-> 많은 데이터를 처리할 때 유리.
-> BufferedReader의 경우,
   Enter를 경계로 인식. (라인 단위로 읽어들임..)
   데이터가 String으로 고정.
   -> 입력 받은 데이터 가공하는 작업 필요한 경우 多



//BufferedReader 사용법))----------------------------------------------------------------------


1. readLine() -> 리턴값 String 타입 고정. 다른 타입 사용 시 형변환 필요.
2. 예외처리 필요. readLine 할 때마다 try catch 사용. 대개는 throw IOException을 총하여 작업한다고 함.
   *throws 이용 시
   1) import.java.io.IOException;
   2) main 옆에 throws IOException 작성.
   	  ->	public static void main(String[] args) throws IOException {}
3. 공백단위로 데이터 쪼개기 ( StringTokenizer , split() )
	StringTokenizer st = new StringTokenizer(s); //StringTokenizer인자값에 입력 문자열 넣음
	int a = Integer.parseInt(st.nextToken()); //첫번째 호출
	int b = Integer.parseInt(st.nextToken()); //두번째 호출

	String array[] = s.split(" "); //공백마다 데이터 끊어서 배열에 넣음


//BufferedWriter 사용법))----------------------------------------------------------------------

	
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  //할당된 버퍼에 값 넣어주기
	String s = "abcdefg";   //출력할 문자열
	bw.write(s+"\n");   //버퍼에 있는 값 전부 출력
	bw.flush();   //남아있는 데이터를 모두 출력시킴
	bw.close();   //스트림을 닫음

1. BufferedWriter는 버퍼를 잡아 놓았기 때문에 반드시 flush()/close() 해준다.
   1) 출력해주고 싶을 때 flush()
   2) 출력 닫고 싶을 때는 close(). 이때 flush()가 자동 호출된다.

2. write() 할 시 개행할 때는 
   "\n" 또는 newLine()  사용
   bw.write(s+"\n");
   bw.newLine(); 
   
	   새줄 문자(newline)는 텍스트의 한 줄이 끝남을 표시하는 문자 또는 문자열이다. 
	   개행 문자, 줄바꿈 문자(line break), EOL(end-of-line)과 같은 뜻이다.
	   출처) https://ko.wikipedia.org/wiki/%EC%83%88%EC%A4%84_%EB%AC%B8%EC%9E%90

*/
//참고))
// https://m.blog.naver.com/ka28/221850826909
// https://code0xff.tistory.com/10

public class Ex01_BufferedReader_BufferedWriter {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// BufferedReader 생성 
		// 입력값을 바이트스트림에서 문자스트림으로 변환해주는 InputStreamReader와
        // 입력장치를 통해 값을 입력받아주는 System.in을 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 생성 
		// OutputStreamWriter와
        // System.out을 사용
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();
		bw.write(a+"\n");
		bw.write(b);
		bw.newLine(); 
		bw.write(c);
		
		// 버퍼 및 스트림 뒷정리 
		bw.flush(); // 버퍼의 남은 데이터를 모두 쓰기
		bw.close(); // 스트림 종료 **** 스트림 닫는 것은 필수이다!!!!
		
		
		
		

	}
}
