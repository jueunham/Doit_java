package chap01;
import java.util.Scanner;

public class SumFor_Ex07 { //n이 7이면 '1+2+3+4+5+6+7 = 28' 을 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 n까지의 합 출력");
		System.out.println("n값 입력");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum += i;
			if(i<n)
				System.out.print(i + "+");
			else
				System.out.print(i); // 마지막에는 +를 안붙여줌.
		}
		System.out.print(" = " + sum);
	}
}
