package chap02;
// 20.09.01
public class IntArray {
	public static void main(String[] args) {
		int[] a = new int[5]; //배열의 생성. new 에 의해 본체를 생성
		
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1] * 2;
		
		for(int i=0; i<a.length; i++)
			System.out.println("a["+ i + "] = " + a[i]);
		
	}

}
