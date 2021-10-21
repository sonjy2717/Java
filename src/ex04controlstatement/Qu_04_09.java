package ex04controlstatement;
/*
문제4] 구구단을 이중 for문을 이용해서 다음과 같이 출력하시오
	실행결과]
		2*1=2   3*1=3 ~~~~~~~~~~ 9*1=9
		2*2=4   ~~~~~~~~~~~~~~~ 9*2=18
				~~~~~~~~~~~~~
		2*8=16~~~~~~~~~~~~~~~~9*8=72
		2*9=18~~~~~~~~~~~~~~~~9*9=81
 */
public class Qu_04_09 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %2d\t", j, i, (i * j));
			}
			System.out.println();
		}
	}
}
