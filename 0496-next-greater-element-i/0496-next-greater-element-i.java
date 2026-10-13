class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk=new Stack<>();
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int[] nge=new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            mpp.put(nums1[i],i);
        }
        
        for(int k=nums2.length-1;k>=0;k--){
            while(!stk.isEmpty() && stk.peek()<=nums2[k]){
                stk.pop();
            }   
            if(stk.isEmpty() && mpp.containsKey(nums2[k])){
                nge[mpp.get(nums2[k])]=-1;
            }
            else if(mpp.containsKey(nums2[k])){
                nge[mpp.get(nums2[k])]=stk.peek();
            }
            stk.push(nums2[k]);
        }
        return nge;
    }
}