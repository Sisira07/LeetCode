class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
         int cursum=0;

        for(int i=0;i<nums.length;i++){
            cursum=Math.max(cursum+nums[i],nums[i]);
            maxsum=Math.max(maxsum,cursum);
        }
        return maxsum;
    }
}