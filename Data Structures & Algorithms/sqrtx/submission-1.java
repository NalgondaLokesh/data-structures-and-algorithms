class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        
        long left = 1;
        long right = x;
        long ans = 0;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                ans = mid;         // Store the valid floor value
                left = mid + 1;    // Try looking for a larger answer on the right
            } else {
                right = mid - 1;   // Look on the left
            }
        }
        
        return (int) ans;
    }
}