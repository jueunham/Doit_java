package chap02;

import java.util.Scanner;
//20.09.02
//배열 복사하기
public class Copy_Ex04 {
	static void copy1(int[] a, int []b ) {// 단순히 이렇게 copy하면 요솟수가 a>b 일때 오류가 뜬다.
		for(int i =0; i<a.length; i++) {
			a[i] = b[i];
		}
	}	
		// 배열 b의 모든 요소를 배열 a에 복사
		static void copy(int[] a, int[] b) {
			int num = a.length <= b.length ? a.length : b.length; // a가 클때는 b의 요솟수를 num으로 해줘야함.
			for (int i = 0; i < num; i++)
				a[i] = b[i];
		}	

	public static void main(String[] args) { // a,b값 입력받아서 출력해주기.
		Scanner stdIn = new Scanner(System.in);

		System.out.print("a의 요솟수는 ：");
		int numa = stdIn.nextInt(); // 요솟수
		int[] a = new int[numa]; // 요솟수 numa인 배열
		for (int i = 0; i < numa; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}

		System.out.print("b의 요솟수는 ：");
		int numb = stdIn.nextInt(); // 요솟수
		int[] b = new int[numb]; // 요솟수 numb인 배열
		for (int i = 0; i < numb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}

		copy(a, b); // 배열 b의 모든 요소를 배열 a에 역순으로 복사

		System.out.println("배열 b의 모든 요소를 배열 a에 복사했습니다.");
		for (int i = 0; i < numa; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}

