package ex08class;
/*
기본 4칙연산을 할때마다 연산의 결과와 몇번 수행되었는지를 
출력하는 계산기 클래스를 정의해보자.
아래 main함수에 부합하는 CalculatorEx 클래스를 정의하면되고 
해당 수치는 임의로 바꿔도 된다. 
init() 멤버메소드에서는 계산의 결과를 카운트하는 
멤버변수를 0으로 초기화 한다.

실행결과]
1 + 2 = 3.0
10.5 - 5.5 = 5.0
4.0 * 5.0 = 20.0
100 / 25 = 4.0
10.0 * 3.0 = 30.0
덧셈횟수 : 1
뺄셈횟수 : 1
곱셈횟수 : 2
나눗셈횟수 : 1
*/

/*
class CalculatorEx{
	
	int addCount;
	int minCount;
	int mulCount;
	int divCount;
	
	public void init() {
		addCount = 0;
		minCount = 0;
		mulCount = 0;
		divCount = 0;
	}
	public double add(double n1, double n2) {
		addCount++;
		return n1 + n2;
	}
	public double min(double n1, double n2) {
		minCount++;
		return n1 - n2;
	}
	public double mul(double n1, double n2) {
		mulCount++;
		return n1 * n2;
	}
	public double div(double n1, double n2) {
		divCount++;
		return n1 / n2;
	}
	public void showOpCount() {
		System.out.println("덧셈횟수: " + addCount);
		System.out.println("뺄셈횟수: " + minCount);
		System.out.println("곱셈횟수: " + mulCount);
		System.out.println("나눗셈횟수: " + divCount);
	}
}
 */ //// 내 소스

class CalculatorEx {
	
	// 계산의 횟수 카운트를 위한 멤버 변수
	int addNum;
	int minNum;
	int mulNum;
	int divNum;
	// 멤버 변수 초기화 메서드
	public void init() {
		addNum = 0;
		minNum = 0;
		mulNum = 0;
		divNum = 0;
	}
	// 사칙연산 수행
	public double add(double num1, double num2) {
		addNum++;
		return num1 + num2;
	}
	public double min(double num1, double num2) {
		minNum++;
		return num1 - num2;
	}
	public double mul(double num1, double num2) {
		mulNum++;
		return num1 * num2;
	}
	public double div(double num1, double num2) {
		divNum++;
		return num1 / num2;
	}
	// 연산의 횟수 출력
	public void showOpCount() {
		System.out.println("덧셈횟수: " + addNum);
		System.out.println("뺄셈횟수: " + minNum);
		System.out.println("곱셈횟수: " + mulNum);
		System.out.println("나눗셈횟수: " + divNum);
	}
}

public class QuSimpleCalculator {
	
	public static void main(String[] args) {
		
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
	}
}
