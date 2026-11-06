class Solution {
    public int countComponents(int n, int[][] edges) {
        int count = 0;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n];

        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        
        
        for(int i=0;i<n;i++){
            if(!vis[i]){
               q.offer(i);
                vis[i] = true;
                while(!q.isEmpty()){
                    int node = q.poll();
                    for(int neigh:adjList.get(node)){
                        if(!vis[neigh]){
                            q.offer(neigh);
                            vis[neigh] = true;
                        }
                    }
                }
                count++;
            }
        }
        return count;
    }
}
