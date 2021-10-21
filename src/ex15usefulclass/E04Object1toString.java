package ex15usefulclass;
/*
Object클래스
- 자바에서의 최상위 클래스이다
- 별도의 선언없이 Object 클래스에 정의된 모든 메서드를
	사용할 수 있다.
- 개발자가 정의한 모든 클래스는 Object참조변수로 참조할 수 있다.
	ex) Object obj = new Person();
	혹은
		void simpleFunc(Objdec obj) {
			실행부;
		}
 */
class myFriends {
	
	String myName;
	
	public myFriends(String name) {
		myName = name;
	}
	
	@Override
	public String toString() {
		return "이름: " + myName;
	}
}

class yourFriends {
	
	String myName;
	
	public yourFriends(String name) {
		myName = name;
	}
}

public class E04Object1toString {
	
	public static void main(String[] args) {
		
		myFriends fnd1 = new myFriends("성유겸");
		yourFriends fnd2 = new yourFriends("헬로비너스");
		
		System.out.println(fnd1);
		System.out.println(fnd2);
	}
}
