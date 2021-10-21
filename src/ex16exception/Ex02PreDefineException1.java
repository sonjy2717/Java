package ex16exception;

public class Ex02PreDefineException1 {
	
	public static void main(String[] args) {
		
		System.out.println("### ArrayIndexOutOfBoundsException ###");
		int[] intArr = new int[2];
		try {
			intArr[0] = 100;
			System.out.println("0번방은 : " + intArr[0]);
			intArr[1] = 200;
			System.out.println("1번방은 : " + intArr[1]);
			
			// 예외가 발생하는 지점
			intArr[2] = 300;//자바컴파일러(JVM)가 예외객체를 프로그램으로 던진다.
			System.out.println("???? : " + intArr[2]); // 실행되지않음
		}
		catch (ArrayIndexOutOfBoundsException e) {
			//JVM이 throw한 예외객체를 catch절에서 잡아 처리한다.
			System.out.println("예외 발생"); //예외메세지1
			System.out.println("예외 메세지 : " + e.getMessage());//예외메세지2(간략)
			e.printStackTrace(); //예외메세지3(가장 많이 사용됨 : 디테일)
		}
		
		System.out.println("0번방 재출력 : " + intArr[0]);
		System.out.println("==ArrayIndexOutOfBoundsException발생 후==");
		// 실행의 흐름이 중단되지 않으므로 마지막까지 실행된 후 종료된다.
	}
	
}
