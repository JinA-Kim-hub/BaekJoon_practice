package step01_15596_정수_N개의_합;


/*

Scanner 없이 돌아가는 로직을 함수로만 구현

*/
public class Main {
    long sum(int[] a) {
        long ans = 0;
        
        for(int i=0;i<a.length;i++) {
        	ans += a[i];
        }
        
		return ans;
    }

}
