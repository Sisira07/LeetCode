class Solution {
    public int sumofD(int num){
        int sum=0;

        while(num>0){
            int dig=num%10;
            sum+=dig;
            num/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(sumofD(nums[i])==i){
                return i;
            }
        }
        return -1;
    }
}