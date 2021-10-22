package step01_10818_최소_최대;

/*
버블 정렬
[ Bubble sorting ]
주어진 데이터를 오름차순으로 정렬시킬 때 버블 정렬 방법은 첫번째 값과 두 번째 값을 비교해 
첫번째 값이 더 크면 교환 후 두번째와 세번째, 세번째와 네번째···. 
끝까지 비교해가는 방식으로 n개의 데이터가 있다면 n-1번을 비교하게 됩니다. 
이렇게 제일 마지막 값까지 한 바퀴 비교하는 과정을 통해 제일 큰 값이 제일 마지막에 정렬됩니다. 
이제 다시 처음으로 돌아와 정렬된 제일 큰 값을 뺀 나머지 n-1 개에 대해 처음부터 똑같은 작업을 반복해 
n-2번을 비교하게 되고 그 결과 그 다음 큰 값이 정렬됩니다.
[네이버 지식백과] 버블 정렬 [Bubble sorting] (소프트웨어 어휘다지기 - 중등)
*/

public class Ex01_BubbleSort {
	public static void main(String[] args) {
		
		int[] arr = new int[]{20, 10, 35, 30, 7};

		for (int i = 1; i <= arr.length; i++) {//데이터는 총 5개
			for (int j = 0; j < arr.length - i; j++) {//n개의 숫자가 있을 때 두숫자 씩 (n-1)번 대소 비교.. 이때 i는 큰수대로 정렬된 갯수값.
				if (arr[j] > arr[j + 1]) {//작은 수가 앞으로. 큰수가 뒤로.
					int temp = 0;
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0; i < arr.length ; i++)
		System.out.print(arr[i]+ " ");
		
	}

}
