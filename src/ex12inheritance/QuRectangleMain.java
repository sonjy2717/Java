package ex12inheritance;
/*
정사각형을 의미하는 Square클래스와 직사각형을 의미하는 
Rectangle클래스를 정의하고자 한다.
그런데 정사각형은 직사각형의 일종이므로, 
다음의 형태로 클래스의 상속관계를 구성하고자 한다. 
아래의 소스를 참조하여 구현하시오
 */

/*
class Rectangle {
	
	int x;
	int y;
	
	public Rectangle() {}
	
	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void ShowAreaInfo() {
		System.out.println("직사각형 면적: " + (x * y));
	}
}

class Square extends Rectangle {
	
	int z;
	
	public Square(int z) {
		this.z = z;
	}
	
	public void ShowAreaInfo() {
		System.out.println("정사각형 면적: " + (z * z));
	}
}
*/ // 내 소스

class Rectangle {
	
	int width;	// 가로길이
	int height;	// 세로길이
	
	// 멤버변수가 2개이므로 인자가 2개인 생성자가 필요
	public Rectangle(int w, int h) {
		width = w;
		height = h;
	}
	
	// 직사각형의 면적을 출력
	public void ShowAreaInfo() {
		System.out.println("직사각형의 면적: " + (width * height));
	}
}

class Square extends Rectangle {
	
	/*
	정사각형은 직사각형의 일종이고, 가로/세로으 길이가
	동일하므로 하나의 값으로 두 개의 멤버변수를 초기화 할 수 있다.
	따라서 자식에서 멤버변수에 대한 확장도 필요없다.
	 */
	public Square(int width) {
		super(width, width);
	}
	
	@Override
	public void ShowAreaInfo() {
		System.out.println("정사각형의 면적: " + (width * height));
	}
}

class QuRectangleMain {
	
	public static void main(String[] args) {
		
       	Rectangle rec = new Rectangle(4, 3);
       	rec.ShowAreaInfo();
	  	
   		Square sqr = new Square(7);
       	sqr.ShowAreaInfo();
   	}
}
