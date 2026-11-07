class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int timeTaken = 0;
        int rottenOranges = 0;
        int freshOranges = 0;
        Queue<int[]> q = new LinkedList<>();
        int[][] dirs = {{-1,0},{0,1},{1,0},{0,-1}};

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==2){
                    rottenOranges++;
                    q.offer(new int[]{i,j});
                } 
                else if(grid[i][j]==1){
                    freshOranges++;
                }
            }
        }

        while(!q.isEmpty() && freshOranges>0){
            int sizeOfQueue = q.size();
            for(int i=0;i<sizeOfQueue;i++){
                int[] curr = q.poll();
                int currRow = curr[0];
                int currCol = curr[1];
                for(int[] dir:dirs){
                    int newRow = currRow + dir[0];
                    int newCol = currCol + dir[1];
                    if(newRow>=0 && newCol>=0 && newRow<rows && newCol<cols && grid[newRow][newCol]==1){
                        q.offer(new int[]{newRow,newCol});
                        grid[newRow][newCol] = 2;
                        freshOranges--;
                    }
                }
            }
            timeTaken++;
        }
        if(freshOranges>0){
            return -1;
        }
        return timeTaken;
    }
}
