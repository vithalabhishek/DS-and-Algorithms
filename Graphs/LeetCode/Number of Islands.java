class Solution {
    public void dfs(char[][]grid, int row, int col)
    {
        if(row < 0 || col < 0 || row > grid.length - 1 || col > grid[0].length - 1  || grid[row][col] == '0')
            return;
        
        grid[row][col] = '0';
        
        dfs(grid,row,col+1);//0,1
        dfs(grid,row + 1,col);//1,0
        dfs(grid,row-1 , col);//-1,0
        dfs(grid,row,col - 1);//0,-1
        
    }
    
    public int numIslands(char[][] grid) {
        
        int answer = 0;
        
        for(int row = 0; row <= grid.length - 1; row++)
        {    for(int col = 0; col <= grid[0].length - 1; col++)
            {
                if(grid[row][col] == '1')
                {
                    answer ++;
                    dfs(grid,row,col);
                }
            }
        }
        return answer;
    }
}
