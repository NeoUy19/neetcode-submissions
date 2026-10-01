class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] columns = new HashSet[9];
        Set<Character>[] boxIndex = new HashSet[9];

        for (int i = 0; i < 9 ; i++){
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxIndex[i] = new HashSet<>();
        }

        for (int r = 0 ; r < 9; r++){
            for (int c = 0 ; c < 9 ; c++){
                Character currSpace = board[r][c];
                if (currSpace == '.'){
                    continue;
                }
                if (!rows[r].add(currSpace)){
                    return false;
                }
                if (!columns[c].add(currSpace)){
                    return false;
                }
                if (!boxIndex[r/3 * 3 + c/3].add(currSpace)){
                    return false;
                }
            }
        }
        return true;
    }
}
