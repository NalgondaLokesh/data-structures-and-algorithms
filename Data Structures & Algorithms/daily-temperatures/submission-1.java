class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        int days = 0;
        for(int i=0;i<temperatures.length-1;i++){
            for(int j=i+1;j<temperatures.length;j++){
                int currentTemp = temperatures[i];
                days++;
                if(currentTemp < temperatures[j]){
                    ans[i] = days;
                    break;
                }         
            }
            days = 0;
        }
        return ans;
    }
}
