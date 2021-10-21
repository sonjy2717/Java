package ex06array;

public class E01OneDimArray01 {
	
	public static void main(String[] args) {
		
		/*
		자바에서는 배열을 객체를 통해 생성하게 된다.
		생성된 배열은 Heap영역에 저장되고, 할당된 메모리의
		주소 값을 반환한다. 그래서 배열명(배열변수)는 주소 값(참조 값)을
		할당받게 된다. 해당 주소를 통해 배열에 접근할 수 있다.
		 */
		
		// 크기가 3인 정수형 배열 선언
		int[] numArr = new int[3];
		// 인덱스 0부터 배열 초기화
		numArr[0] = 10;
		numArr[1] = 20;
		numArr[2] = 30;
		// 배열의 인덱스를 통한 접근
		System.out.println("numArr 0번 방의 값 : " + numArr[0]);
		System.out.println("numArr 1번 방의 값 : " + numArr[1]);
		System.out.println("numArr 2번 방의 값 : " + numArr[2]);
		// Heap영역에 생성된 배열의 참조 값(주소 값) 출력
		System.out.println("배열명(numArr) = " + numArr);
		System.out.println("===================================");
		
		/*
		배열의 선언 및 초기화
			: 배열은 여러개의 변수를 사용하기 위해 선언하므로
			접근을 위해 일반적으로 반복문을 사용한다.
		배열명.length
			: 해당 배열의 크기를 반환한다. 배열의 크기가 변경되는
			경우 유연하게 사용할 수 있다.
		 */
		int[] arrNumber = new int[40];
		// 배열의 초기화 : 0번방에 10을 삽입한 후 1씩 증가시키면서 초기화
		for (int i = 0; i < arrNumber.length; i++) {
			arrNumber[i] = i + 10;
		}
		// 배열의 크기가 변경되는 경우 해당 for문도 변경해야한다.
		for (int i = 0; i < 40; i++) {
			// 각 배열요소 출력
			System.out.println(i + "번 방의 값 = " + arrNumber[i]);
		}
		System.out.println("===================================");
		
		/*
		객체 배열 : 기본자료형을 저장하는 배열이 아닌 객체의 참조 값을
			저장할 용도로 생성하는 배열이다. 사용법은 동일하다.
		 */
		String[] strArr = new String[3];
		strArr[0] = "java";
		strArr[1] = "jsp";
		strArr[2] = "spring";
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		System.out.println("===================================");
		
		
		System.out.println("배열의 선언과 초기화");
		System.out.println("방법1 : 배열의 선언 이후 초기화");
		int[] initArr = new int[1];
		initArr[0] = 100;
		System.out.println("initArr[0] = " + initArr[0]);
		
		/*
		배열의 선언과 동시에 초기화를 하는 경우 자바 컴파일러는
		초기 값의 갯수를 통해 크기를 결정할 수 있다. 따라서 이런 경우
		크기는 생략하도록 약속되어있다.
		 */
		System.out.println("방법2 : 선언과 동시에 초기화");
		//int[] initArr2 = new int[3] {1, 20, 300}; 에러발생
		int[] initArray2 = new int[] {1, 20, 300};
		
		/*
		배열 요소의 갯수를 통해 배열을 생선한 후 초기화까지 동시에
		진행한다. 이 경우 new를 생략할 수 있다.
		 */
		System.out.println("방법3 : 초기 값만으로 선언");
		int[] initArr3 = {11, 13, 17, 19, 23}; // 크기는 5로 지정됨
		int arrSum = 0;
		// 요소의 갯수만큼 루프되면서 각 요소를 누적해서 더함
		for (int i = 0; i < initArr3.length; i++) {
			arrSum += initArr3[i];
		}
		System.out.println("배열 요소의 합 = " + arrSum);
		
	}
	
}
