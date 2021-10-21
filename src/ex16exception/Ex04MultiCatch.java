package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
예외처리를 할때 필요에 따라 여러개의 catch블럭을 사용할 수 있다.
이 경우 반드시 자식 예외 클래스부터 catch블럭에 사용해야 한다.
Exception 클래스는 모든 예외를 catch하기 때문에 마지막 블럭에
사용해야 한다. 상속의 구조는 ctrl + t로 확인할 수 있다.
 */
public class Ex04MultiCatch {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[3];
		
		try {
			for (int i = 0; i < array.length; i++) {
				System.out.print("array["+ i +"]에 저장할 숫자입력 : ");
				// 입력 값에 "11a"와 같이 하면 예외발생
				array[i] = Integer.parseInt(scanner.nextLine());
			}
			
			System.out.println("배열에 저장된 두 숫자 나누기 : " +
					array[0]/array[1]);//두 번째 입력 값에 0입력시 예외발생
			
			System.out.print("나이를 입력하세요 : ");
			int age = scanner.nextInt();//"10살"과 같이 입력시 예외발생
			System.out.println("당신의 나이는 : " + age);
			
			array[3] = age;// 배열의 인덱스를 초과하여 예외발생
		}
		catch (InputMismatchException e) {
			System.out.println("숫자로만 입력해야 합니다");
		}
		catch (ArithmeticException e) {
			System.out.println("산술연산이 불가능 합니다");
		}
		catch (NumberFormatException e) {
			System.out.println("숫자형태의 문자만 입력 가능합니다");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스를 초과하였습니다");
		}
		catch (Exception e) {
			System.out.println("예외가 발생하였습니다");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("==프로그램 끝==");
		scanner.close();
	}
	
}
