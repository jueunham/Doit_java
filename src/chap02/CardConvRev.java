package chap02;
//20.09.02
public class CardConvRev {
	
	//정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환하는 메소드
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0; // 변환한 수의 자릿수를 나타내기 위한 변수
		
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지를 저장.
			x /= r;
		}while (x != 0);
		
		return digits;
	}
}

