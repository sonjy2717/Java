package ex11static;
/*
static variable(정적 변수)
- 멤버 변수 앞에 static키워드가 붙으면 정적 변수가 된다.
- 정적 변수는 JVM(자바가상머신)에 의해 프로그램이 시작되는 시점에
	초기화된다.
- main() 메서드가 실행되기 전에 이미 초기화되므로 main()메서드
	실행시 별도의 선언 없이 변수를 사용할 수 있다.
	
접근 방법
	- 클래스 내부 : 변수명으로 접근 가능(일반적인 멤버 변수와 동일함)
	- 클래스 외부 : 참조 변수를 통한 접근 or 클래스명을 통한 접근
		둘 다 가능하다. 단, 클래스명으로 접근할 것을 권장한다
 */
class MyStatic {
	
	/*
	멤버 변수] 인스턴스형 멤버 변수는 반드시 클래스의 객체를 생성한 후
		참조 변수를 통해 접근해야 한다.
	 */
	int instanceVar;
	
	/*
	정적 멤버 변수] 객체를 생성할 필요없이 클래스명으로 바로
		접근할 수 있다. 프로그램 시작시 이미 메서드 영역에 로드된다.
	 */
	static int staticVar;
	
	/*
	인스턴스형 멤버 메서드] 인스턴스형 메서드에서는 모든 멤버를
	사용할 수 있다. 인스턴스형 변수, 정적 변수 둘 다 접근 가능하다.
	 */
	void instanceMethod() {
		System.out.println("instanceVar = " + instanceVar); // 접근가능
		System.out.println("staticVar = " + staticVar); // 접근가능
		staticMethod(); // 접근가능
	}
	
	/*
	정적 멤버 메서드] 정적 메서드 안에서는 인스턴스형 멤버를
	사용할 수 없다. 정적 멤버만 접근할 수 있다.(main 메서드에서는
	static으로 선언된 메서드만 호출될 수 있었음을 기억하자)
	 */
	static void staticMethod() {
		//System.out.println("instanceVar = " + instanceVar);// 오류발생
		System.out.println("staticVar = " + staticVar);
		//instanceMethod(); // 오류발생
	}
}
public class E01StaticModifier {
	
	public static void main(String[] args) {
		
		/*
		일반적인 멤버 변수에 접근하는 방법 : MyStatic 클래스의 객체를
		생성한 후 참조 변수를 통해 접근한다.
		 */
		MyStatic myStatic = new MyStatic();
		myStatic.instanceVar = 100;
		System.out.println("myStatic.instanceVar = " + myStatic.instanceVar);
		
		/*
		static(정적) 멤버 변수 접근 방법 : 클래스명을 통해 직접 접근한다
			객체를 생성하지 않고도 바로 접근할 수 있다.
		 */
		MyStatic.staticVar = 200;
		System.out.println("MyStatic.staticVar = " + MyStatic.staticVar);
		
		/*
		정적 변수도 일반적인 멤버 변수처럼 참조 변수를 통해 접근하는 것이
		문법적으로 가능하나, Java에서는 클래스명을 통해 접근하기를 권장한다.
		 */
		myStatic.staticVar = 300;
		System.out.println("myStatic.staticVar = " + myStatic.staticVar);
		
		MyStatic ms1 = new MyStatic();
		MyStatic ms2 = new MyStatic();
		
		ms1.instanceVar = 100;
		ms2.instanceVar = 1000;
		
		System.out.println("ms1.instanceVar = " + ms1.instanceVar);
		System.out.println("ms2.instanceVar = " + ms2.instanceVar);
		
		MyStatic.staticVar = 800;
		MyStatic.staticVar = 900;
		
		System.out.println("ms1.staticVar = " + ms1.staticVar);
		System.out.println("ms2.staticVar = " + ms2.staticVar);
		
		/*
		정적 멤버 메서드의 접근 방법은 정적 변수의 접근 방법과 동일하다
		 */
		myStatic.instanceMethod();
		myStatic.staticMethod(); // 권장 사항이 아님 (클래스명으로 접근할 것)
		
		//MyStatic.instanceMethod(); // 에러발생 참조 변수를 통해서만 호출 가능
		MyStatic.staticMethod();
	}
	
}
