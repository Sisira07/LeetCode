class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int i=0;
        int[] res=new int[2];

        while(i<numbers.length){
            if(mpp.containsKey(target-numbers[i])){
                res[0]=mpp.get(target-numbers[i])+1;
                res[1]=i+1;
                break;
            }
            mpp.put(numbers[i],i);
            i++;
        }
        return res;
    }
}
