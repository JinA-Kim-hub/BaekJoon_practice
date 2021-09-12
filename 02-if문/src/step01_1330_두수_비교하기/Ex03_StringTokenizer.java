package step01_1330_두수_비교하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * StringTokenizer 클래스: 
문자열들 사이 특정 문자가 있는 때 이를 구분자로서 문자열을 나눌 때 사용.
하나의 문자열을 여러 개의 토큰(분리된 문자열 조각)으로 분리하는 클래스.

 * 클래스이므로 import 먼저!!! 그리고 당연히 객체 생성 후 이용!!!
 * 
 * StringTokenizer 생성자 :
  
  //띄어쓰기 기준으로 문자열 분리
  StringTokenizer s = new StringTokenizer(문자열);
  
  //구분자 기준으로 문자열 분리
  StringTokenizer s = new StringTokenizer(문자열, 구분자);
  
  //구분자를 기준으로 문자열 분리하되 구분자도 토큰으로 넣을거면 true. 디폴트 값은 false
  StrignTokenizer s = new StringTokenizer(문자열, 구분자, false);
  
  
  * nextToken() : 토큰(분리된 문자열 조각)을 확인
   
  
  // 출처 : https://jhnyang.tistory.com/398
*/
/*
	
	hasMoreTokens() 와 hasMoreElements()의 차이가 있는가?
	: hasMoreElements()는 hasMoreTokens()과 동일한 값을 리턴한다. 즉 성능적으로 차이가 없다.
	  이 메서드를 사용한 클래스가 Enumeration 인터페이스를 구현할 수 있도록 존재한다.
	  Enumertation 인터페이스는 Collection 프레임워크가 만들어기 전, Iterator의 이전 버전이다.
	  가능하면 Enumeration 대신 Iteration를 사용을 권장하고 있다.
		
		Enumertation 인터페이스 메서드는 아래와 같다.
		hasMoreElements() : 읽어올 요소가 남아있는지 확인. 있으면 true, 없으면 false. Iterator의 hasNext()와 같음
		nextElement() : 다음 요소를 읽어 옴. Iterator의 next()와 같다.
	 
	 결론)) 보통 hasMoreTokens()를 더 많이 사용. 메서드명을 통해 직관적으로 어떤 기능을 하는지 알 수 있기 때문.
	  	
			  
출처))..
//StringTokenizer에 대하여
//https://soobarkbar.tistory.com/55

//Enumertation 인터페이스에 대하여
//https://velog.io/@decody/Enumeration-%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4-%EC%A0%95%EB%A6%AC
*/

public class Ex03_StringTokenizer {
	public static void main(String[] args) throws IOException {
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String str = br.readLine();
		
		String str = "나는 오늘도 마라탕을 먹는다 굿";
		StringTokenizer st1 = new StringTokenizer(str); //띄어쓰기를 기준으로 분리
		
		while(st1.hasMoreTokens())
		System.out.println(st1.nextToken());
		
//		while(st1.hasMoreElements())
//			System.out.println(st1.nextToken());
		
		//br.close();
		
	}

}
