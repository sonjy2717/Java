package quiz;

import java.util.Random;
import java.util.Scanner;

/*
게임설명 : 야구게임을 메소드를 이용하여 구현한다.
- 중복되지 않는 3개의 정수를 생성한다.(1~9)
- 사용자는 3개의 숫자를 입력한다.
- 생성된 3개의 숫자를 맞추는데 위치까지 정확히 맞춰야 한다.
- 숫자와 숫자의 위치까지 일치하면 strike 로 판정한다.
- 숫자는 맞지만 위치가 틀렸다면 ball 로 판정한다.
- 숫자3개가 모두 일치하지 않으면  out 으로 판정한다.
-  strike 가 되면 게임은 종료된다.
- 시도한 횟수를 표시한다.
- 계속할지 종료할지 여부를 물어보고 다음 진행을 한다.

위 문제의 변수들은 아래와 같이 생성하여 구현해본다.
   int com1, com2, com3;
   int user1, user2, user3;
아니면 
   int[] com = new int[3];
   int[] user = new int[3];
와 같이 배열을 사용해도 된다. 
 */

public class QuBaseballGame {
	
	public static int random() {
		
		Random r = new Random();
		return r.nextInt(9) + 1;
	}
	
	public static void game() {
		
		Scanner scanner = new Scanner(System.in);
		int[] com = new int[3];
		int[] user = new int[3];
		boolean check = true;
		int count = 0;
		
		while(true) {
			
			// 컴퓨터 난수 생성
			while(check) {
				
				for (int i = 0; i < com.length; i++) {
					com[i] = random();
					
					for (int j = 0; j < i; j++) {
						if (com[i] == com[j]) {
							i--;
							break;
						}
						else check = false;
					}
				}
			}
			
//			System.out.print("컴퓨터 : ");
//			for (int i = 0; i < com.length; i++) {
//				System.out.print(com[i] + " ");
//			}
//			System.out.println();
			
			int strike = 0;
			int ball = 0;
			int out = 3;
			
			System.out.print("숫자 3개를 입력하세요! : ");
			for (int i = 0; i < user.length; i++) {
				user[i] = scanner.nextInt();
			}
			
			for (int i = 0; i < user.length; i++) {
				if (com[i] == user[i]) {
					strike++;
				}
				
				for (int j = 0; j < user.length; j++) {
					if (i != j && com[i] == user[j]) {
						ball++;
					}
				}
			}
			
			count++;
			out = out - (strike + ball);
			
			System.out.println(strike + "스트라이크 " + 
					ball + "볼 " + out + "아웃\n");
			
			if (strike == 3) {
				System.out.println("정답! 총 " + count + 
						"번 만에 맞추셨습니다.");
				System.out.println("게임을 더 진행 하시겠습니까?");
				System.out.print("재시작(1) 종료(0) : ");
				int choice = scanner.nextInt();
				
				if (choice == 1) {
					System.out.println("\n게임 재시작!\n");
					count = 0;
					check = true;
					continue;
				}
				else if (choice == 0) {
					System.out.println("\n게임 종료");
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		game();
		
	}
	
}
