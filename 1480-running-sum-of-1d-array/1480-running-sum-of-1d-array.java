class Solution {
    public int[] runningSum(int[] nums) {
        int curSum=0;
        int[] runningSum=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            curSum+=nums[i];
            runningSum[i]=curSum;
        }
        return runningSum;
    }
}