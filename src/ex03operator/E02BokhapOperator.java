package ex03operator;

public class E02BokhapOperator {
	
	/*
	복합대입연산자 : 산술연산자와 대입연산자를 연결해놓은 형태로
	좌우측의 값을 연산하여 좌측의 변수에 대입하는 구조를 가진다.
	문법구조상 항상 현재 타입을 유지하는 특성을 가지고있다.
	 */
	public static void main(String[] args) {

		double e = 3.1;
		e += 2.1;
		e *=2;
		e = e + e;
		System.out.println("e의 결과값 : " + e);
		
		int n = 5;
		//n = n * 2.7; 에러 발생. 연산의 결과와 좌측항의 타입이 틀리다
		
		/*
		아래 복합대입연산자를 사용한 부분은 정상적으로 실행된다.
		복합대입연산자의 문법 구조상 기존 자료형을 그대로 유지하는
		특성을 가지고 있어 연산의 결과는 정수형태로 나오게된다. 
		 */
		n *= 2.7; // n = (int)(n * 2.7);
		System.out.println("n의 결과값 : " + n);
		
	}

}
