class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stk=new Stack<>();
        int[] ans=new int[nums.length];

        for(int i=nums.length-1;i>=0;i--){
            while(!stk.empty() && stk.peek()<=nums[i]){
                stk.pop();
            }
            if(stk.empty()){
                int done=0;
                for(int j=0;j<i;j++){
                    if(nums[j]>nums[i]){
                        ans[i]=nums[j];
                        done=1;
                        break;
                    }
                }
                if(done==0) ans[i]=-1;
            }
            else{
                ans[i]=stk.peek();
            }
            stk.push(nums[i]);
        }
        return ans;
    }
}