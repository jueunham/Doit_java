package chap01;
import java.util.Scanner;
public class SumFor {
	public static void main(String[] args) { //1개의 변수를 사용하는 반복문은 while문보다 for문이 더 좋음.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합");
		System.out.println("n의 값 입력 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum);
	}

}
