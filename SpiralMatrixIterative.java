package lovebabbar;

public class SpiralMatrixIterative {

	private static void printSpiralMatrix(int ar[][], int rows, int cols) {

		int dir = 0;
		int top = 0;
		int down = rows - 1;
		int left = 0;
		int right = cols - 1;

		while (top <= down && left <= right) {

			switch (dir) {

				case 0:
					for (int i = left; i <= right; i++) {
						System.out.print(ar[top][i]+" ");
					}
					++top;
					break;
				case 1:
					for (int i = top; i <= down; i++) {
						System.out.print(ar[i][right]+" ");
					}
					--right;
					break;
				case 2:
					for (int i = right; i >= left; i--) {
						System.out.print(ar[down][i]+" ");
					}
					--down;
					break;
				case 3:
				for(int i=down;i>=top;--i){
					System.out.print(ar[i][left]+" ");
				}
				++left;
					break;
				default:
					break;

			}
			dir = (dir + 1) % 4;
			System.out.println("\n");
		}

	}

	public static void main(String[] args) {

		int ar[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int rows = 4;
		int cols = 4;
		printSpiralMatrix(ar,rows, cols);

	}
}
