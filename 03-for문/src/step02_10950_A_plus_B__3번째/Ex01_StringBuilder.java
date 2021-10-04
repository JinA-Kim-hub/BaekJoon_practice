package step02_10950_A_plus_B__3번째;
/* 
 * StringBuilder :
 * 원본 문자열이 불변하는 String 과는 달리 StringBuilder는 내용 변경 시 새로 생성되지 않고 원본 자체가 변경된다.
 * 동일한 문자열이 자주 사용될 때는 String, 한 문자열이 자주 변경될 때는 StringBuilder를 사용한다. 동기화 처리가 되는
 * StringBuffer에 비해 StringBuilder가 가벼우며 특별한 이유가 없다면 StringBuilder를 사용하는 것이 일반적이다.******************************
 * (또한, 문자열의 길이가 길어질 때도 StringBuiler를 이용하는 것이 좋다. by 강사님)
 */

/* 
 * 	- String/StringBuilder/StringBuffer
	
	 문자열을 다루는 String 과 StringBuilder 의 특징
 	
  	 String : 불변 , 상수 - > 문자열 상수영역( literal pool )에 저장 , 
  	 			   한번 생성된 문자열을 여러 곳에서 공유해서 사용 -> [동일한 문자열이 자주 사용]될 경우 메모리를 효율적으로 사용
  	 				String 문자열을 메서드를 이용해 데이터를 추가 또는 삭제 또는 수정할 경우에는 자체가 변경되지 않고
  	 			   [ 새로 생성 ] 
  	 StringBuilder : 가변	, StringBuilder 메서드를 이용해 추가 또는 삭제 또는 수정할 경우 [자체가 변경]
  	 							동일한 문자열이 자주 변경될 때 유리
  	 String 	vs	 StringBuilder	vs	StringBuffer
  	 불변					 가변			가변
   	 새로 생성			 자체가 변경 		 자체가 변경
   										 동기화 지원
 */


//	참고자료))
//	https://codevang.tistory.com/121

public class Ex01_StringBuilder {
	public static void main(String[] args) {
		
		StringBuilder br = new StringBuilder("The best day");
		br.append(" of");
		br.append(" my");
		br.append(" life");
		
		System.out.println(br);
		
	}

}
