package Package1;

public class Basic_Pyramid {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			// Print leading space
			for (int s = 1; s <= 5 - i; s++) {
				System.out.print(" ");
			}

			// Print Numbers
			for (int n = 1; n <= i; n++) {
				System.out.print("*" + " ");
			}
			// Move to Next Line
			System.out.println();

		}
	}
}
