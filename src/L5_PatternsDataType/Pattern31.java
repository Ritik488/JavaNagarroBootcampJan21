package L5_PatternsDataType;

public class Pattern31 {

	public static void main(String[] args) {

		int n = 5;

		int row = 1;
		while (row <= n) {

			int val = n;

			// work
			for (int col = 1; col <= n; col = col + 1) {

				if (row + col == n + 1)
					System.out.print("* ");
				else
					System.out.print(val + " ");

				val = val - 1;

			}

			// changes
			System.out.println();
			row = row + 1;

		}
	}
}
