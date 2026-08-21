class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;

        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int i=0;
        int maxSum=sum;

        for(int j=k;j<nums.length;j++){
            sum=sum-nums[i]+nums[j];
            maxSum=Math.max(sum,maxSum);
            i++;
        }
        return (double) maxSum/k;
    }
}