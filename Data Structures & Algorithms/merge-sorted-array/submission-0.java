class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[n+m];
        int i = 0;
        while(i<m){
            ans[i] = nums1[i];
            i++;
        }
        int j = 0;
        while(j<n){
            ans[i] = nums2[j];
            i++;
            j++;
        }
        Arrays.sort(ans);
        for(int z=0;z<ans.length;z++){
            nums1[z] = ans[z];
        }
    }
}