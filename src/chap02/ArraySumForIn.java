package chap02;
//20.09.07
//배열의 모든요소의 합을 구하여 출력( 확장 for문)
public class ArraySumForIn {
	public static void main(String[] args) {
		double [] a = {1.0,2.0,3.0,4.0,5.0};
		
		for (int i =0; i <a.length; i++)
			System.out.println("a[" + i + "] = "+ a[i]);
		
		double sum = 0; //합계
		
		for(double i : a) //확장 for문 => 배열 a의 처음부터 끝까지 모든 요소를 한개씩 스캔함
			sum += i; 
		
		System.out.println("모든 요소의 합은 " + sum);
 	}
}
