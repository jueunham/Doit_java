package chap02;

import java.util.Scanner;

//20.09.02
//20.09.03
//10진수를 다른 진수로 변환 메소드
public class CardConvRev {
	
	//정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환하는 메소드
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0; // 변환한 수의 자릿수를 나타내기 위한 변수
		
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지를 저장.
			x /= r;
		}while (x != 0);
		
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;  //변환하는 정수
		int cd;  // 기수
		int dno;  //변환 후의 자릿수
		int retry; // 다시한번?
		char [] cno = new char[32];
		
//		cardConvR(10,2,cno);
//		for(int i =0; i<=4;i++) System.out.print(cno[i]); 메소드를 호출해 순서대로 그냥 출력하면 역순으로 수가 나열됌.
		
		System.out.println("10진수를 기수 변환합니다.");
		do { //retry 할지 말지 반복문
			do {
				System.out.print("변환하는 음이 아닌 정수 : " );
				no = sc.nextInt();
			} while (no < 0);
			
			do {
				System.out.print("어떤 진수로 변환할까요? (2~36) : ");
				cd = sc.nextInt(); 
			} while (cd < 2 || cd >36);
			
			dno = cardConvR(no, cd, cno); // 메소드 호출, no를 cd진수로 변환한 배열의 자릿수를 dno에 넣어줌.
			
			System.out.print(cd + "진수로는 " );
			for ( int i = dno -1; i>=0; i--) { // 윗자리부터 차례로 나타냄
				System.out.print(cno[i]);
				}
			System.out.println("입니다.");
			
			System.out.print("한번 더? (1.예/ 0.아니오) : ");
			retry = sc.nextInt();
		}while (retry == 1);
	}
}

