package ex02variable;
/*
문제3] 파일명 : Qu_02_03.java
반지름이 10인 원의 넓이를 구해 출력하시오.
단, 넓이의 타입을 int, double형 두가지로 선언하여 각각 출력해야한다.
변수명] 
	int형 : area_int
	double형 : area_double
공식]
	원의넓이 = 반지름 * 반지름 * 3.14
 */
public class Qu_02_03 {

	public static void main(String[] args) {

		int radius = 10;
		final double PI = 3.14;
		
		int area_int = (int)(radius * radius * PI);
		double area_double = radius * radius * PI;
		
		System.out.println("int형 넓이:" + area_int);
		System.out.println("double형 넓이:" + area_double);
		
	}

}
