class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk=new Stack<>();
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int[] res=new int[nums1.length];

        for(int i=nums2.length-1;i>=0;i--){
            if(stk.empty()){
                mpp.put(nums2[i],-1);
                stk.push(nums2[i]);
            }
            while(!stk.empty() && stk.peek()<=nums2[i]){
                stk.pop();
            }
            if(!stk.empty()){
                mpp.put(nums2[i],stk.peek());
            }
            else{
            mpp.put(nums2[i],-1);
            }
            stk.push(nums2[i]);
        }
        
        for(int i=0;i<nums1.length;i++){
            res[i]=mpp.get(nums1[i]);
        }
        return res;
    }
}