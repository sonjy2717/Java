package ex06array;

import java.util.Scanner;

/*
사용자로 부터 아이디를 입력받은 후 다음 조건에 만족하는지 확인할 수 있는 
프로그램을 작성하시오.
아이디는 8~12자 사이로만 사용할 수 있다. (length() 메서드 활용)
영문과 숫자로만 입력할 수 있다. (charAt() 메서드 활용)
특수기호, 공백, 그 외 모든 특수기호는 입력할 수 없다. 
위 조건에 만족하면 true, 만족하지 않으면 false를 반환한다. 
메서드명 : boolean idValidate(String inputId)

실행결과]
아이디를 입력하세요 : kosmo123
사용할 수 있는 아이디입니다. 

아이디를 입력하세요 : ko^smo 99
사용할 수 없습니다.
 */
public class QuValidateId {
	
	public static void main(String[] args) {
		
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요: ");
		String id = scan.nextLine();
		
		if (idValidate(id)) {
			System.out.println("사용할 수 있는 아이디입니다.");
		}
		else {
			System.out.println("사용할 수 없습니다");
		}
		
		scan.close();
		
	}
	
	public static boolean idValidate(String inputId) {
		
		boolean result = true;
		
		if (inputId.length() < 8 || inputId.length() > 12) return false;
		
		for (int i = 0; i < inputId.length(); i++) {
			if ((inputId.charAt(i) >= 'a' && inputId.charAt(i) <= 'z') ||
					(inputId.charAt(i) >= '0' && inputId.charAt(i) <= '9') ||
					(inputId.charAt(i) >= 'A' && inputId.charAt(i) <= 'Z')) {
				result = true;
			}
			else {
				return false;
			}
		}
		
		return result;
	}
	*/
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요: ");
		String id = scanner.nextLine();
		
		boolean isOk = idValidate(id);
		
		if (isOk == true) {
			System.out.println("사용 가능한 아이디입니다.");
		}
		else {
			System.out.println("아이디 제대로 입력해");
		}
		
		scanner.close();
		
	}
	
	public static boolean idValidate(String inputId) {
		
		// 아이디 유효성 확인용 변수
		boolean idOk = true;
		
		// 아이디의 길이 확인(8~12자)
		if (inputId.length() >= 8 && inputId.length() <= 12) {
			// 영문, 숫자의 조합인지 확인
			// 입력한 아이디의 길이만큼 반복
			for (int i = 0; i < inputId.length(); i++) {
				// 각 문자가 영문 or 숫자인지 확인
				char idChar = inputId.charAt(i);
				if (!((idChar >= 'a' && idChar <= 'z') ||
						(idChar >= 'A' && idChar <= 'Z') ||
						(idChar >= '0' && idChar <= '9'))) {
					// 아이디가 영문+숫자 조합이 아니라면 false로 처리한다.
					idOk = false;
					// 반복문을 탈출한다.
					break;
				}
			}
		}
		else {
			// 아이디의 길이가 잘못되었을때
			idOk = false;
		}
		
		return idOk;
	}
	
}
