package lovebabbar;

import java.util.HashMap;
import java.util.Map;

public class SpiralMatrixPrint {

	private static Map<Integer, Integer> map = new HashMap<>();

	public static void printSprial(int ar[][], int row, int col, int curr_row, int curr_col) {

		if (curr_row > row-1 || curr_col > col-1)
			return;
		if (curr_row < 0 || curr_col < 0)
			return;

		if (map.containsKey(curr_row) && map.containsValue(curr_col))
			return;

		System.out.println(ar[curr_row][curr_col] + " ");
		map.put(curr_row, curr_col);
		printSprial(ar, row, col, curr_row, ++curr_col);
		printSprial(ar, row, col, ++curr_row, curr_col);
		printSprial(ar, row, col, curr_row, --curr_col);
		printSprial(ar, row, col, --curr_row, curr_col);

	}

	public static void main(String[] args) {
		int a[][] = { 
						{ 1, 2, 3, 4 }, 
						{ 5, 6, 7, 8 }, 
						{ 9, 10, 11, 12 }, 
						{ 13, 14, 15, 16 } 
					};
		int m = 4;
		int n = 4;
		printSprial(a, m, n, 0, 0);

	}

}
