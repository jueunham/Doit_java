package chap01;

import java.util.Scanner;
//20.08.25

public class DigitsNo_Ex11 { // 양의 정수를 입력하고 자릿수를 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n;
		
		do {
			System.out.println("정수값: ");
			n = sc.nextInt();
		}while(n<=0); //양수가 아닐 경우엔 다시 입력받음.
		
		int no = 0; //자릿수
		
		while(n>0) { //자릿수 구하기
			int i =0;
			n/=10; //10으로 나눔
			no++; 
		}
		
		System.out.println("그 수는 " + no +"자리입니다.0");
		
	}

}
