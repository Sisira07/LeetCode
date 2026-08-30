class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        List<List<Integer>> res=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            l=i+1;
            r=nums.length-1;
            while(l<r){
            int target=-1*nums[i];
            int sum=nums[l]+nums[r];
            if(sum<target){
                l++;
            }
            else if(sum>target){
                r--;
            }
            else{
                List<Integer> lst=new ArrayList<>();
                lst.add(nums[i]);
                lst.add(nums[l]);
                lst.add(nums[r]);
                res.add(lst);
                l++;
                r--;
               while (l < r && nums[l] == nums[l - 1])  l++;
               while (l < r && nums[r] == nums[r + 1])  r--;
            }
            }
        }
        return res;
    }
}