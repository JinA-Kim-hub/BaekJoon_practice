package step01_1330_두수_비교하기;
//split
/*
 split 	  : 구분자를 기준으로 문자열 자르기
 				String 클래스의 split 메서드.
 				정규표현식으로 문자를 분리한다.
 				
 				public String[] split (String regex);
 				
 				+) 이때 점 . 은 메타문자로서 하나의 문자로 인식되기 때문에
 				문자 그대로의 특수문자를 구분자로 사용하고 싶을 때는
 				이스케이프 문자(문자열 내에서 특수한 기능을 수행하는 문자) 중에 하나인
 				\\를 점 . 앞에 붙여줘야 한다.
 				
 				+) 빈 문자열을 하나의 문장열로 인식한다.
*/
/*
 * 개선된 for문 :
  				for(자료형 변수명 : 배열명 ) {}
  				
  				ex) String[][] arr = {{"1-1","1-2"},{"2-1","2-2"}};
 		
					for(String[] arrs : arr) {
						for(String s : arrs) {
							System.out.println(s);
						}
					}
					
				//출력은 
							1-1
							1-2
							2-1
							2-2    이렇게 나온다.
					

*/
public class Ex02_split {
	public static void main(String[] args) {
		
	System.out.println("-------------split() 실습1---------------");
		
		String str = "I wanna be memememe~♪";
		String[] strArray = str.split(" ");
		for(String a : strArray)
			System.out.println(a);
		
	System.out.println("-------------split() 실습2---------------");
		
		//잘못된 사용 예시!  -> 출력 결과 아무것도 나오지 않는다
		// why)  점 . 하나는 메타문자로서 하나의 문자로 인식
		String str1 = "I.My.Me.";
		String[] arr1 = str1.split(".");
		for(String a : arr1)
			System.out.println(a);
		
	System.out.println("-------------split() 실습3---------------");
		
		// 이스케이프 문자를 넣어 해결. \\.
		String str2 = "I.My.Me.";
		String[] arr2 = str2.split("\\.");
		for(String a : arr2)
			System.out.println(a);
		
		
		
				
	}
}
