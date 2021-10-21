package quiz;

import java.util.Random;

/*
public class QuBubbleSort {
	
	public static int random() {
		
		Random r = new Random();
		
		return r.nextInt(100) + 1;
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		boolean check = true;
		
		// 컴퓨터 난수 생성(중복X)
		while(check) {
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = random();
				
				for (int j = 0; j < i; j++) {
					if (arr[i] == arr[j]) {
						i--;
						break;
					}
					else check = false;
				}
			}
		}
		
		System.out.print("정렬 전 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print((i + 1) + "회차 : ");
			for (int j = 1; j < arr.length; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
			for (int k = 0; k < arr.length; k++) {
				System.out.print(arr[k] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.print("정렬 후 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
*/

public class QuBubbleSort {
	
	public static void main(String[] args) {
		
		// 중복되지 않는 난수를 생성
		Random random = new Random();
		int[] arr = new int[10];
		
		while (true) {
			// 난수 10개 생성
			for (int i = 0; i < arr.length; i++) {
				arr[i] = random.nextInt(100);
			}
			// 중복체크를 위한 변수
			boolean rndFlag = false;
			// 중복확인
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i] == arr[j] && i != j) {
						// 중복된 값이 발견되면 true
						rndFlag = true;
					}
				}
			}
			// 중복된 값이 없다면 while문 탈출
			if (rndFlag == false) break;
			System.out.println("난수생성시도");
		}
		
		// 난수 확인
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// 버블 정렬
		int temp;
		/*
		크기가 10인 배열이므로 스캔은 9번만 반복하면 된다.
		즉, i의 증가치는 0~8까지 변하게 된다.
		 */
		for (int i = 0; i < arr.length - 1; i++) {
			/*
			실제 요소 값에 대한 비교를 진행하여 큰 숫자를 뒤로 보내준다.
			즉, 요소1과 2를 비교하여 요소1이 크다면 두 요소를 교환(swap)한다.
			한 번 스캔을 완료하면 가장 큰 숫자가 제일 뒤로 밀리게 되므로
			비교의 구간을 하나씩 줄여주기 위해 i만큼을 차감한다.
			 */
			for (int j = 0; j < (arr.length - 1) - i; j++) {
				// 앞의 숫자가 더 크다면 뒤의 숫자와 교환한다.
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			
			for (int k = 0; k < arr.length; k++) {
				System.out.print(arr[k] + " ");
			}
			System.out.println();
		}
		
		// 정렬된 난수를 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}