class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int diff=0;
        int[] res=new int[2];

        for(int i=0;i<nums.length;i++){
            diff=target-nums[i];
            if(mpp.containsKey(diff)){
                res[0]=i;
                res[1]=mpp.get(diff);
                return res;
            }
            mpp.put(nums[i],i);
        }
        return res;
    }
}