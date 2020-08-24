package chap01;
//20.08.25
import java.util.Scanner;

public class Difference_Ex10 {// 정수 b에서 정수 a를 뺀 값을 구합니다(b > a가 되도록 입력 받음)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("a의 값: ");
		a = sc.nextInt();
		
		while(true){
			System.out.println("b의 값: ");
			b = sc.nextInt();
			
			if(a<b) break;
			
			System.out.println("a보다 큰 값을 입력하세요!");
			}
		
		System.out.println("b-a는 " +(b-a) + "입니다.");
	}

}
