class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        int maxLen=0;

        for(int num:nums){
            set.add(num);
        }
        for(int num:set){
            int cnt=0;
            if(!set.contains(num-1)){
                while(set.contains(num)){
                    cnt++;
                    num+=1;
                }
            }
            maxLen=Math.max(cnt,maxLen);
        }
        return maxLen;
    }
}