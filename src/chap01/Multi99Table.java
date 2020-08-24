package chap01;

//20.08.25
public class Multi99Table {
	public static void main(String[] args) {
		System.out.println("------곱셈표-------");
		
		for(int i = 1; i <=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%3d", i*j); // %3d : 3자리의 정수를 출력하되, 1~2자리의 수의 앞은 공백으로 채우는 것
				}	
			System.out.println();
		}
	}
}
