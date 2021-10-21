package ex06array;

public class E05TwoDimArray02 {
	
	public static void main(String[] args) {
		
		// 세로크기3, 가로크기4인 2차원 배열 선언
		int[][] arr2Dim = new int[3][4];
		
		// 각 행과 열의 크기만큼 반복하면서 초기화 진행
		for (int i = 0; i < 3; i ++) {
			for (int j = 0; j < 4; j++) {
				arr2Dim[i][j] = i + j;
			}
		}
		
		// 초기화된 데이터를 출력한다
		/*
		배열명.length => 배열의 세로길이. 즉 행의 길이가 반환됨.
		배열명[index].length => 배열의 가로길이. 즉 열의 길이가 반환됨.
		 */
		for (int n = 0; n < arr2Dim.length; n++) {
			for (int m = 0; m < arr2Dim[n].length; m++) {
				System.out.print(arr2Dim[n][m] + " ");
			}
			System.out.println();
		}
		
		/*
		시나리오] 다음 절차에 따라 프로그램을 작성하시오.
		1. 2차원 배열을 선언한다. 세로2, 가로4
		2. 난수를 이용하여 배열을 초기화한다.
		3. 배열 전체 요소를 매개변수로 전달된 정수만큼 증가시킨다.
		4. 증가되기 전, 후 배열을 출력한다.
		5. 다음 메서드명으로 구현한다. twoDimPlus()
		 */
		
		int[][] twoArray = new int[2][4];
		for (int i = 0; i < twoArray.length; i++) {
			for (int j = 0; j < twoArray[i].length; j++) {
				// 난수를 생성하여 초기화.
				twoArray[i][j] = (int)(Math.random() * 100);
			}
		}
		
		System.out.println("=초기화 후=========================");
		showArray(twoArray);
		
		twoDimPlus(twoArray, 10);
		
		System.out.println("=메서드 호출 후====================");
		showArray(twoArray);
	}
	
	// 2차원 배열 출력용 메서드
	public static void showArray(int[][] arr2) {
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.printf("%3d", arr2[i][j]);
			}
			System.out.println();
		}
	}
	
	// 2차원 배열에 전달된 매개변수만큼 각 요소를 증가시키는 메서드
	public static void twoDimPlus(int[][] arr2, int plusNum) {
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] += plusNum;
			}
		}
	}
}
