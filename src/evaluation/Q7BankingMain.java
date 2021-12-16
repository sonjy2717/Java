package evaluation;
/*
-클래스명 : Banking
-멤버변수 : 예금주(name), 계좌번호(accountNumber), 
	잔액(balance)
-멤버메소드 : 입금(deposit()), 출금하다(withdraw()), 
	계좌조회(showAccount())
조건1 : 입금은 무제한으로 가능함
조건2 : 출금시 잔고가 부족할 경우에는 출금불능 처리
조건3 : Banking 객체생성시 장동건, 
	123-45-67890, 10000으로 초기화할것
조건4 : 5000원 입금, 9000원 출금 후 잔고를 출력할것
 */
class Banking {   
    
	String name;
	String accountNumber;
	int balance;
	
	public Banking(String name, String accountNumber, int balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	void deposit(int balance) {
		System.out.println(balance + "원이 입금됨");
		this.balance += balance;
	}
	
	void withdraw(int balance) {
		if (this.balance < 0 || this.balance < balance) {
			System.out.println("잔고부족");
			return;
		}
		else {
			this.balance -= balance;
			System.out.println("계좌에서 " + balance + "원이 출금됨");
		}
	}
	
	void showAccount() {
		System.out.println("계좌주:" + this.name);
		System.out.println("계좌번호:" + this.accountNumber);
		System.out.println("잔고:" + this.balance);
	}
}

public class Q7BankingMain {
    public static void main(String[] args) {
    	
        Banking banking = new Banking("장동건", "123-45-67890", 10000);
        banking.deposit(5000);
        banking.withdraw(9000);
        banking.showAccount();
    }
}
