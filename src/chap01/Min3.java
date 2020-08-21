package chap01;

public class Min3 {
	static int min3(int a, int b, int c) {//3개 중 최솟값을 구하기
		int min = a;
		
		if (b<min) 
			min = b;
		if (c<min)
			min = c;
		
		return min;
		
	}
	public static void main(String args[]) {
		System.out.println("min(1,2,3,4) = " + min3(1,2,3));
	}
}
