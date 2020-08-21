package chap01;

public class Max3m { //Max3와  동일한건데 코테 볼때는 이런식으로 메소드로 처리하기.
	static int max3(int a,int b, int c) {//a,b,c의 최댓값을 구하여 반환.
		int max = a;
		if (b > max) 
			max = b;
		if (c > max) 
			max = c;
		
		return max; //구한 최댓값을 호출한 곳으로 반환
	}
	
	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = " + max3(3,2,1)); // [A] a>b>c
		System.out.println("max3(3,2,2) = " + max3(3,2,2)); // [B] a>b=c
	}

}
