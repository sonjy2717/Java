package ex12inheritance;

class Account {
	
	/*
	멤버 변수가 상속 관계에 있다 하더라도 private으로 선언되면
	클래스 내부에서만 접근할 수 있다. 즉 상속받은 하위 클래스에서는
	직접 접근이 불가능하다.
	 */
	private int money; // 잔고
	
	public Account(int init) {
		money = init;
	}
	
	/*
	입금 처리 : protected로 선언되었으므로 상속 관계에서 접근 가능
	 */
	protected void depositMoney(int _money) {
		if (_money < 0) {
			System.out.println("마이너스 금액은 입금 불가");
			return;
		}
		money += _money;
	}
	
	// private으로 선언된 멤버 변수를 외부로 반환할 때 사용한다
	// (getter 메서드)
	protected int getAccMoney() {
		return money;
	}
}

class SavingAccount extends Account {
	
	/*
	인자 생성자에서 부모의 생성자 메서드를 호출하기위한 super()를
	사용한다. 이 때 인자가 하나인 부모 클래스의 생성자를 호출한다.
	 */
	public SavingAccount(int initVal) {
		super(initVal);
	}
	
	/*
	부모 클래스의 protected로 선언된 멤버 메서드를 각각 호출한다.
	 */
	public void saveMoney(int money) {
		depositMoney(money);
	}
	
	public void showAccountMoney() {
		/*
		private 멤버 변수인 money는 자식쪽에서 직접 접근할 수 없으므로
		접근 가능한 멤버 메서드를 통해 간접적으로 접근한다.
		 */
		System.out.println("지금까지의 누적 금액: " + getAccMoney());
	}
}

public class E02PrivateInheritanceMain {
	
	public static void main(String[] args) {
		
		// 자식 클래스를 통해 객체 생성
		SavingAccount sa = new SavingAccount(10000);
		
		/*
		private 멤버이므로 상속받은 하위 클래스의 참조 변수를 통해서는
		접근할 수 없다. 은닉된 정보이므로 'not visible'이라는
		에러가 난다.
		 */
		//sa.money = 100000; // 접근 불가
		
		sa.saveMoney(5000);
		sa.showAccountMoney();
		
		sa.saveMoney(-1000);
		sa.showAccountMoney();
		
		/*
		부모 클래스의 참조 변수를 통해서도 private 멤버는 접근할 수 없다
		현재 접근하려는 위치가 Account 클래스 외부이기 때문이다.
		 */
		Account account = new Account(1000);
		//account.moeny = 1000; // 접근 불가
		
	}
	
}
