package chap02;
//20.09.07
//1000이하의 소수를 열거(버전3)
public class PrimeNumber3 {
	public static void main(String[] args) {
		int counter = 0;		//곱셈과 나눗셈의 횟수 ->처리비용이 얼마나 드는지 저장
		int ptr = 0; 			//찾은 소수의 개수
		int[] prime = new int[500];//소수를 저장하는 배열
		
		prime[ptr++] = 2; 		//2,3은 소수
		prime[ptr++] = 3;
		
		for(int n = 5; n<=1000; n +=2) { //대상은 홀수만
			boolean flag = false; 
			for(int i =1; prime[i] * prime[i] <=n; i++) { //곱셈
				counter += 2; //위아래의 곱셈나눗셈을 카운팅
				if(n % prime[i] == 0) { //나누어 떨어지면 소수 X
					flag = true;
					break;
				}
			}
			if(!flag) { 	//마지막까지 나누어떨어지지 않았음
				prime[ptr++]=n; // 소수라고 배열에 저장
				counter++;
			}
		}
		
		for(int i =0;i < ptr; i++) //찾은 ptr개의 소수를 출력
			System.out.println(prime[i]);
		
		System.out.println("곱셈과 나눗셈을 수행한 횟수: " + counter);
	}
}
