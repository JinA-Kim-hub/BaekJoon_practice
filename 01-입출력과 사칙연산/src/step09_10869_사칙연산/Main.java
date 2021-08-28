package step09_10869_사칙연산;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int A;
        int B;
        
        A = scanner.nextInt();
        B = scanner.nextInt();
        
        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);
        
        
        
        scanner.close();
        
    }
    
}
