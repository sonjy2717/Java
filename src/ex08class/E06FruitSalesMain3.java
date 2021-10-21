package ex08class;
/*
세 번째 버전에서는 초기화 메서드를 생성자로 변경해본다.
 */
// 과일 판매자를 추상화한 클래스
class FruitSeller3 {
	
	int numOfApple; // 판매자가 보유한 사과갯수
	int myMoney; // 판매수익
	final int APPLE_PRICE; // 사과의 단가
	/*
		상수는 값의 변경이 불가능하고, 단 한 번만 초기화되기 때문에
		일반 멤버 메서드에서는 초기화 할 수 없다.
		하지만 생성자는 객체 생성시 딱 한 번만 호출되고 개발자가 마음대로
		호출할 수 없으므로 한 번 이상 초기화 되지 않음이 보장된다.
		따라서 멤버 상수는 생성자에서 초기화 할 수 있다.
	 */
	
	public FruitSeller3(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
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
class FruitBuyer3 {
	
	int myMoney; // 보유한 금액
	int numOfApple; // 구매한 사과의 갯수
	
	// 초기화 메서드 선언
	public FruitBuyer3(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	public void buyApple(FruitSeller3 seller, int money) {
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
public class E06FruitSalesMain3 {
	
	public static void main(String[] args) {
		
		
		// 판매자1 : 사과 100개, 단가 1000원
		FruitSeller3 seller1 = new FruitSeller3(0, 100, 1000);
		
		// 판매자2 : 사과 80개, 단가 500원
		FruitSeller3 seller2 = new FruitSeller3(0, 80, 500);
		
		// 구매자 : 보유 금액 : 10000원
		FruitBuyer3 buyer = new FruitBuyer3(10000, 0);
		
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
