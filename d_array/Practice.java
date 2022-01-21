package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("별 몇단?");
		int star = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= star; i++) {               // 트리 거꾸로
			for (int j = 0; j < i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 2 * star - 1; k >= 2 * i - 1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i <= star; i++) {               // 트리
			for (int j = star - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}