package ex05method;

/*
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 
리턴하는 함수와 화씨를 입력받아서 섭씨로 변환하여
리턴하는 함수를 만들어라.
	공식]
		화씨 = 1.8 * 섭씨 + 32
		섭씨 = (화씨 - 32) / 1.8
*/

/*
public class QuTemperature {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("섭씨 입력 : ");
		double s = scanner.nextDouble();
		System.out.print("화씨 입력 : ");
		double h = scanner.nextDouble();
		
		double resultS = celsius(s);
		double resultH = fahrenheit(h);
		
		System.out.printf("섭씨 -> 화씨 : %g\n", resultS);
		System.out.printf("화씨 -> 섭씨 : %g\n", resultH);
		
		scanner.close();
	}
	
	// 섭씨 -> 화씨
	public static double celsius(double num) {
		return 1.8 * num + 32;
	}
	
	// 화씨 -> 섭씨
	public static double fahrenheit(double num) {
		return (num - 32) / 1.8;
	}
	
}
*/

public class QuTemperature {

	public static void main(String[] args) {
		
		System.out.println("섭씨23도 => 화씨 : " + celsius(23));
		System.out.println("화씨98도 => 섭씨 : " + fahrenheit(98.3));
	}
	
	// 섭씨 -> 화씨
	public static double celsius(double cel) {
		return (1.8 * cel + 32);
	}
	
	// 화씨 -> 섭씨
	public static double fahrenheit(double fah) {
		return ((fah - 32) / 1.8);
	}
	
}

