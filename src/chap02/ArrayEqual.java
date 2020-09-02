package chap02;

import java.util.Scanner;
//20.09.02
//두 배열이 같은지 판단
public class ArrayEqual {
	
	// 두 배열 a,b가 같은지 확인하는 메소드
	static boolean equals(int[]a,int[]b) {
		if(a.length != b.length) // 두 배열의 길이가 다르면 false
			return false;
		
		for(int i=0; i<a.length; i++) { //두 배열의 요소 비교. 다르면 false
			if(a[i] != b[i])
				return false;
		}
		return true; //위에가 다 맞다면 두 배열은 같음.
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("베열 a의 요솟수 : ");
		int na = sc.nextInt();
		
		int[]a = new int[na];
	
		for(int i=0; i <na; i++) {
			System.out.print("a[" + i + "] :");
			a[i] = sc.nextInt();
		}
		System.out.print("베열 b의 요솟수 : ");
		int nb = sc.nextInt();
		
		int[]b = new int[nb];
	
		for(int i=0; i <nb; i++) {
			System.out.print("b[" + i + "] :");
			b[i] = sc.nextInt();
		}
		
		System.out.println("배열 a와 b는" + (equals(a,b) ? "같습니다." : "같지 않습니다."));
	}
}
