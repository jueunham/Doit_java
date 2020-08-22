package chap01;
import java.util.Scanner;

public class SumGauss_Ex08 { //가우스의 덧셈 : 1부터 10까지의 합= (1+10)*5 
							//	(n + 1) * (n / 2) 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 n까지의 합 with 가우스 덧셈");
		System.out.println("n값 : ");
		int n = sc.nextInt();
		
		int sum = (1+n) *(n/2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum);
	}
}
