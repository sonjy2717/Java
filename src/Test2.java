import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class NumberRangeException extends Exception {

	public NumberRangeException() {
		super("제대로하세요;;\n");

	}
}

public class Test2 {

	public static int random() {
		Random r = new Random();
		return (r.nextInt(100) + 1);

	}

	public static int user() throws NumberRangeException {

		Scanner user = new Scanner(System.in);
		int choice = 0;

		try {
			choice = user.nextInt();
		} catch (InputMismatchException e) {
		}

		if (choice > 100 || choice < 1) {
			NumberRangeException ex = new NumberRangeException();
			throw ex;
		}

		return choice;
	}

	public static void game() {

		int count = 0;
		int computer = random();

		System.out.println("컴퓨터: " + computer);

		while (true) {

			int choice = 0;

			try {
				System.out.print("숫자를 입력하세영 :");
				choice = user();
			} catch (NumberRangeException e) {
				System.out.println(e.getMessage());
				continue;
			}
			if (count < 7 && choice == computer) {
				System.out.println("성공ㅇㅅㅇ!");
			} else if (choice < computer) {
				System.out.println("UP!");
				count++;
			} else {
				System.out.println("DOWN!");
				count++;
			}
			if (count == 7) {
				System.out.println("실패ㅠㅅㅠ");
				System.out.println("정답은~ " + computer);
				System.out.print("7번의 게임이 끝났습니다. 게임을" + " 계속하시겠습니까? 재시작(1), 종료(0) : ");

				Scanner scan = new Scanner(System.in);
				choice = scan.nextInt();

				while (choice != 1 && choice != 0) {
					System.out.println("잘못입력 하셨습니다.");
					System.out.print("재시작(1), 종료(0) :");

					choice = scan.nextInt();
				}
				if (choice == 1) {
					count = 0;
					System.out.println("게임 재시작");
					continue;
				} else if (choice == 0) {
					System.out.println("게임 종료");
					return;
				}

			}
		}
	}

	public static void main(String[] args) {

		System.out.println("UP DOWN GAME~!");
		System.out.println("1 ~ 100까지 컴퓨터의 숫자를 맞추세요!");
		game();
	}
}