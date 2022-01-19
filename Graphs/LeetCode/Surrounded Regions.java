class Solution {
    public void dfs(char [][] board, int i , int j)
    {
        if(i < 0 || j < 0 || i > board.length - 1 || j > board[0].length - 1 || board[i][j] == 'X' || board[i][j] == '@')     return;
        
        board[i][j] = '@';
        
        dfs(board, i + 1,j);
        dfs(board, i ,j+1);
        dfs(board, i - 1,j);
        dfs(board, i, j - 1);
        
    }
    public void solve(char[][] board) {
        //boundary case
        for(int i = 0; i < board.length;i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
                if(i == 0 || j == 0 || i == board.length - 1 || j == board[0].length - 1){
                    if(board[i][j] == 'O'){
                        dfs(board,i,j);
                    }
                }
            }
        }
        
        //flipping 'O's into 'X's
        
        for(int i = 0;i < board.length; i++){
            for(int j = 0;j < board[0].length; j++){
                if(board[i][j] == '@'){
                    board[i][j] = 'O';
                }
                else{
                    board[i][j] = 'X';
                }
            }
        }
    }
}
