package ex06array;

import java.util.Scanner;

/*
길이가 10인 배열을 선언한후 총 10개의 정수를 입력받아 
순서대로 저장한다. (첫번째배열)
그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서부터 채워나가고 
짝수는 배열의 끝에서부터 채워나간다.(두번째배열)

실행결과]
	1번째 정수를 입력하세요:2
	2번째 정수를 입력하세요:4
	3번째 정수를 입력하세요:5
	4번째 정수를 입력하세요:3
	5번째 정수를 입력하세요:2
	6번째 정수를 입력하세요:9
	7번째 정수를 입력하세요:7
	8번째 정수를 입력하세요:8
	9번째 정수를 입력하세요:5
	10번째 정수를 입력하세요:1
	순서대로입력된결과
	2 4 5 3 2 9 7 8 5 1 
	홀수/짝수 구분입력결과
	5 3 9 7 5 1 8 2 4 2 
 */

/*
public class QuFillArray {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		int arr1Index = 0;
		int arr2Index = 9;
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print((i + 1) + "번째 정수를 입력하세요 : ");
			arr1[i] = scan.nextInt();
		}
		
		System.out.println("순서대로 입력된 결과");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		for (int i = 0; i < arr1.length; i++) {
			
			if (arr1[i] % 2 == 0) {
				arr2[arr2Index--] = arr1[i];
			}
			else {
				arr2[arr1Index++] = arr1[i];
			}
		}
		
		System.out.println("\n홀수/짝수 구분 입력 결과");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		scan.close();
	}
}
*/

public class QuFillArray {
	
	public static void main(String[] args) {
		
		// 입력받은 정수를 순서대로 입력할 배열
		int[] arr1 = new int[10];
		// 홀짝을 구분해서 입력할 배열
		int[] arr2 = new int[10];
		
		// 사용자는 정수 10개를 입력한다
		Scanner scan = new Scanner(System.in);
		
		// arr2 배열의 시작 인덱스와 마지막 인덱스를 변수에 지정
		int indexStart = 0;
		int indexEnd = arr2.length - 1; //9; => 배열의 크기가 결정되면 length를 사용하는게 좋다
		
		for (int i = 0; i < arr1.length; i++) {
			
			System.out.print("정수를 입력하세요 : ");
			int inputNum = scan.nextInt();
			
			// 첫 번째 배열에는 입력한 순서대로 채워준다
			arr1[i] = inputNum;
			
			// 두 번째 배열은 홀짝을 구분해서 채워준다
			if (inputNum % 2 == 0) {
				// 짝수 일 때 : 배열의 끝에서부터 채워나간다
				// 값을 채운 후 인덱스는 1 차감한다
				arr2[indexEnd--] = inputNum;
			}
			else {
				// 홀수 일 때 : 배열의 처음부터 채워나간다
				// 값을 채운 후 인덱스는 1 증가한다
				arr2[indexStart++] = inputNum;
			}
			/*
			만약 인덱스를 전위 증가 혹은 감소 시키게되면 변수의 값이
			먼저 변하므로 잘못된 결과가 나온다. 해당 인덱스에 먼저 값을
			삽입해야 하므로 반드시 후위 연산 해야한다
			 */
		}
		
		// 첫 번째 배열 출력
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		// 두 번째 배열 출력
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		scan.close();
	}
}

