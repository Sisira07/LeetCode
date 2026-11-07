class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        int maxLen=0;

        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        for(int num:set){
            if(set.contains(num-1)){
                continue;
            }
            else{
                int ele=num;
                int curlen=1;
                while(set.contains(ele+1)){
                    ele++;
                    curlen++;
                }
                maxLen=Math.max(curlen,maxLen);
            }
        }
        return maxLen;
    }
}