class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(board[i][j]==word.charAt(0) && helper(board, word, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean helper(char[][] board, String word, int i, int j, int count){
        if(count==word.length()){
            return true;
        }

        if(i<0 || j<0 || i>=board.length || j>=board[0].length || word.charAt(count)!=board[i][j]){
            return false;
        }

        char temp = board[i][j];
        board[i][j] = ' ';

        boolean found = helper(board, word, i-1,j, count+1) || 
        helper(board, word, i,j-1, count+1) || 
        helper(board, word, i+1,j, count+1) ||
        helper(board, word, i,j+1, count+1) ;

        board[i][j]=temp;
        return found;
    }
}