class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9]; 
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] box = new HashSet[9];

        for (int i = 0 ; i < 9 ; i++){ //initialize each row/col/box
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for (int row = 0 ; row < 9 ; row++){
            for (int col = 0 ; col < 9; col++){
                char curr = board[row][col];
                if (board[row][col] == '.'){
                    continue;
                }
                else {
                    if (!rows[row].add(curr)){
                        return false;
                    }
                    if(!cols[col].add(curr)){
                        return false;
                    }
                    if (!box[row/3 * 3 + col/3].add(curr)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
