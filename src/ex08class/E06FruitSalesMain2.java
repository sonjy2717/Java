package ex08class;
/*
FruitSaleMain 이전 버전은 각 클래스가 멤버 변수의 초기 값이
고정되어, 상태가 다른 객체를 생성할 수 없는 단점이 있었다.
두 번째 버전에서는 다양한 초기 값을 부여할 수 있도록 초기화 메서드를
도입해본다.
 */
// 과일 판매자를 추상화한 클래스
class FruitSeller2 {
	
	int numOfApple; // 판매자가 보유한 사과갯수
	int myMoney; // 판매수익
	int apple_price; // 사과의 단가
	/*
		기존 상수에서 일반 변수로 변경한다.
		클래스의 멤버 상수로 정의하는 경우 선언과 동시에 초기화해야
		하므로 상수는 초기 값이 없는 형태로는 선언 자체가 불가능하다.
	 */
	
	/*
	초기화 메서드를 선언하여 객체 생성 후 다양한 형태의 초기화가 가능
	apple_price를 상수에서 변수로 변경한 이유는 상수는 단 한 번만
	초기화되므로 멤버 메서드에서는 초기화 할 수 없다. 멤버 메서드는
	개발자가 원할때 언제든지 호출할 수 있으므로 상수의 특성과는
	맞지 않기 때문이다.
	 */
	public void initMembers(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		apple_price = price;
	}
	public int saleApple(int money) {
		int num = money / apple_price;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	// 판매자의 현재 상태를 출력한다.
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수: " + numOfApple);
		System.out.println("[판매자]판매수익: " + myMoney);
	}
}

// 구매자를 추상화한 클래스
class FruitBuyer2 {
	
	int myMoney; // 보유한 금액
	int numOfApple; // 구매한 사과의 갯수
	
	// 초기화 메서드 선언
	public void initMembers(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	public void buyApple(FruitSeller2 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	// 구매자의 현재상태 출력
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액: " + myMoney);
		System.out.println("[구매자]사과갯수: " + numOfApple);
	}
}

// 프로그램의 출발점이 되는 메인 클래스
public class E06FruitSalesMain2 {
	
	public static void main(String[] args) {
		
		/*
		초기화 메서드가 정의되었으므로 상태가 다른 객체를 생성할 수 있다
		 */
		
		// 판매자1 : 사과 100개, 단가 1000원
		FruitSeller2 seller1 = new FruitSeller2();
		seller1.initMembers(0, 100, 1000);
		
		// 판매자2 : 사과 80개, 단가 500원
		FruitSeller2 seller2 = new FruitSeller2();
		seller2.initMembers(0, 80, 500);
		
		// 구매자 : 보유 금액 : 10000원
		FruitBuyer2 buyer = new FruitBuyer2();
		buyer.initMembers(10000, 0);
		
		System.out.println("구매행위가 일어나기 전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		// 판매자1, 판매자2 에게 각각 5000원을 지불하고 구매
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
	}
	
}
