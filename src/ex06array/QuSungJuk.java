package ex06array;

import java.util.Scanner;

/*
다음 조건에 맞는 프로그램을 작성하시오.
1] 학생수를 사용자로부터 입력받는다.
	-Scanner클래스 사용
2] 입력받은 학생수만큼 국영수 점수를 저장할 수 있는 int형 배열을 선언한다.
3] 다시 학생수만큼 각 학생의 국영수 점수를 입력받아 2]에서 생성한 배열에 저장한다.
	-Scanner클래스 사용
4] 각 학생의 국영수 점수 및 총점 그리고 평균을 출력하여라. 
5] 이 문제는 2차원 배열을 활용하는 문제이다.

실행결과]
학생수를 입력하세요?3
학생수:3
[1번째 학생의 점수 입력]
국어점수 입력?77
영어점수 입력?78
수학점수 입력?79
[2번째 학생의 점수 입력]
국어점수 입력?82
영어점수 입력?83
수학점수 입력?84
[3번째 학생의 점수 입력]
국어점수 입력?97
영어점수 입력?98
수학점수 입력?99
==========================
NO KOR ENG MAT TOT AVG
==========================
1  77  78  79  234 78.00
2  82  83  84  249 83.00
3  97  98  99  294 98.00
==========================
 */
public class QuSungJuk {
	
	public static void main(String[] args) {
		
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생수를 입력하세요: ");
		int num = scan.nextInt();
		System.out.println("학생수 : " + num);
		
		int[][] score = new int[num][3];
		
		for (int i = 0; i < score.length; i++) {
			
			System.out.print("[" + (i + 1) + "번째 학생의 점수 입력]\n");
			System.out.print("국어점수 입력: ");
			score[i][0] = scan.nextInt();
			System.out.print("영어점수 입력: ");
			score[i][1] = scan.nextInt();
			System.out.print("수학점수 입력: ");
			score[i][2] = scan.nextInt();
		}
		
		System.out.println("================================================");
		System.out.println("NO\tKOR\tENG\tMAT\tTOT\tAVG");
		System.out.println("================================================");
		
		for (int i = 0; i < score.length; i++) {
			
			int sum = score[i][0] + score[i][1] + score[i][2];
			
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\n",
					(i + 1), score[i][0], score[i][1], score[i][2], sum, (sum / 3.0));
		}
		
		System.out.println("================================================");
		
		scan.close();
		*/
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("학생수입력: ");
		int numberOfStudent = scanner.nextInt();
		
		// 학생의 점수와 총점, 평균을 입력할 2차원배열 선언
		int[][] jumsuArr = new int[numberOfStudent][5];
		
		// 입력받은 학생수만큼 반복
		for (int i = 0; i < numberOfStudent; i++) {
			// 국 영 수 점수를 입력받은 후
			System.out.print("국어점수입력: ");
			int kor = scanner.nextInt();
			System.out.print("영어점수입력: ");
			int eng = scanner.nextInt();
			System.out.print("수학점수입력: ");
			int math = scanner.nextInt();
			// 배열에 입력한다
			jumsuArr[i][0] = kor;
			jumsuArr[i][1] = eng;
			jumsuArr[i][2] = math;
		}
		
		// 총점과 평균을 구한다.
		for (int i = 0; i < numberOfStudent; i++) {
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				// i번째 학생의 국 영 수 점수의 총점을 구함
				sum += jumsuArr[i][j];
			}
			jumsuArr[i][3] = sum; // 총점을 배열에 입력
			jumsuArr[i][4] = sum / 3; // 평균을 배열에 입력
		}
		
		// 결과출력
		System.out.printf("No Kor Eng Math Tot Avg\n");
		for (int i = 0; i < numberOfStudent; i++) {
			System.out.print((i + 1) + " "); // 학생의 순번
			for (int j = 0; j < 5; j++) { // 과목, 총점, 평균까지 출력
				
				System.out.printf("%4d ", jumsuArr[i][j]);
			}
			System.out.println();
		}
		
		scanner.close();
	}
}
