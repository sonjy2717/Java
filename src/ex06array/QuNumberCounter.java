package ex06array;
/*
다음에 주어진 answer 배열에는 1~4까지의 정수가 여러개 저장되어 있다. 
배열 전체의 데이터를 읽어서 각 정수가 몇개씩 있는지 카운트하여 
counter 배열에 순서대로 저장하시오.

샘플코드]
	int[] answer = { 1,4,4,3,1,4,4,2,1,3,2  };
	int[] counter = new int[4];
	
실행결과]
	counter[0] => 3
	counter[1] => 2
	counter[2] => 2
	counter[3] => 4
 */

/*
public class QuNumberCounter {
	
	public static void main(String[] args) {
		
		int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		int[] counter = new int[4];
		
		for (int i = 0; i < answer.length; i++) {
			
			counter[answer[i] - 1]++;
		}
		
		for (int i = 0; i < counter.length; i++) {
			System.out.printf("counter[%d] => %d\n", i, counter[i]);
		}
	}
}
*/

public class QuNumberCounter {
	
	public static void main(String[] args) {
		
		int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		// 배열선언시 크기만 지정되는 경우 0으로 초기화된다.
		int[] counter = new int[4];
		
		// answer 배열의 크기만큼 반복
		for (int i = 0; i < answer.length; i++) {
			// i번째 인덱스 요소가 만약 1이라면 i번째 요소를 1 증가
			if (answer[i] == 1) counter[0]++;
			if (answer[i] == 2) counter[1] += 1;
			if (answer[i] == 3) counter[2] = counter[2] + 1;
			if (answer[i] == 4) counter[3] = counter[3] + 1;
		}
		
		// counter 배열 출력
		for (int i = 0; i < counter.length; i++) {
			System.out.printf("counter[%d] %d의 갯수 : %d\n", i, i + 1, counter[i]);
		}
	}
}

