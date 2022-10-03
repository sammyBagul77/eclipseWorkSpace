package arrEx;

import java.util.Scanner;

public class nw {

	public static void main(String[] args) {
		int[][] var = new int[3][2];
		Scanner Sc = new Scanner(System.in);
		for (int i = 0; i < var.length; i++) {
			for (int j = 0; j < var[i].length; j++) {
				System.out.print("Enter the value of var[" + i + "][" + j + "]: ");
				var[i][j] = Sc.nextInt();

			}

		}
		System.out.println("******************************************");

		for (int i = 0; i < var.length; i++) {
			for (int j = 0; j < var[i].length; j++) {
				System.out.print(var[i][j] + "  ");

			}
			System.out.println(" ");
		}

	}
}
