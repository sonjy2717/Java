package ex16exception;

import java.util.Scanner;

public class Ex02PreDefineException3 {
	
	public static void main(String[] args) {
		
		System.out.println("### InputMismatchException ###");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("나이를 입력하세요 : ");
			// 만약 "10살"과 같이 입력하면 예외가 발생됨
			int intAge = sc.nextInt();
			int ageAfter10 = intAge + 10;
			System.out.println("당신의 10년 후 나이는 : " + ageAfter10);
		}
		catch (NumberFormatException e) {
			System.out.println("나이는 문자형태로 입력하면 안돼요");
			System.out.println("예외 메세지 : " + e.getMessage());
			e.printStackTrace();
		}
		sc.close();
	}
	
}
