class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int maxarea = 0;
        int left = 0;
        int right = heights.length-1;
        while(left<right){
            int width = right-left;
            int height = Math.min(heights[left],heights[right]);
            maxarea = Math.max(maxarea,width*height);
            if(left<=right){
                left++;
            }
            else if(left>right){
                right--;
            }

        }
        return maxarea;
    }
}
