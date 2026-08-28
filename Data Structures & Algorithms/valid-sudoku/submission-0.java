

class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> seen = new HashSet<>();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                char num = board[row][col];

                if (num == '.') {
                    continue;
                }

                // Row
                if (!seen.add(num + " in row " + row)) {
                    return false;
                }

                // Column
                if (!seen.add(num + " in col " + col)) {
                    return false;
                }

                // 3x3 box
                int box = (row / 3) * 3 + (col / 3);

                if (!seen.add(num + " in box " + box)) {
                    return false;
                }
            }
        }

        return true;
    }
}