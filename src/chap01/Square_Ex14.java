package chap01;

import java.util.Scanner;

//20.08.25
public class Square_Ex14 {//입력받은 수를 한 변으로 하는 정사각형 *출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사격형을 출력합니다.");
		System.out.println("단 수 :");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) 
			{
			System.out.print("*");
			}
			System.out.println();
		}
	}
}
