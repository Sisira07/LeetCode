class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int pref=1;

        for(int i=0;i<n;i++){
            ans[i]=pref;
            pref*=nums[i];
        }

        int suff=1;
        for(int j=n-1;j>=0;j--){
            ans[j]*=suff;
            suff*=nums[j];
        }
        return ans;
    }
}