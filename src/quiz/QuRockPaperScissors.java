package quiz;

import java.util.Scanner;

/*
게임설명 : 가위바위보 게임을 메소드를 통해 구현한다.
1. 난수생성기를 이용하여 1, 2, 3중 하나의 숫자를 생성한다.
2. 사용자가 가위(1),바위(2),보(3) 중 하나를 낸다.
3. 승부를 판단하여 출력한다.
4. 1,2,3 이외의 숫자를 입력하면 잘못된 입력을 알려주고 재입력을 요구한다.
5. 숫자입력을 잘못한 경우는 게임횟수에 포함하지 않는다.
6. 게임은 5번 진행하고 5번째 게임을 끝내면 다시할지 물어본다. 
	재시작(1), 종료(0)
7. 0, 1 이외의 숫자를 입력하면 재입력을 요구해야 한다.
 */
public class QuRockPaperScissors {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		
		while (true) {
			
			System.out.print("무엇을 내겠습니까?(1.가위, 2.바위, 3.보) : ");
			int choice = scan.nextInt();
			int computer = (int)((Math.random() * 100 % 3) + 1);
			
			String user = "";
			String com = "";
			
			if (choice == 1) user = "가위, ";
			else if (choice == 2) user = "바위, ";
			else user = "보, ";
			
			if (computer == 1) com = "가위\n";
			else if (computer == 2) com = "바위\n";
			else com = "보\n";
			
			if (choice != 1 && choice != 2 && choice != 3) {
				System.out.println("?\n");
				continue;
			}
			else {
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
			}
			
			if (count == 5) {
				System.out.print("5번의 게임이 끝났습니다. 게임을 "
						+ "계속하시겠습니까?\n재시작(1), 종료(0) : ");
				choice = scan.nextInt();
				
				while (choice != 1 && choice != 0) {
					System.out.println("잘못 입력 하셨습니다\n");
					System.out.print("재시작(1), 종료(0) : ");
					
					choice = scan.nextInt();
				}
				if (choice == 1) {
					count = 0;
					System.out.println("\n게임 재시작\n");
				}
				else if (choice == 0) {
					System.out.println("\n게임 종료\n");
					break;
				}
			}
		}//// end of while
	}//// end of main
}//// end of class
