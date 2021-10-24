package quiz;

import java.util.Random;

public class QuSelectionSort {
	
	static int[] arr = new int[10];
	static Random r = new Random();
	
	public static void showArr() {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void createNum() {
		
		while (true) {
			boolean flag = false;
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = r.nextInt(100);
			}
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i] == arr[j] && i != j) {
						flag = true;
					}
				}
			}
			if (flag == false) break;
		}
	}
	
	public static void selectionSort() {
		
		for (int i = 0; i < arr.length - 1; i++) {
			
			int minIndex = i;
			
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			
			System.out.println();
			showArr();
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		createNum();
		
		System.out.print("정렬 전 : ");
		showArr();
		System.out.println();
		
		selectionSort();
		
		System.out.print("\n정렬 후 : ");
		showArr();
		
	}
	
}
