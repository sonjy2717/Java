
public class Test {
	
	public static void main(String[] args) {
		
		int num = 10;
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < num; i++) {
			for (int j = i; j < num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < num; i++) {
			
			for (int j = i + 1; j < num; j++) {
				System.out.print("  ");
			}
			
			for (int j = 0; j <= i; j++) {
				System.out.print("* "); 
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < num; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			
			for (int j = i; j < num; j++) {
				System.out.print("* "); 
			}
			System.out.println();
		}
		
	}
	
}
