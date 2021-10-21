package ex05method;
/*
전달된 값이 소수인지 아닌지를 판단하여 
소수인 경우 true를 아니면 false를 반환하는 메소드를 정의하고, 
이를 이용해서 1부터 100사이의 소수를 전부 출력하는 
main메소드를 정의하자.

메소드명 : isPrimeNumber()
소수란 : 특정 정수를 나눌수 있는것이 1과 자기자신밖에 없는 수.

실행결과]
2
3
5
7
……중략……
97
 */


/*
public class QuFindPrimeNumber {

	public static void main(String[] args) {
		
		int num = 100;
		
		for (int i = 1; i <= num; i++) {
			
			if (isPrimeNumber(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean isPrimeNumber(int n) {
		
		if (n == 1) return false;
		
		for (int i = 2; i < n; i++) {
			
			if (n % i == 0) return false;
		}
		return true;
	}
	
}
*/


public class QuFindPrimeNumber {

	public static void main(String[] args) {
		
		int num = 100;
		
		for (int i = 1; i <= num; i++) {
			
			boolean result = isPrimeNumber(i);
			
			if (result == true) {
				System.out.println("소수 : " + i);
			}
		}
	}
	
	public static boolean isPrimeNumber(int n) {
		
		// 정수 1은 소수가 아니므로 무조건 false반환
		if (n == 1) return false;
		
		// n-1까지 나눠보면 됨
		for (int i = 2; i < n; i++) {
			// 만약 1과 자신을 제외한 숫자로 나누어 떨어지면
			// 소수가 아닌 것으로 판단한다.
			if (n % i == 0) {
				return false;
			}
		}
		
		// 위의 반복문을 벗어나면 소수로 판단한다.
		return true;
	}
	
}

