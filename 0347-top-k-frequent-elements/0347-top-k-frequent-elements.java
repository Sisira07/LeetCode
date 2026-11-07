class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int n=nums.length;

        for(int num:nums){
            mpp.put(num,mpp.getOrDefault(num,0)+1);
        }
        List<Integer>[] bkts=new ArrayList[n+1];

        for(int ele:mpp.keySet()){
            int freq=mpp.get(ele);

            if(bkts[freq]==null){
                bkts[freq]=new ArrayList<>();
            }
            bkts[freq].add(ele);
        }

        int[] res=new int[k];
        int ind=0;

        for(int i=n;i>=1;i--){
            if(bkts[i]!=null){
                for(int num:bkts[i]){
                    res[ind]=num;
                    ind++;
                    if(ind==k) return res;  
                }
            }
        }
        return res;
    }
}