package ex12inheritance;
/*
다음 Point클래스를 이용하여 다음 문제를 해결하시오. 
해당 문제는 상속(Inheritance)을 통해 구현하는것이 아니라 
구성(Composition)관계를 이용하여 해결한다. 
Point 클래스를 기반으로 원을 의미하는 Circle클래스를 정의하자. 
그리고 Circle클래스를 기반으로 Ring클래스를 정의하자.
 */

class Point {
	
   	int xDot, yDot;
   	
   	public Point(int x, int y) {
   		xDot=x;
   		yDot=y;
   	}
   	
   	public void showPointInfo() {
   		System.out.println("[x좌표:"+xDot+", y좌표:"+yDot+"]");
   	}
}

//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle {
	
	//멤버변수
	int radian;//반지름
	Point center;
	
	/*
	원을 표현하기 위해 반지름과 중심점이 필요하다.
	중심점 Point객체는 2개의 멤버변수를 가지고 있으므로
	해당 Circle클래스의 객체를 생성하기 위해 3개의 값이 필요하다.
	 */
	public Circle(int x, int y, int rad) {
		center = new Point(x, y);
		radian = rad;
	}
	
	// 정보 출력용 메서드
	public void showCircleInfo() {
		System.out.println("반지름 : " + radian);
		center.showPointInfo();
	}
}

//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring {
	
	//멤버변수
	Circle innerCircle;//안쪽의 원
	Circle outerCircle;//바깥쪽의 원
	
	// 2개의 Circle 클래스의 객체를 생성하는 생성자 정의
	public Ring(int x1, int y1, int rad1, int x2, int y2, int rad2) {
		innerCircle = new Circle(x1, y1, rad1);
		outerCircle = new Circle(x2, y2, rad2);
	}
	
	// 정보 출력용 메서드
	public void showRingInfo() {
		System.out.println("안쪽원의 정보");
		innerCircle.showCircleInfo();
		System.out.println("바깥쪽원의 정보");
		outerCircle.showCircleInfo();
	}
}

class QuRingMake {
	
	public static void main(String[] args) {
		
		Ring c = new Ring(1,1,3,2,2,9);
		c.showRingInfo();
	}
}
