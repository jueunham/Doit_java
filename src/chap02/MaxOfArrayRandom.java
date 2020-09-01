package chap02;
//20.09.01
//배열 요소의 최댓값 구하기. 값을 난수로 생성
import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRandom {
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i =0; i<a.length; i++)
			if(a[i] > max)
				max = a[i];
		
		return max;
	}
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최댓값 구하기");
		System.out.print("사람 수 : ");
		
		int num = sc.nextInt(); // 배열의 요소의 개수를 입력받음
		
		int[] height = new int[num]; // 요소가 num개인 배열을 생성
		
		for (int i = 0; i <num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "] :" + height[i]);
		}
	
			System.out.println("최댓값은 " + maxOf(height) + "입니다.");
	}
}
