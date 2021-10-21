package ex05method;

import java.util.Scanner;

/*
원의 반지름을 파라메타로 전달하면 원의넓이와 
둘레를 계산하여 반환하는 메소드를 각각 정의하자. 
이를 호출하는 main 메소드를 정의하라.
	메소드명 : circleArea() > 원의넓이, circleRound() > 원의둘레
		- 넓이공식 : 3.14 * 반지름 * 반지름
		- 둘레공식 : 2 * 3.14 * 반지름
	실행결과]
		원의 둘레(5.5) : 34.54
		원의 넓이(5.5) : 94.985
 */

/*
public class QuCircleCalculator {

	public static void main(String[] args) {
		
		double radius = 5.5;
		
		double area = circleArea(radius);
		double round = circleRound(radius);
		
		System.out.printf("원의 둘레(%g) = %g\n", radius, round);
		System.out.printf("원의 넓이(%g) = %g\n", radius, area);
		
	}
	
	public static double circleArea(double radius) {
		
		final double PI = 3.14;
		return PI * radius * radius;
	}
	
	public static double circleRound(double radius) {
		
		final int NUM = 2;
		final double PI = 3.14;
		return NUM * PI * radius;
	}

}
*/

public class QuCircleCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("반지름 입력 : ");
		double rad = scanner.nextDouble();
		
		circleArea(rad);
		
		// 반환 값이 있는 메서드이므로 print문 안에서 호출한다
		System.out.println("원의 둘레 : " + circleRound(rad));
		
		scanner.close();
		
	}
	
	// 반환 값이 없으므로 매개변수를 받은 후 결과를 즉시 출력한다
	public static void circleArea(double radian) {
		
		final double PI = 3.14;
		double result = radian * radian * PI;
		System.out.println("원의 넓이 : " + result);
	}
	
	public static double circleRound(double radian) {
		
		return (2 * 3.14 * radian);
	}

}

