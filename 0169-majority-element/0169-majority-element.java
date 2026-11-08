class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        int target=nums.length/2;

        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);

            if(freq.get(nums[i])>target) return nums[i];
        }
        return -1;
    }
}