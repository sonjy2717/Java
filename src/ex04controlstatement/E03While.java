package ex04controlstatement;

/*
while문
	: 반복의 횟수가 정해져있지 않을 때 주로 사용하는 반복문이다.
	반복의 횟수가 명확할 때는 주로 for문을 사용한다.
	형식]
		반복을 위한 변수의 초기 값;
		while (조건) {
			실행문장;
			증감식; <- 반복문 탈출을 위한 증감
		}
		반복의 조건이 false일 때 while문을 탈출한다.
		또한 반복문의 처음으로 돌아가면 무조건 조건을 검사한다.
*/
public class E03While {
	
	public static void main(String[] args) {
		
		/*
		시나리오] 1~10까지의 합을 구하는 프로그램을 while문으로 작성하시오.
		*/
		
		// 작성1 : 10번 반복하기 위한 while문을 만든다.
		int i = 1;
		while (i <= 10) {
			System.out.println("변수 i = " + i);
			i++;
		}
		
		// 작성2 : 수열문제 구현
		int sum = 0;
		int j = 1;
		while (j <= 10) {
			// sum = sum + j; 일반적인 방식
			sum += j; // 복합대입연산자를 사용한 방식
			j++;
		}
		
		System.out.println("1~10까지의 합 : " + sum);
		
		/*
		시나리오] 1~100까지의 정수중 3의 배수이거나 4의 배수인 
		정수의 합을 구하는 프로그램을 while문을 이용해서 작성하시오.
		*/
		
		// 작성1 : 100번 반복에서 3 혹은 4의 배수 출력하기
		int total = 0;
		int k = 1;
		while (k <= 100) {
			if (k % 3 == 0 || k % 4 == 0) {
				total += k;
				System.out.println("k = " + k);
			}
			k++;
		}
		
		System.out.println("3 또는 4의 배수의 합 : " + total);
		
		/*
		시나리오] 구구단을 출력하는 프로그램을 작성하시오. 단 while문을 이용하시오.
		*/
		int dan = 2; // 단을 표현한 변수
		while (dan <= 9) { // 단에 대한 조건(2~9단까지)
			int su = 1; // 수를 표현한 변수
			while (su <= 9) { // 단이 고정된 상태에서 1~9까지 증가
				System.out.printf("%d * %d = %2d\t", dan, su, (dan * su));
				su++;
			}
			System.out.println(); // 줄바꿈
			dan++;
		}
		
		System.out.println("===================================");
		
		/*
		시나리오] 아래와 같은 모양을 출력하는 while문을 작성하시오. 
			출력결과 
				1 0 0 0 
				0 1 0 0 
				0 0 1 0 
		 		0 0 0 1
		*/
		
		int x = 1;
		while (x <= 4) { // 행으로 4번 반복하는 while문
			int y = 1;
			while (y <= 4) { // 열을 4번 반복하는 while문
				if (x == y) { // 행과 열이 동일할 때 1을 출력한다
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
				y++;
			}
			System.out.println();
			x++;
		}
		
	}
	
}
