package quiz;

public class QuUpgradeGuGu {

	public static void main(String[] args) {
		
		for (int i = 2; i <= 9; i++) {
			
			int result = 1;
			
			for (int j = 1; j <= 9; j++) {
				
				System.out.print(i + " X ");
				
				for (int k = 1; k < (j + 1); k++) {
					
					if (j == 1 && k == 1) {
						System.out.print("1");
					}
					else if (k != j) {
						System.out.print(i);
					}
					
					if ((j - 1) > k) {
						System.out.print(" X ");
					}
					
					result = 1;
					for (int x = i; x <= (i + j - 1); x++) {
						result *= i;
					}
				}
				System.out.print(" = " + result);
				System.out.println();
			}
			System.out.println();
		}
	}
}
