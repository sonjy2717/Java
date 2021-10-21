package ex04controlstatement;
/*
문제3) 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.
	실행결과]
		* * * * *
		* * * *
		* * *
		* *
		*
 */
public class Qu_04_08 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
