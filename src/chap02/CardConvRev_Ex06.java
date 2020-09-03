package chap02;
//20.09.03
// 입력 받은 10진수를 2진수 ~36진수로 기수변환하여 나타냄(윗자리부터 배열에 저장)
//배열의 앞쪽에 아랫자리가 아니라 윗자리를 넣어두는 메소드
public class CardConvRev_Ex06 {
	static int CardConvR(int x, int r, char[]d) {
		int digits =0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x%r);
			x /= r;
		}while(x != 0);
		
		for(int i =0; i < digits/2; i++) { // d[0]~d[digits-1]
			char temp = d[i];				//역순 정렬 해주기.
			d[i] = d[digits -i -1];
			d[digits -i -1] = temp;		
		}
	
		return digits;
			
	}
}
