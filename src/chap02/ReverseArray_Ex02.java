package chap02;
//20.09.02
//배열요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램
import java.util.Scanner;

public class ReverseArray_Ex02 {
	static void swap(int[] a, int idx1, int idx2) { 
		// 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
			int t = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = t;
		}
		
		static void reverse(int[] a) {
		//배열 a의 요소를 역순으로 정렬
			for(int i = 0; i <a.length/2; i++) {// 교환횟수는 '요소개수/2' 나머지는 버림.
				System.out.println("a[" + i + "]과(와) a[" + (a.length-i-1) +"]를 교환합니다.");
				swap(a, i, a.length-i-1);
				
				for(int j = 0; j < a.length;j++) //교환해줄때마다 배열값 보여주기
					System.out.print(a[j]+" ");
				System.out.println();
			}
		}	
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("요솟 수 : ");
			int num = sc.nextInt(); //요솟수 입력받기
			
			int[] x = new int[num]; // 요솟수가 입력받은 num인 배열 x
			
			for(int i = 0; i <num; i++) {
				System.out.print("x["+i+"] : ");
				x[i] = sc.nextInt(); //0부터 num까지 요솟값 입력받기
			}
			
			for(int i=0; i<num; i++) //입력받은 배열값 보여주기.
			System.out.print(x[i]+" ");
			
			System.out.println();
			
			reverse(x);
			
			System.out.println("역순정렬을 마쳤습니다.");
			//for(int i=0; i<num; i++)
			//	System.out.println("x[" + i + "] = " + x[i]);
		}
		
}
