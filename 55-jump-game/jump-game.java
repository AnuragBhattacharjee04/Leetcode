class Solution {
    public boolean canJump(int[] nums) {
        int high = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (i > high) {
                return false;
            }
            if (i + nums[i] > high) {
                high = i + nums[i];
            }
            if (high >= nums.length - 1) {
                return true;
            }
        }
        
        return high >= nums.length - 1;
    }
}