package ex05method;

import java.util.Scanner;

/*
두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 
메소드와 main메소드를 작성해보자. 
단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
파라메타로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다.
	메소드명 : arithmetic()
	
	실행결과]
		덧셈결과 -> 177
		뺄셈결과 -> 23
		곱셈결과 -> 7700
		나눗셈 몫 -> 1
		나눗셈 나머지 -> 23
 */

/*
public class QuSimpleOperation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int a = scanner.nextInt();
		System.out.print("두 번째 정수 : ");
		int b = scanner.nextInt();
		
		calc(a, b);
		
		scanner.close();
	}
	
	public static void calc(int num1, int num2) {
		
		if (num1 == 0 || num2 == 0) {
			System.out.println("0 이상의 수를 입력하세요!");
			return;
		}
		
		if (num1 < num2) {
			int emp = num1;
			num1 = num2;
			num2 = emp;
		}
		
		System.out.println("덧셈결과 -> " + (num1 + num2));
		System.out.println("뺄셈결과 -> " + (num1 - num2));
		System.out.println("곱셈결과 -> " + (num1 * num2));
		System.out.println("나눗셈 몫 -> " + (num1 / num2));
		System.out.println("나눗셈 나머지 -> " + (num1 % num2));
	}

}
*/

public class QuSimpleOperation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int a = scanner.nextInt();
		System.out.print("두 번째 정수 : ");
		int b = scanner.nextInt();
		
		arithmetic(a, b);
		
		scanner.close();
	}
	
	// 반환 값은 없고, 매개변수만 있는 메서드
	public static void arithmetic(int num1, int num2) {
		
		System.out.println("덧셈결과 -> " + (num1 + num2));
		System.out.println("뺄셈결과 -> " + (num1 - num2));
		System.out.println("곱셈결과 -> " + (num1 * num2));
		System.out.println("나눗셈 몫 -> " + (num1 / num2));
		System.out.println("나눗셈 나머지 -> " + (num1 % num2));
	}

}

