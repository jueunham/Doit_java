package chap02;
//20.09.01
//배열의 복제 a.clone()
public class CloneArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = a.clone(); // b는 a의 복제를 참조
		
		b[3] = 0;
		
		System.out.print("a =");
		for(int i =0; i<a.length; i++)
			System.out.print(" " + a[i]);
		
		System.out.print("\nb =");
		for(int i =0; i<a.length; i++)
			System.out.print(" " + b[i]);
	}

}
