class Solution {
    public int countComponents(int n, int[][] edges) {
        int count = 0;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int a = edge[0];
            int b = edge[1];
            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }
        boolean[] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
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
