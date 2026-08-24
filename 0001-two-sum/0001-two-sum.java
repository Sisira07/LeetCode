class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int[] res=new int[2];

        for(int i=0;i<nums.length;i++){
            if(mpp.containsKey(target-nums[i])){
                res[0]=mpp.get(target-nums[i]);
                res[1]=i;
                break;
            }
            mpp.put(nums[i],i);
        }
        return res;
    }
}