class Solution {
    public void solveSudoku(char[][] board) {
        SudokuSolver(board, 0, 0);
	}
	public static boolean SudokuSolver(char[][] grid, int row, int col) {
		if (col == 9) {
			col = 0;
			row++;
		}
		if (row == 9) {
			return true;
		}
		if (grid[row][col] != '.') {
			 return SudokuSolver(grid, row, col + 1);
		} 
		else {
			for (char val = '1'; val <= '9'; val++) {
				if (isitsafe(grid, row, col, val)) {
					grid[row][col] = val;
					if(SudokuSolver(grid, row, col + 1)) return true;
					grid[row][col] = '.';
				}
			}
		}
        return false;
	}

	public static boolean isitsafe(char[][] grid, int row, int col, char val) {
		// TODO Auto-generated method stub
		// row
		for (int i = 0; i < grid[0].length; i++) {
			if (grid[row][i] == val) {
				return false;
			}
		}
		// col
		for (int i = 0; i < grid.length; i++) {
			if (grid[i][col] == val) {
				return false;
			}
		}
		// 3*3 Matrix
		int r = row - row % 3;
		int c = col - col % 3;
		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (grid[i][j] == val) {
					return false;
				}
			}

		}
		return true;
	}
}