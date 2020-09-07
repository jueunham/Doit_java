package chap02;
//20.09.07
//그 해 경과 일 수 구하는 메소드
//변수 i와 days없이 while문을 사용한 구현
import java.util.Scanner;

public class DayOfYearWhile_Ex08 {
		static int[][] mdays = {
				{31,28,31,30,31,30,31,31,30,31,30,31}, // 평년
				{31,29,31,30,31,30,31,31,30,31,30,31}  //윤년
		};
		
		//서기 year년은 윤년인가? (윤년:1/평년:0)
		static int isLeap(int year) {
			return(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)? 1 : 0;
		}
		
		//서기 y년 m월 d일의 그 해 경과 일 수를 구함.
		static int dayOfYear(int  y, int m, int d) {
			
			while(--m != 0) //m에서 하나씩 줄이면서 0이 될때까지 더해주기.
				d += mdays[isLeap(y)][m-1];
			
			return d;
		}
		
}
