package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

class WrongNumberException extends Exception {
	public WrongNumberException() {
		super("\n똑바로 입력 바람.\n");
	}
}

public class QuRockPaperScissors2 {
	
	public static int user() throws WrongNumberException {
		
		Scanner s = new Scanner(System.in);
		int choice = 0;
		
		try {
			choice = s.nextInt();
		}
		catch (InputMismatchException e) {}
		
		if (choice > 3 || choice < 1) {
			WrongNumberException ex = new WrongNumberException();
			throw ex;
		}
		
		return choice;
	}
	
	public static int continueGame() throws WrongNumberException {
		
		Scanner s = new Scanner(System.in);
		int choice = -1;
		
		try {
			choice = s.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.print("\n똑바로 입력 바람.\n\n5번의 게임이 끝났습니다. "
					+ "게임을 계속하시겠습니까?\n"
					+ "재시작(1), 종료(0) : ");
			continueGame();
		}
		
		if (choice > 1 || choice < 0) {
			WrongNumberException ex = new WrongNumberException();
			throw ex;
		}
		
		return choice;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		
		while (true) {
			
			int choice = 0;
			
			try {
				System.out.print("무엇을 내겠습니까?(1.가위, 2.바위, 3.보) : ");
				choice = user();
			} 
			catch (WrongNumberException e) {
				System.out.println(e.getMessage());
				continue;
			}
			
			int computer = (int)((Math.random() * 100 % 3) + 1);
			
			String user = "";
			String com = "";
			
			if (choice == 1) user = "가위, ";
			else if (choice == 2) user = "바위, ";
			else user = "보, ";
			
			if (computer == 1) com = "가위\n";
			else if (computer == 2) com = "바위\n";
			else com = "보\n";
			
			if ((choice == 1 && computer == 2) 
					|| (choice == 2 && computer == 3)
					|| (choice == 3 && computer == 1)) {
				System.out.println("사용자 : " + user + "컴퓨터 : " + com);
				System.out.println("졌습니다\n");
				count++;
			}
			else if ((choice == 1 && computer == 3)
					|| (choice == 2 && computer == 1)
					|| (choice == 3 && computer == 2)) {
				System.out.println("사용자 : " + user + "컴퓨터 : " + com);
				System.out.println("이겼습니다\n");
				count++;
			}
			else {
				System.out.println("사용자 : " + user + "컴퓨터 : " + com);
				System.out.println("비겼습니다\n");
				count++;
			}
			
			if (count == 5) {
				while(true) {
					try {
						System.out.print("5번의 게임이 끝났습니다. 게임을 "
								+ "계속하시겠습니까?\n재시작(1), 종료(0) : ");
						choice = continueGame();
						if (choice == 1) {
							count = 0;
							System.out.println("\n게임 재시작\n");
							break;
						}
						else if (choice == 0) {
							System.out.println("\n게임 종료\n");
							System.exit(0);
						}
					}
					catch (WrongNumberException e) {
						System.out.println(e.getMessage());
						continue;
					}
				}
			}
		}//// end of while
	}//// end of main
}//// end of class
