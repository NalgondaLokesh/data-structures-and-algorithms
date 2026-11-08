class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] vis = new boolean[rows][cols];
        int[][] dirs = {{1,0},{0,1},{-1,0},{0,-1}};
        int area = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    q.offer(new int[]{i,j});
                    vis[i][j] = true;

                    while(!q.isEmpty()){
                        int[] curr = q.poll();
                        int currRow = curr[0];
                        int currCol = curr[1];
                        for(int[] dir:dirs){
                            int newRow = currRow + dir[0];
                            int newCol = currCol + dir[1];
                            if(newRow>=0 && newCol>=0 && newRows<rows && newCols<cols && grid[newRow][newCol]==1 && !vis[newRow][newCol]){
                                area++;
                                maxAread - 
                            }
                        }
                    }
                }
            }
        }
    }
}
